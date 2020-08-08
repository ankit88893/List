import java.util.*;

public class MapMain {

    public static void main(String[] args) {

        MapMain demo = new MapMain();
        demo.runApp();
    }

    Map<String, Student> map = new HashMap<>();

    public void runApp() {
        Student student1 = new Student(12, "ank123");
        Student student2 = new Student(13, "kum123");
        Student student3 = new Student(14, "ash123");
        Student student4 = new Student(15, "ramk123");

        map.put("ank123", student1);
        map.put("kum123", student2);
        map.put("ash123", student3);
        map.put("ram123", student4);


        Set<String> keys = map.keySet();
        for (String str : keys) {
            Student fetched = map.get(str);
            if ((fetched.getAge()) % 2 == 0)
                System.out.println("age is even:- " + fetched.getAge());
            else
                System.out.println("age is odd:-  " +fetched.getAge());

          

        }

        System.out.println("list of roll number are-------");


        Collection<Student> values = map.values();

        List<Student> list = new ArrayList<>(values);

        for (Student std : list) {

            System.out.println("rollno= " + std.getRollno());


        }


        //  System.out.println(fetched.getAge()+" "+ fetched.getRollno());


    }
}




