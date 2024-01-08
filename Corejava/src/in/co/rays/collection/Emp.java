package in.co.rays.collection;

public class Emp  implements Comparable<Emp>{

	private int id;
	private String name;
	private int salary;
	
	public Emp (int id, String name , int salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	
	}
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

	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " +name+ " "+ salary+"";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Emp)) {
			return false ;
	}
		Emp e = (Emp)obj;
		boolean b = this.id==e.id && this.name==e.name && this.salary== e.salary;
		return b;
	}
	
	@Override
	public int hashCode() {
		String str= this.id + this.name + this.salary;
		return str.hashCode();
	}
	
	@Override
	public int compareTo(Emp o) {
		int i = this.name.compareTo(o.name);
		//if (i ==0) {
		//	return this .salary=o.salary;
		//}
		return 0;
	}
	
	

	

}
