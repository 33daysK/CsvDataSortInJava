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


