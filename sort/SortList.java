package sort;

import data.Student;
import file.Write;

import java.util.Collections;
import java.util.List;
/**
 *  SortList クラス　
 *  student() メソッドがあります
 *
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/24
 *  与えられたソート番号を元に場合わけを行い、リストをソートします。
 *  ソートしたリストはfile.Write.csv()に引き渡されて出力されます。
 *  Switch文をここに集めてほかのメソッドの場合わけを減らしています。
 *
 *  以前はここがfile.Write.csv()メソッドでした。
 *  しかしどう考えてもFileにWriteしてなかったのでリファクタリング時に書き換えました。
 */

public class SortList{
    public static void student(int selectItem, boolean trueAscending, List<Student> studentList){

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