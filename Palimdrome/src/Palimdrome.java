
public class Palimdrome {

	public static void main(String[] args) {
		
		String str="MADAM";
	    String rev="";
	    StringBuilder sd=new StringBuilder();
	    
		for(int i=str.length()-1;i>=0;i--)
		{
			//rev=rev+str.charAt(i);
			sd.append(str.charAt(i));
		}
		rev=sd.toString();
		System.out.println("rv="+rev);
		if(str.equals(rev))
		{ 
			System.out.println("Polimdrome");
		}
		else
		{
			System.out.println("Not polimdrome");
		}
	}

}
