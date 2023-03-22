package java.classWork;

class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		}
	void display()
	{
		System.out.println("Roll: "+roll+"name: "+name);
	}
	}

public class Paramiter_cons {

	public static void main(String[] args) {
		Student monojit=new Student(111,"Subhendu");
		monojit.display();
		Student mangaldeep=new Student(112,"Das");
		mangaldeep.display();
		
	}

}