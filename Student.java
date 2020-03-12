/*
 * Student�N���X�̒�`
 * 
 */
public class Student{
    private String number;
    private String name;
    private String team;
    private int age;
    private int score;
    final String FORMAT_NUMBER = "%-8s";
    final String FORMAT_OTHER = "%-5s %3d�� %4d�_";
    
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
    // ���{�ꂪ������ƃt�H�[�}�b�g�ł��Ȃ����ߑ΍�̃��\�b�h
    // �󔒂𕶎������㉺�����ċz�����Ă��܂�
    private static String formatName(String nihongo, int length){
        int nameLength = nihongo.length();
        return String.format("%-"+(length-nameLength)+"s", nihongo);
    }
    
    public String toString(){
        String formatstr = String.format(FORMAT_NUMBER, this.number);
        
        // ���O�΍�
        formatstr += formatName(this.name, 22);
        
        formatstr += String.format(FORMAT_OTHER, this.team, this.age, this.score);
        return formatstr;
    }
}


