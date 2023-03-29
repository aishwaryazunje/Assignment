package assignment;
import java.util.Scanner;


//problem stmt 1

public class circle {
	public float radius;//declaring instance variable radius
	static float pi=3.5f;
	//default contr 1
	circle()
	{
		radius=1.5f;
	}
//contr 2
	circle(float radius)
	{
		this.radius=radius;
	}
	//contr 3
	 circle (float radius,float pi)
	 {
		 // contr chaining using contr 2
		 this.radius=radius;
	 }
	 //method 1
	 static float calculateCircleArea(float radius)
	 {
		 return pi*radius*radius;
	 }
	 //method 2 
	 static float calculateCircumference(float radius) 
	 {
	 return 2*pi*radius;
}
	 public static void main(String args[])
	 {
		 circle obj=new circle();	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the radius");
		 float radius=sc.nextFloat();
		 System.out.println("the area is : "+calculateCircleArea(radius));
		 System.out.println("the circumference is : "+calculateCircumference(radius));
	 
		 }
}
