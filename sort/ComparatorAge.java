package sort;

import data.Student;

import java.util.Comparator;

/**
 *  ComparatorAgeクラス
 * 
 *  @author:33daysK
 *  @version バージョン1.1 2020/03/24
 *  Collections.sort()を使うための前提条件となるメソッド。
 *  Age（年齢）を評価しています。
 */
public class ComparatorAge implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        int age1 = number1.getAge(); 
        int age2 = number2.getAge();
        
        if (age1 > age2){
            return 1;
        }else if (age1 < age2){
            return -1;
        }
        return 0;
	}
}
