package sort;

import data.Student;

import java.util.Comparator;
/**
 *  ComparatorAgeクラス
 * 
 *  @auther:33daysK
 *  @version バージョン1.1 2020/03/24
 *  Collections.sort()を使うための前提条件となるメソッド。
 *  Number（番号）を評価しています。
 */
public class ComparatorNumber implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        String num1 = number1.getNumber(); 
        String num2 = number2.getNumber();
        
        if (num1.compareTo(num2)>0)
            return 1;
        if (num1.compareTo(num2)<0)
            return -1;
        return 0;
	}
}
