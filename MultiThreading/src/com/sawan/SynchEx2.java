package com.sawan;

import java.util.Scanner;
class Account
{
     int bal;
       synchronized void deposit(int amt)
        {
            bal=bal+amt;
            System.out.println("Current Bal="+bal);
        }
}//Account---BLC
class Customer extends Thread
{
          Account ac;
         Customer(Account ac)
          {
             this.ac=ac;
             }
           public void run()
          {
                ac.deposit(10); 
        }//run()
 }//Customer---BLC
public class SynchEx2 {

	public static void main(String[] args) {

		//create single object of Account class
		Account ac=new Account();
		//create number of customer objects (threads)
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter number of customers:");
		 int noc=Integer.parseInt(s.nextLine());
		 Customer cu[]=new Customer[noc];
		//give Account class object to Customer objects.
		for (int i=0;i<noc ;i++ )
		{
		cu[i]=new Customer(ac);
		}
		//start the customer objects to deposit Rs 10/- by each
		for (int i=0;i<noc ;i++ )
		{
		cu[i].start();
		}//for 
	}

}
