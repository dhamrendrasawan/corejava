import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class USTClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		//char arg[]=
     String s11="freedom";
    // String strchar="";
    for(int i=0;i<s11.length();i++)
    {
    	//strchar=strchar+s11.charAt(i);
    	list1.add(s11.charAt(i)+"");
    }
    
   //  list1.add(Arrays.asList(arg+""));
    //list1.add(strchar);
     
    List<String> keylist=new  ArrayList<String>();
    List<String> klist=new  ArrayList<String>();
   Map<String,Long> nochar=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   System.out.println(nochar);
  Iterator listv= nochar.keySet().iterator();
  while
   
   for()
     
    
	}

}
