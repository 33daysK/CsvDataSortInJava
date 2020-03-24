package logic;

/**
 *  Inputクラスです。checkInt checkBoolean の二つのメソッドがあります。
 *
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/13
 *  ユーザーからの入力を受け付ける処理はすべてここに集めています。
 *  Scannerを出す処理をメインに書きたくないので分割しました。
 *  入力項目のチェックも行っています。
 */
import java.util.Scanner;

public class Input{
    
    // ユーザの入力を受け付けます。主な用途は並び替える項目の判定です。
    // 汎用性が高そうなので数字を可変式にしてあります
	public static int checkInt(int maxNum){
		int check = -1;
		
		try{
			Scanner scanner = new Scanner(System.in);
			check = scanner.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			throw new IllegalArgumentException("入力内容が不正です");
		}
		
		if(0 <= check && check <= maxNum){
			return check;
		}else{
			throw new IllegalArgumentException("入力内容が不正です");
		}
	}
    
    // 昇順、降順を判定します
    // trueなら昇順、falseなら降順として取り扱ってください。
	public static boolean checkBoolean(){
		int check = -1;
		
		try{
			Scanner scanner = new Scanner(System.in);
			check = scanner.nextInt();
		}catch(Exception e){
			e.printStackTrace();
			throw new IllegalArgumentException("入力内容が不正です");
		}
		
		if(check == 0){
			return true;
		}else if(check == 1){
			return false;
		}else{
			throw new IllegalArgumentException("入力内容が不正です");
		}
	}
}


