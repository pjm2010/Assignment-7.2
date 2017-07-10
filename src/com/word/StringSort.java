package com.word;
/*This call will order the sentence then order the words*/
import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Takes the sentence and spilts and store in a String Array Tpye
		String s=new String("a lion failed to kill a deer");
		System.out.println("Input String- "+s);
		String[] parts=s.split("\\s");
		//Sorted the parts of the array
		Arrays.sort(parts);
		
		//Initialised the StringBuilder class
		StringBuilder sb=new StringBuilder();
		
			//Appending the parts of the string for sorting
		for(String st:parts){
			sb.append(st);
			sb.append(" ");
		}
		
		//converting into a string
		String sorted=sb.toString().trim();
		
		System.out.println(sorted);
		
		StringBuilder sb1=new StringBuilder();
		
		//Now sorting the letters of the word
		for (String s2:parts){
				char[] words=s2.toCharArray();
				Arrays.sort(words);
			sb1.append(words);
			sb1.append(" ");
				}
	
		String sorted1=sb1.toString().trim();
		//Sorted list gets asssinged and printed
		System.out.println(sorted1);

	}
			
		
		
		
		
				

	}


