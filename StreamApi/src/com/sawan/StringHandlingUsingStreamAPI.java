package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringHandlingUsingStreamAPI {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("string length method reference= "+wordLengths);
		
		List<Integer> wordLengths1 = words.stream().map(p->p.length()).collect(Collectors.toList());
		System.out.println("string length1 with lambda= "+wordLengths1);
		
		List<String> list=Arrays.asList("RAMAYANA","RAJAJA");
		
		List<String> uniquelist1=list.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct().
				           collect(Collectors.toList());
		List<String> wordList=Arrays.asList("RAMAYANA");
		System.out.println("uniquelist1= "+wordList);
		
		
		List<String> uniquecharacter=wordList.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct().
				                      collect(Collectors.toList());
		System.out.println("uniquecharacter= "+uniquecharacter);
   //list.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct()       
		
		List<String> wordListdup=Arrays.asList("SSSWWWANNAA");
		List<String> wordLisunique=wordListdup.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		System.out.println("wordLisunique= "+wordLisunique);
		
	}

}
