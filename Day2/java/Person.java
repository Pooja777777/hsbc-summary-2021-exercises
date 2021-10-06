public class Person 
{
	int name;
	String gender;
	String emailid;
	long phone;

	Person(int name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}
	Person(int name,String gender,String emailid)
	{
		this.name=name;
		this.gender=gender;
		this.emailid=emailid;
	}
	Person(int name,String gender,String emailid,long phone)
	{
		this.name=name;
		this.gender=gender;
		this.emailid=emailid;
		this.phone=phone;
	}
}