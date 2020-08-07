import java.util.*;

public class SetMain {

    public static void main(String[] args) {
    	SetMain demo = new SetMain();
    	demo.runApp();
    }
    
    public void runApp() {

        Set<Student> set = new LinkedHashSet<>();

        Student student1 = new Student(12, "ank123");
        set.add(student1);
        Student student2 = new Student(134, "antila123");
        set.add(student2);
        Student student3 = new Student(13, "ankur123");
        set.add(student3);
        Student student4 = new Student(12, "a123");
        set.add(student4);
        
        
       
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            
            Student student = iterator.next();
            
            System.out.println("element =" + student.getAge() + " " + student.getRollno());
        }
        
       
       
            
        }


    }