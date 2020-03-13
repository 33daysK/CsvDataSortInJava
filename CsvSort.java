/**  
 *  ここがメインクラスです。
 *  
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/13
 *  ユーザがソート方法を選んで、読み込んだデータをソートします。
 *  ソートしたデータはCSV形式ファイルと画面に出力します。
 *  メイン部分はなるべく簡潔にしたかったのでほとんどの操作はほかのクラスが担当しています。
 */
import java.util.List;

public class CsvSort{
	public static void main(String[] args){
		
		if (args.length == 1){
			String choice = args[0];
			Option.output(choice);
		}
		
		System.out.println("並べ替えたい項目は何ですか？");
		System.out.print("[0:番号 1:クラス 2:年齢 3:点数] > ");
		int selectItem = Input.checkInt(3);
		  
		System.out.println("並べ替え種別を指定してください");
		System.out.print("[0:昇順 1:降順] > ");
		boolean isAscending = Input.checkBoolean();
		
		// この出力文字列の間のスペースはデータをそろえるためのものです。
		// 少々強引ですがいい方法を思いつきませんでした。
		List<Student> studentList = WorkFile.read();
	    System.out.println(" 番号     名前             クラス   年齢   点数");
		WorkFile.write(selectItem,isAscending,studentList);
		
	}
}


