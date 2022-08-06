package com.multiThread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class JavaCallable implements Callable  
{  
@Override  
public Object call() throws Exception  
{  
// Creating an object of the  Random class   
     Random randObj = new Random();  
  
    // generating a random number between 0 to 9  
     Integer randNo = randObj.nextInt(10);  
  
    // the thread is delayed for some random time  
     Thread.sleep(randNo * 1000);  
  
    // return the object that contains the   
    // generated random number  
      return randNo;  
}  
}
public class JavaCallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		// FutureTask is the concrete class  
	    // creating an array of 5 objects of the FutureTask class  
	    FutureTask[] randomNoTasks = new FutureTask[10];  
	    
	    // loop for spawning 10 threads  
	    for (int j = 0; j < 10; j++)  
	    {  
	      // Creating a new object of the JavaCallable class  
	      Callable clble = new JavaCallable();  
	    
	      // Creating the FutureTask with Callable  
	      randomNoTasks[j] = new FutureTask(clble);  
	    
	      // Since FutureTask implements Runnable,   
	      // one can create a Thread  
	      // with a FutureTask object  
	      Thread th = new Thread(randomNoTasks[j]);  
	      th.start();  
	    }  
	    
	    // loop for receiving the random numbers  
	    for (int j = 0; j < 10; j++)  
	    {  
	  
	      // invoking the get() method  
	      Object o = randomNoTasks[j].get();  
	        
	      // The get method holds the control until the result is received  
	      // The get method may throw the checked exceptions  
	      // like when the method is interrupted. Because of this reason  
	      // we have to add the throws clause to the main method  
	        
	       // printing the generated random number  
	      System.out.println("The random number is: " + o);  
	  
	    }  

	}

}
