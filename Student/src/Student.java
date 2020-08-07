public class Student {
	
	private int age;
	private String rollno;
	
	Student(int age, String rollno){
		

	this.age=age;
	this.rollno= rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	  @Override
	    public int hashCode() {
	        return age;
	    }
	    @Override
	    public boolean equals(Object arg) {
	        if(this==arg) {
	            return true;
	        }

	        if(arg==null || !(arg instanceof Student) ) {
	            return false;
	        }

	        Student that=(Student) arg;
	        boolean isequal=this.age==that.age;
	        return isequal;
	    }

}
