package com.sawan;

public class SortingUsingSingleloop {

	public static void main(String[] args) {

		 int arr[] = {1,9,1,2,1,3,2 ,0};
		 for (int i = 0; i < arr.length - 1; i++)
		    {
		        // Checking the condition for two
		        // simultaneous elements of the array
			    System.out.println("i0="+i);
		        if (arr[i] > arr[i + 1])
		        {
		            // Swapping the elements.
		        	 System.out.println(" in top i1= "+i);
		            int temp = arr[i];
		            arr[i] = arr[i + 1];
		            arr[i + 1] = temp;
		             
		            System.out.println("arr[i] and arr[i+1] "+arr[i]+" "+arr[i+1]);
		            // updating the value of j = -1
		            // so after getting updated for j++
		            // in the loop it becomes 0 and
		            // the loop begins from the start.
		            i = -1;
		            System.out.println(" botom i2= "+i);
		        }
		    }
		 for(int i=0;i<arr.length;i++)
		 {
		    System.out.print(arr[i]);
		 }	
	}
}
