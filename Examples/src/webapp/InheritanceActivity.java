package webapp;
class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance= 250.80;
	double hra=1000.50;
	Employee(long id,String name ,String address,long phone)
	{
		id=employeeId;
		name=employeeName;
		address=employeeAddress;
		phone=employeePhone;
	}
	public void calculateSalary(double basicSalry)
	{
		 double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *
				hra/100);
		 System.out.println("salary is: "+salary);
	}
	public void  calculateTransportAllowance(double basicSalary)
	{
		double transportAllowance = (10*basicSalary)/100;
		System.out.println("TransportAllowance is "+transportAllowance);
	}
}
class Manager extends Employee
{
	Manager(long id,String name ,String address,long phone,double salary)
	{
		super(126534,"Peter","Chennai India",237844);
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
	}
	public void  calculateTransportAllowance(double basicSalary)
	{
		double transportAllowance = (15*basicSalary)/100;
		System.out.println("TransportAllowance is "+transportAllowance);
	}
}
class Trainee extends Employee
{
	Trainee(long id,String name ,String address,long phone,double salary)
	{
		super(29846,"Jack","Mumbai India",442085);
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
	}
}
public class InheritanceActivity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager=new Manager(126534,"Peter","Chennai India",237844,65000);
		manager.calculateSalary(65000);
		manager.calculateTransportAllowance(65000);
		Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		trainee.calculateSalary(45000);
		trainee.calculateTransportAllowance(45000);
	}

}
