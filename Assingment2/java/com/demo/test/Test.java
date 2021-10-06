package com.demo.test;
import com.demo.beans.Account;
import com.demo.beans.Current;
import com.demo.beans.Saving;

public class Test {

	public static void main(String[] args) 
	{
		Account a = new Account(1111111,23000,"ABC1111233");
        Current c = new Current(1111111,23000,"ABC1111233","Pooja");
        Saving s = new Saving(1111111,23000,"ABC1111233",10.00);
        display(a);
        display(c);
        display(s);
	}

	private static void display(Account a) 
	{
	  Account x = a;
	  System.out.println(x);
	  if(a instanceof Current)
	  {
		  Current y = (Current)a;
		  System.out.println(y);
	  }
	  if(a instanceof Saving)
	  {
		  Saving z = (Saving)a;
		  System.out.println(z);
	  }
	}

}
