import java.util.Comparator;

/* ソート実行のための比較部分のメソッド
 * 年齢編
 * 
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
