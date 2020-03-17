
public class Employee {
	int id;
	String name;
	String dept;
	Employee(int id){
		this.id=id;
	}
	Employee(String name){
		this.name=name;
	}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	Employee(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("dept is "+dept);
	}
}
