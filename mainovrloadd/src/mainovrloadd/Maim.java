package mainovrloadd;

import java.util.Random;

public class Maim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=main();
		System.out.println("num= "+num);
	}
	public static int main()
	{
		Random num=new Random(1234567890);
		int numvalue=num.nextInt(109999);
		System.out.println(num);
		return numvalue;
	}
	
}
 