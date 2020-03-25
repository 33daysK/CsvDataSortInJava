package data;

/**
 *  Studentを定義するクラスです。
 *  getter, setterを定義しています。
 *  toString()は画面表示フォーマットのため変更してありますので注意してください。
 *
 *  @auther:33daysK
 *  @version バージョン1.1 2020/03/24
 *  number：生徒番号
 *  name  ：名前
 *  team  ：所属クラス。適切な英単語がClassでありjavaで使うには少々ややこしかったためteamとしました。
 *  age   ：年齢
 *  score ：点数
 */
public class Student{
    private String number;
    private String name;
    private String team;
    private int age;
    private int score;
    
    public String getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }
    public String getTeam(){
        return this.team;
    }
    public int getAge(){
        return this.age;
    }
    public int getScore(){
        return this.score;
    }
    
    public void setNumber(String nu){
        this.number = nu;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setTeam(String t){
        this.team = t;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void setScore(int s){
        this.score = s;
    }
    // 日本語が混じるとフォーマットできないため対策のメソッド
    // 空白を文字数分上下させて吸収しています
    private static String formatName(int length, String beforeName){
        int nameLength = beforeName.length();
        return String.format("%-"+(length-nameLength)+"s", beforeName);
    }

    // 画面には下記のような形で出力されます。
    // "0001"  "ほげ　ふが"        "Ａ"     2歳  100点
    public String toString(){
        String formatstr = String.format("%-8s", this.number);
        
        // 名前対策
        formatstr += formatName(22, this.name);
        
        formatstr += String.format("%-5s %3d歳 %4d点", this.team, this.age, this.score);
        return formatstr;
    }
}
