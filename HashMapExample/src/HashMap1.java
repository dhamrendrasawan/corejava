import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
	String s="My name is Dhamrendra My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra  My name is Dhamrendra";   
		
	int linecap=5;
	
	show(s,linecap);

	}
  public static void show(String s,int n)
  {
	  String strarg[]=s.split(" ");
	  int len=strarg.length;
	  
	  int line1=len/5;
	  int count=0;
	  for(int i=0;i<len;i++)
	  {
		  count++;
		  if(count%5==0)
		  {
			  System.out.println(strarg[i]+" ");
		  }
		  else
			  System.out.print(strarg[i]+" ");
	  }
	  
  }
}
