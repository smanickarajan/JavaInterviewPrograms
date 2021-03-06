package predicatelambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	int sal;
	int exp;
	
	Employee(String name,int sal,int exp){
		this.name=name;
		this.sal=sal;
		this.exp=exp;
	}
}
public class Demo2 {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("manick", 1000, 2));
		list.add(new Employee("Saainesh", 3000, 2));
		list.add(new Employee("Sarrvesh", 2000, 2));
		
		Predicate<Employee> p=e->(e.sal>2000 && e.exp>1);
		
		for (Employee d:list) {
			if(p.test(d)) {
				System.out.println(d.name);
		}

	}

}
}
