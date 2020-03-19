import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *  WorkFile クラス　
 *  read() と write() メソッドがあります
 *
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/16
 *  read()はCsvファイルの中のデータを読み込んでStudentリストの形にします。
 *  write()はユーザの入力どおりにリストをソートしてその結果を画面に出力します。
 *  csvファイル形式に出力するためにwrite()からwrite.csv()にリストを渡しています。
 */
public class WorkFile{
    public static List<Student> read(){
        File inputfile = new File("Test.csv");
        List<Student> studentList = new ArrayList<Student>();
        String charset = "UTF-8";
        
        // try-wifh-resouceの中でファイルを読み込む際の宣言をしています。
        // UTF-8で読み込むためにInputStreamを使っています。 
        try(
            FileInputStream fi = new FileInputStream(inputfile);
            InputStreamReader is = new InputStreamReader(fi,charset);
            BufferedReader readFile = new BufferedReader(is);
            ){
            String line; 
            
            // １行ずつ読み込んで処理していきます。
            // 空欄になったらループが終わります。
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


