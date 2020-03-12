import java.io.*;
import java.util.*;

/* CSV�t�@�C���̓ǂݍ��݂Ə����o�����s���N���X
 * �\�[�g������write���\�b�h�̒��ɂ���܂��B
 * 
 */
public class WorkFile{
    public static List<Student> read(){
        File inputfile = new File("Test.csv");
        List<Student> studentList = new ArrayList<Student>();
        
        try(BufferedReader readFile = new BufferedReader(new FileReader(inputfile))){
            String line; 
            
            while((line = readFile.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                Student john = new Student();
                
                john.setNumber(st.nextToken(","));
                john.setName(st.nextToken(","));
                john.setTeam(st.nextToken(","));
                john.setAge(Integer.parseInt(st.nextToken(",")));
                john.setScore(Integer.parseInt(st.nextToken(",")));
                
                // List�ɒǉ�
                studentList.add(john);
            }
            
            
        }catch(Exception e){
            // �G���[�̈����������킩���ĂȂ�
            e.printStackTrace();
        }
        
        return studentList;
    }
    
    public static void write(int selectItem, boolean trueAscending, List<Student> studentList){
        
        String fileName = "";
        
        switch(selectItem){
        case 0:
            Collections.sort(studentList, new ComparatorNumber());
            fileName = "�ԍ�����";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "�ԍ��~��";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
            break;
        case 1:
            Collections.sort(studentList, new ComparatorTeam());
            fileName = "�N���X����";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "�N���X�~��";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
            break;
        case 2:
            Collections.sort(studentList, new ComparatorAge());
            fileName = "�N���";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "�N��~��";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
            break;
        default:
            Collections.sort(studentList, new ComparatorScore());
            fileName = "�N���";
            if(!(trueAscending)){
                Collections.reverse(studentList);
                fileName = "�N��~��";
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
        Write.csv(fileName, studentList);

    }
}


