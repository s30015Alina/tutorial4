import java.util.*;
public class StudentGroup {
    public String name;
    private  ArrayList<Student> list = new ArrayList<Student>();
    public  void myAdd(Student std){
        if(list.size() > 14){
            throw  new RuntimeException("Max is 15");
        }
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).IndexNumber == std.IndexNumber){
                throw new RuntimeException("Same student");
            }
        }
        list.add(std);
    }
}
