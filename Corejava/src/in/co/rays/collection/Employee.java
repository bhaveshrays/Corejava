package in.co.rays.collection;


public class Employee {
	
		
		private int id =0;
		private String name =null;
		private int salary =0;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		

public Employee (int id, String name, int salary) {

	
this.id = id;
this.name= name;
this.salary =salary;
}


@Override
public String toString() {
// TODO Auto-generated method stub
return (id+ ""+ name+""+salary);
}
}