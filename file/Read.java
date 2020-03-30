package file;

import data.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/**
 *  read クラス　
 *  csv() メソッドがあります
 *
 *  @author:33daysK
 *  @version バージョン1.1 2020/03/24
 *  read()はCsvファイルの中のデータを読み込んでStudentリストの形にします。
 *  write()はユーザの入力どおりにリストをソートしてその結果を画面に出力します。
 *  csvファイル形式に出力するためにwrite()からwrite.csv()にリストを渡しています。
 */
public class Read{
    public static List<Student> csv(){
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
            
            // csvファイルを１行ずつ読み込んで処理していきます。
            // 空欄になったらループが終わります。
            while((line = readFile.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                Student hoge = new Student();
                
                // カンマごとに区切ってデータを取り込んでいきます
                hoge.setNumber(st.nextToken(","));
                hoge.setName(st.nextToken(","));
                hoge.setTeam(st.nextToken(","));
                hoge.setAge(Integer.parseInt(st.nextToken(",")));
                hoge.setScore(Integer.parseInt(st.nextToken(",")));
                
                // Listに追加
                studentList.add(hoge);
            }
            
            
        }catch(Exception e){
            // エラーの扱いが正直わかってない
            e.printStackTrace();
        }
        
        return studentList;
    }    
}


