/*  ユーザが選んだ項目と種別でソートするプログラム。
 *  メイン部分はなるべく簡潔にしました
 *  
 */
import java.util.List;

public class CsvSort{
	public static void main(String[] args){
		
		if (args.length == 1){
			String choice = args[0];
			Option.output(choice);
		}
		
		//  項目を追加したらInputとMakeを変更すること
		System.out.println("並べ替えたい項目は何ですか？");
		System.out.print("[0:番号 1:クラス 2:年齢 3:点数] > ");
		int selectItem = Input.checkInt(3);

		//  項目を追加したらInputとMakeを変更すること
		System.out.println("並べ替え種別を指定してください");
		System.out.print("[0:昇順 1:降順] > ");
		boolean trueAscending = Input.checkBoolean();
		
		// 読み取った情報を元にStudent型のリストを作成する。
		// ソートはwrite()の中で行っている
		List<Student> studentList = WorkFile.read();
	    System.out.println(" 番号     名前             クラス   年齢   点数");
		WorkFile.write(selectItem,trueAscending,studentList);
		
	}
}


