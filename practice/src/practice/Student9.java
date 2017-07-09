package practice;
//static method
public class Student9 {
	int id;
	String name;
	static String college="ITS";
	
	static void change(){
		college="BBDIT";
		
	}
Student9(int i, String n){
	id=i;
	name=n;
}
void display(){System.out.println(id+" "+name+" "+college);
	
}
	public static void main(String[] args) {
Student9.change();

Student9 s1=new Student9(9001,"AAYUSHI");
Student9 s2=new Student9(9002,"APAR");
Student9 s3=new Student9(9003,"RAVI");

s1.display();
s2.display();
s3.display();



}

}
