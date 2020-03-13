/*
 * Studentクラスの定義
 * 
 */
public class Student{
    private String number;
    private String name;
    private String team;
    private int age;
    private int score;
    final String FORMAT_NUMBER = "%-8s";
    final String FORMAT_OTHER = "%-5s %3d歳 %4d点";
    
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
    private static String formatName(String nihongo, int length){
        int nameLength = nihongo.length();
        return String.format("%-"+(length-nameLength)+"s", nihongo);
    }
    
    public String toString(){
        String formatstr = String.format(FORMAT_NUMBER, this.number);
        
        // 名前対策
        formatstr += formatName(this.name, 22);
        
        formatstr += String.format(FORMAT_OTHER, this.team, this.age, this.score);
        return formatstr;
    }
}
