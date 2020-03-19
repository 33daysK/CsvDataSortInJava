import java.util.Comparator;

/**
 *  ComparatorAgeクラス
 * 
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/16
 *  Collections.sort()を使うための前提条件となるメソッド。
 *  Team（クラス）を評価しています。
 */
public class ComparatorTeam implements Comparator<Student>{
    public int compare (Student number1, Student number2){
        String team1 = number1.getTeam(); 
        String team2 = number2.getTeam();
        
        if (team1.compareTo(team2)>0)
            return 1;
        if (team1.compareTo(team2)<0)
            return -1;
        return 0;
    }
}
