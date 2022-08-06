package com.sawan.MapReduceIntermadiate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapReduceExample {

	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
        

        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println("for each= "+sum);
        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("mapToInt= "+sum1);
        
        Integer reduceSum =numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println("reduceSum "+reduceSum);
        


        Optional<Integer> reduceSumWithMethodReference =numbers.stream().reduce(Integer::sum);
        System.out.println("reduceSumWithMethodReference.get() ="+reduceSumWithMethodReference.get());

        Integer mulResult =numbers.stream().reduce(1, (a,b)->a*b);
        System.out.println("mulResult= "+mulResult);
        
        Integer maxvalue =numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("maxvalue= "+maxvalue);


        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println("maxvalueWithMethodReference ="+maxvalueWithMethodReference);

        String longestString =words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println("longestString= "+longestString);


        //get employee whose grade A
        //get salary
        double avgSalary = EmployeeDatabase.getEmployees().stream().filter(employee -> employee.getGrade().
        		equalsIgnoreCase("A")).map(employee -> employee.getSalary())
                .mapToDouble(p->p).average().getAsDouble();
                 
        System.out.println("avgSalary= "+avgSalary);
        


        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("sumSalary= "+sumSalary);

        /*double sumSalary = */EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary()).forEach(p->System.out.println(p));
                
       // System.out.println("sumSalary= "+sumSalary);
        
        /*double sumSalary = */EmployeeDatabase.getEmployees().stream()
        .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
        .map(employee -> employee.getSalary()).forEach(p->System.out.println(p));
        
        List<Double> listemp= EmployeeDatabase.getEmployees().stream()
        .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
        .map(employee -> employee.getSalary()).collect(Collectors.toList());
        System.out.println("listemp= "+listemp);



        
	}

}
