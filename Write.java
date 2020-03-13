import java.io.*;
import java.util.*;

/* CSVファイルを出力するメソッド
 * 
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



