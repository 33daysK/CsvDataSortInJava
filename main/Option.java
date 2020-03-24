package main;

/**
 *  オプションを表示するクラスです。
 *
 *  @auther:33daysK
 *  @version バージョン1.0 2020/03/13
 *  if else とswitchならどちらのほうが機能追加が楽か迷いましたが
 *  どちらでもそう大して変わらないだろうと思ったので使い慣れたif else にしました。
 */

public class Option{
	public static void output(String args){
		String option = "";
		option = args;
		
		if(option.equals("-help")){
			System.out.println("アプリケーション「CSVsort」は、CSV形式のファイル内の情報を入力キーを元に並べ替えて結果を表示します。\n");
		}else{
			System.exit(0);
		}
		
	}
	
}

