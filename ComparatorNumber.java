import java.util.Comparator;

/* �\�[�g���s�̂��߂̔�r�����̃��\�b�h
 * ���k�ԍ���
 * 
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
