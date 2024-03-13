package Exception_Handling_Concept;
import java.util.Arrays;
class Employee implements Comparable
{
int id;
String name;
double salary;
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public String toString()
{
	return"Employee [id=" +id+",name="+name + ",salary=" +salary+"]";
}
public int comparaTo(Object o)
{
	Employee e=(Employee)o;
	return this.id - e.id;
}
}
public class Mainclass {
	public static void main(String[] args) {
		Employee e1=new Employee(5,"Mala",350);
		Employee e2=new Employee(2,"Sheela",250);
		Employee e3=new Employee(1,"Parimala",150);
		Employee e4=new Employee(3,"Susheeaa",550);
		
		Employee[] arr={e1,e2,e3,e4};
		for(Employee a:arr){
		System.out.println(a);
	}
		Arrays.sort(arr);
		System.out.println("after sorting");
		for(Employee a:arr)
		{
		System.out.println(a);
         }
		}
	}
