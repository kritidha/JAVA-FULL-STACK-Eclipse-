package assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Employee> list = new ArrayList<>();
			
			list.add(new Employee(1, "Kritidha", "xyz road,panipat", 40000.0));
			list.add(new Employee(2, "Ellie", "abc road , Delhi", 30000.0));
			list.add(new Employee(3, "Jashan", "186 HNO near rajiv chowk,gurugram, India", 50000.0));
			list.add(new Employee(4, "Priyansh", "110 HNo near metro station road,delhi, India", 40000.0));
			
			Iterator<Employee> it = list.iterator();
			int searchId = 2;
			while (it.hasNext()) {
				Employee emp = it.next();
				if (emp.getId() == searchId)
					System.out.println(emp);

			}
		}
	}

