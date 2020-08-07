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
	    public boolean equals(Object obj) {
	        if(this==obj) {
	            return true;
	        }

	        if(obj==null || !(obj instanceof Student) ) {
	            return false;
	        }

	        Student that=(Student) obj;
	        boolean isequal=this.age==that.age;
	        return isequal;
	    }

}
