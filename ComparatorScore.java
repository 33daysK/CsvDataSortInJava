import java.util.Comparator;

/* �\�[�g���s�̂��߂̔�r�����̃��\�b�h
 * �X�R�A��
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
