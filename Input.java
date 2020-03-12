/*
 * Scanner���o�����������C���ɏ��������Ȃ��̂ŕ����������\�b�h
 * Scanner��trycatch�����ق����������ȂƎv���܂������Ӗ��͂Ȃ���������Ȃ�
 */
import java.util.Scanner;

public class Input{
    
    // ���[�U�̓��͂��󂯕t���܂��B��ȗp�r�͕��ёւ��鍀�ڂ̔���ł��B
    // �ėp�����������Ȃ̂Ő������ώ��ɂ��Ă���܂�
	public static int checkInt(int maxNum){
		int check = -1;
		
		try{
			Scanner scanner = new Scanner(System.in);
			check = scanner.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			throw new IllegalArgumentException("���͓��e���s���ł�");
		}
		
		if(0 <= check && check <= maxNum){
			return check;
		}else{
			throw new IllegalArgumentException("���͓��e���s���ł�");
		}
	}
    
    // �����A�~���𔻒肵�܂�
    // true�Ȃ珸���Afalse�Ȃ�~���Ƃ��Ď�舵���Ă��������B
	public static boolean checkBoolean(){
		int check = -1;
		
		try{
			Scanner scanner = new Scanner(System.in);
			check = scanner.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			throw new IllegalArgumentException("���͓��e���s���ł�");
		}
		
		if(check == 0){
			return true;
		}else if(check == 1){
			return false;
		}else{
			throw new IllegalArgumentException("���͓��e���s���ł�");
		}
	}
}


