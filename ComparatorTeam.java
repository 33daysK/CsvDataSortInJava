import java.util.Comparator;

/* �\�[�g���s�̂��߂̔�r�����̃��\�b�h
 * �N���X��
 * 
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
