/*  ���[�U���I�񂾍��ڂƎ�ʂŃ\�[�g����v���O�����B
 *  ���C�������͂Ȃ�ׂ��Ȍ��ɂ��܂���
 *  
 */
import java.util.List;

public class CsvSort{
	public static void main(String[] args){
		
		if (args.length == 1){
			String choice = args[0];
			Option.output(choice);
		}
		
		//  ���ڂ�ǉ�������Input��Make��ύX���邱��
		System.out.println("���בւ��������ڂ͉��ł����H");
		System.out.print("[0:�ԍ� 1:�N���X 2:�N�� 3:�_��] > ");
		int selectItem = Input.checkInt(3);

		//  ���ڂ�ǉ�������Input��Make��ύX���邱��
		System.out.println("���בւ���ʂ��w�肵�Ă�������");
		System.out.print("[0:���� 1:�~��] > ");
		boolean trueAscending = Input.checkBoolean();
		
		// �ǂݎ������������Student�^�̃��X�g���쐬����B
		// �\�[�g��write()�̒��ōs���Ă���
		List<Student> studentList = WorkFile.read();
	    System.out.println(" �ԍ�     ���O             �N���X   �N��   �_��");
		WorkFile.write(selectItem,trueAscending,studentList);
		
	}
}


