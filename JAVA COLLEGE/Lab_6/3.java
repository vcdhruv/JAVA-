class Member
{
	String name;
	int age;
	int phonenumber;
	String address;
	double salary;

	Member(String name ,int age ,int phonenumber,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
	}
	void Printsalary()
	{
		System.out.println(name+" "+age+" "+phonenumber+" "+ address+" "+salary);
	}
}
class employee extends Member
{
	String specialization;
	employee(String name ,int age ,int phonenumber,String address,double salary, String specialization)
	{
		super(name,age,phonenumber,address,salary);
		this.specialization=specialization;
		System.out.println(specialization);
	}
}
class manager extends Member
{
	String department;
	manager(String name ,int age ,int phonenumber,String address,double salary, String department)
	{
		super(name,age,phonenumber,address,salary);
		this.department=department;
		System.out.println(department);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		employee e =new employee("cvd",34,1370189,"djsgbvj jksdgb",134578,"computer");
		e.Printsalary();
		manager m =new manager("cvd",34,1370189,"djsgbvj jksdgb",134578,"comouter");
		m.Printsalary();
	}
}