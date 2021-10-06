public class Person 
{
	String name;
	String gender;
	String emailid;
	long phone;

	Person(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}
	Person(String name,String gender,String emailid)
	{
		this(name,gender);
		this.emailid=emailid;
	}
	Person(String name,String gender,String emailid,long phone)
	{
		this(name,gender,emailid);
		this.phone=phone;
	}
}