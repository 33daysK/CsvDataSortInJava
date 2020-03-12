import java.util.Comparator;

/* ソート実行のための比較部分のメソッド
 * スコア編
 * 
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
