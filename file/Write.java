package file;

import data.Student;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;

import java.util.List;
import java.util.StringTokenizer;
/**
 *  Writeクラス。メソッドはcsv()のみ
 * 
 *  @auther:33daysK
 *  @version バージョン1.1 2020/03/24
 *  カンマ区切りでデータをファイルに記入しています。
 *  ファイルネームとリストはsort.SortListから引き渡された
 *  ソート済みのリストと定義済みの名前を使用しています。
 */
public class Write{
    public static void csv(String filename, List<Student> studentList){
        // sortListから引き渡されたファイル名に.csvを追加しています。
        String csvName = filename + ".csv";
        
        try(FileWriter writefile = new FileWriter(csvName, false);
            PrintWriter pw = new PrintWriter(new BufferedWriter(writefile));){
                
                for(Student pen : studentList){
                    pw.print(pen.getNumber() + ",");
                    pw.print(pen.getName() + ",");
                    pw.print(pen.getTeam() + ",");
                    pw.print(pen.getAge() + ",");
                    pw.print(pen.getScore() + ",");
                    pw.println(); // 改行の挿入
                }
                
        }catch(Exception e){
            // エラーの扱いが正直わかってない
            e.printStackTrace();
        }
        
    }
}



