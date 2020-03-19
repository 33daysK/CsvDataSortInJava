import java.util.Comparator;

/**
 *  ComparatorAgeクラス
 * 
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/16
 *  Collections.sort()を使うための前提条件となるメソッド。
 *  Score（点数）を評価しています。
 */
public class ComparatorScore implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        int score1 = number1.getScore(); 
        int score2 = number2.getScore();
        
        if (score1 > score2){
            return 1;
        }else if (score1 < score2){
            return -1;
        }
        return 0;
	}
}
