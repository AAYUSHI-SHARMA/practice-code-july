package practice;
class Employee{
	int id;
	String name;
	float salary;
	void insert(int i,String n,float s){
		id=i;
		name=n;
		salary=s;
	}
	void display(){System.out.println(id+"  "+name+"  "+salary);
	}
}
public class TestEmployee {

	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.insert(1001,"Aayushi Sharma",300000);
		e2.insert(1002,"Apar Sharma",300000);
		e3.insert(1003,"Ravi Sharma",300000);
		e1.display();
		e2.display();
		e3.display();

	}

}
