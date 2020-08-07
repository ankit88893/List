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
        
        System.out.println("printing list of set");
       
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            
            Student student = iterator.next();
            
            System.out.println("element  age =" + student.getAge() + "rollno=:- " + student.getRollno());
        }
        
      List<Student> stdAge= new ArrayList<Student>(set);
      System.out.println("printing list of set greater than 21");
    
      display(stdAge);
	}
      
      public void display(List<Student> stdAge) {
    	  for(Student std : stdAge) {
    		  int age= std.getAge();
    		  if(age>21)
    		  {
    			  System.out.print(age);
    		  }
    	  }
    	  
      }
       
    }

