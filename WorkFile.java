import java.io.*;
import java.util.*;

/* CSVファイルの読み込みと書き出しを行うクラス
 * ソート部分はwriteメソッドの中にあります。
 * 
 */
public class WorkFile{
    public static List<Student> read(){
        File inputfile = new File("Test.csv");
        List<Student> studentList = new ArrayList<Student>();
        
        try(BufferedReader readFile = new BufferedReader(new FileReader(inputfile))){
            String line; 
            
            while((line = readFile.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                Student john = new Student();
                
                john.setNumber(st.nextToken(","));
                john.setName(st.nextToken(","));
                john.setTeam(st.nextToken(","));
                john.setAge(Integer.parseInt(st.nextToken(",")));
                john.setScore(Integer.parseInt(st.nextToken(",")));
                
                // Listに追加
                studentList.add(john);
            }
            
            
        }catch(Exception e){
            // エラーの扱いが正直わかってない
            e.printStackTrace();
        }
        
        return studentList;
    }
    
    public static void write(int selectItem, boolean trueAscending, List<Student> studentList){
        
        String fileName = "";
        
        switch(selectItem){
        case 0:
            Collections.sort(studentList, new ComparatorNumber());
            fileName = "番号昇順";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "番号降順";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
            break;
        case 1:
            Collections.sort(studentList, new ComparatorTeam());
            fileName = "クラス昇順";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "クラス降順";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
            break;
        case 2:
            Collections.sort(studentList, new ComparatorAge());
            fileName = "年齢昇順";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "年齢降順";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
            break;
        default:
            Collections.sort(studentList, new ComparatorScore());
            fileName = "年齢昇順";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "年齢降順";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
        Write.csv(fileName, studentList);

    }
}


