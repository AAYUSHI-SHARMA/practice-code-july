package practice;

public class Student7 {
	int id;
	String name;
	Student7(int i, String n){
		id=i;
		name=n;
	}
	Student7(){}
	void display(){System.out.println(id+" "+name);}

	public static void main(String[] args) {
		Student7 s1=new Student7(9001,"AAYUSHI SHARMA");
		Student7 s2=new Student7();//copying value without using constructor
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();

	}

}
