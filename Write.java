import java.io.FileWriter
import java.io.FileReader
import java.io.File
import java.io.PrintWriter
import java.io.BufferedWriter

/**
 *  Writeクラス。メソッドはcsv()のみ
 * 
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/16
 *  カンマ区切りでデータを記入しています。
 *  ファイルネームとリストはWorkfile.write()から引き渡された
 *  ソート済みのリストと定義済みの名前を使用しています。
 */
public class Write{
    public static void csv(String filename, List<Student> studentList){
        String csvName = filename + ".csv";
        
        try(FileWriter writefile = new FileWriter(csvName, false);
            PrintWriter pw = new PrintWriter(new BufferedWriter(writefile));){
                
                for(Student pen : studentList){
                    pw.print(pen.getNumber() + ",");
                    pw.print(pen.getName() + ",");
                    pw.print(pen.getTeam() + ",");
                    pw.print(pen.getAge() + ",");
                    pw.print(pen.getScore() + ",");
                    pw.println();
                }
                
        }catch(Exception e){
            // エラーの扱いが正直わかってない
            e.printStackTrace();
        }
        
    }
}



