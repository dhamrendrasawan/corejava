import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		   Hashtable<String,Integer> marks=new Hashtable<String,Integer>();
		   marks.put("Sawan",100);
		   marks.put("Raja",300);
		   marks.put("DK",400);
		   marks.put("Mohan",500);
		   marks.put("Sohan",600);
		   marks.put("Raju",700);
		   marks.put("Sohan1",600);
		   marks.put("Raju1",700);
		   marks.put("Sohan2",600);
		   marks.put("Raju3",700);
		   marks.put("Raju5",700);//11
		  System.out.println("size1 ="+marks.size());
		   marks.put("Sohan9",600);
		   marks.put("Raju10",700);
		   marks.put("Raju11",700);
		   marks.put("Sohan333",600);
		   marks.put("Raju990",700);
		   
		   System.out.println(marks.get("Sawan"));
		   System.out.println(marks.get("Raju"));
		   System.out.println(marks.get("Mohan"));

	}

}
