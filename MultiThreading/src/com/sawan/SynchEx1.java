package com.sawan;

class Teacher
{
    synchronized void table(int n)
    {
       if(n<=0)
      {
          System.out.println(n+" is invalid input:");
        }
      else
      {
          System.out.println("------------------------------------------------");
           System.out.println("Mul Table for :"+n);
           System.out.println("------------------------------------------------");
           System.out.println("------------------------------------------------");
           for (int i=1;i<=10 ;i++ )
          {
              System.out.println(n+" x "+i+" ="+n*i);
         }//for
         System.out.println("------------------------------------------------");
}//else
}//table()
}//Teacher---BLC
class Student1 extends Thread
{
       Teacher t;
       Student1(Teacher t )
       {
                this.t=t;
        }
public void run()
{
         t.table(12);
}
}//Student1---BLC
class Student2 implements Runnable
{
       Teacher t1;
       Student2(Teacher x)
         {
             t1=x;
        } 
        public void run()
        {
             t1.table(19);
         }
}//Student2---BLC
class Student3 implements Runnable
{
     Teacher t1;
      Student3(Teacher t1)
       { 
           this.t1=t1;
        }
       public void run()
        {
           t1.table(9);
        }
}//Student3---BLC
class Student4 extends Thread
{
        Teacher t1;
      Student4(Teacher x)
       {
             t1=x;
         }
        public void run()
         {
             t1.table(-19);
   }
}//Student4-----BLC
public class SynchEx1 {

	public static void main(String[] args) {

		System.out.println("No. of active threads in the begining of therogram:(78) "+Thread.activeCount());
				//cerate single object of Teacher 
				Teacher t=new Teacher();
				//create Student1, Student2, Student3 classes objects---thread objs
				Student1 st1=new Student1(t);
				Student2 st2=new Student2(t);
				Student3 st3=new Student3(t);
				Student4 st4=new Student4(t);
				//start the threads for displying mul tables.
				st1.start();
				//st1.start();
				//st2.start();
				//st3.start();
				Thread st21=new Thread(st2);
				Thread st31=new Thread(st3);
				st21.start();
				st31.start();
				st4.start();
				System.out.println("No. of active threads after start(95): "+Thread.activeCount());
				try
				{
				st1.join();
				st21.join();
				 st31.join();
				st4.join();
				}catch(InterruptedException ie)
				{
				 System.out.println("problem in thread exec...");
				}
				System.out.println("No. of active threads after joining:(105) 	"+Thread.activeCount());
	}

}
