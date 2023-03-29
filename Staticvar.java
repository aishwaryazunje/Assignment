package assignment;

public class Staticvar {
	int rollno;
	String name;
	float fee;
	static String college="MIT";
	//contructor
	Staticvar(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	// method\
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Staticvar1{// cls 2
		
	public static void main(String args[])
	{
		// object 
		Staticvar s1=new Staticvar(102,"ram",5000);
		Staticvar s2=new Staticvar(222,"sham",3000);
		s1.display();
		s2.display();
	
	}
	}
	

}
