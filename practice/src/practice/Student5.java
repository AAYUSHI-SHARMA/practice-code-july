package practice;

public class Student5 {
int id;
String name;
int Age;
Student5(int i,String n){
	id=i;
	name=n;
}
Student5(int i, String n,int a){
	id=i;
	name=n;
	Age=a;
}
void display(){System.out.println(id+" "+name+" "+Age);}
	public static void main(String[] args) {
Student5 s1=new Student5(111,"aayushi");
Student5 s2=new Student5(222,"apar",10);
s1.display();
s2.display();
	}

}
