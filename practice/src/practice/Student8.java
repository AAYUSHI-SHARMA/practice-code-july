package practice;
//example of static variable.
public class Student8 {
	int rollno;
	String name;
	static String college="ITS";
Student8(int r,String n){
	rollno=r;
	name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
	public static void main(String[] args) {
Student8 s1=new Student8(9001,"AAYUSHI");
Student8 s2=new Student8(9002,"APAR");
s1.display();
s2.display();
	

	}

}
