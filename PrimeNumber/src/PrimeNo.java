
public class PrimeNo {
	
	public static void main(String[] args) {      
		int count=0;
		int arr[]={13,90,45,97};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println("prime= "+arr[i]);
			}
			count=0;
		}
	}

}
