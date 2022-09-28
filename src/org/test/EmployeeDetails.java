package org.test;

public class EmployeeDetails {
	public static void main(String[] args) {
		String s = "Siva";
		String s1 = "Parama";
		//contains
		boolean contains = s.contains("va");
		System.out.println(contains);
		//replace
		String replace = s.replace("Siva", "Skgd");
		System.out.println(replace);
		//replaceAll
		String replaceAll = s.replaceAll("Siva", "==========");
		System.out.println(replaceAll);	
		//startswith
		boolean startsWith = s.startsWith("Siva");
		System.out.println(startsWith);
		//endswith
		boolean endsWith = s.endsWith("va");
		System.out.println(endsWith);
		//is empty
		boolean empty = s.isEmpty();
		System.out.println(empty);
		//trim
		String trim = s.trim();
		System.out.println(trim);
		//substring
		String substring2 = s.substring(2, 4);
		System.out.println(substring2);
		//substring - 2
		String substring = s.substring(3);
		System.out.println(substring);
		//compareTo
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
	}
}
