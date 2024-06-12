package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhijeet");
		al.add("Don");
		al.add("Utkarsh");
		al.add("Harsh");
		al.add("Aakash");
		int count = 0;
		for(int i=0;i<al.size();i++) {
			String actual = al.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Number of count via normal java code "+count);
		streamFilter();
		System.out.println("------------------------");
		countFilter();
		System.out.println("------------------------");
		streamMap();
		System.out.println("-----------------");
//		merge();
		System.out.println("-----------------");
		getUnique();
	}
	@org.testng.annotations.Test
	public static void countFilter() {
		Stream.of("Abhijeet","Don","Utkarsh","Harsh","Aakash").filter(s->s.length()>4).forEach(s->System.out.println(s)); //Abhijeet Utkarsh Harsh Aakash
		Stream.of("Abhijeet","Don","Utkarsh","Harsh","Aakash").filter(s->s.length()>4).limit(1).forEach(s-> System.out.println("Only one "+s)); //Abhijeet
	}
	@org.testng.annotations.Test
	static public void streamFilter() {
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Abhijeet");
//		al.add("Don");
//		al.add("Utkarsh");
//		al.add("Harsh");
//		al.add("Aakash");
		//Step1: convert the whole list into streams
//		al.stream();//converted to stream
//		//Step2: apply filter method to apply filter conditions
//		Long c = al.stream().filter(s->s.startsWith("A")).count();
//		System.out.println("Number of count via lambda expression "+c);
		
//		Another way of doing this task
		long d = Stream.of("Abhijeet","Don","Utkarsh","Harsh","Aakash").filter(s->s.startsWith("A")).count();
		System.out.println(d);
	}
	@org.testng.annotations.Test
	static public void streamMap() {
		//print names where last aphate is "a" with Uppercase
		Stream.of("Abhijeet","Don","Utkarsh","Harsha","Aakasha").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print name where first letter is a with uppercase and in sorted order
		System.out.println("-----------");
		Stream.of("Abhijeet","Don","Utkarsh","Harsha","Aakasha").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println("Sorted "+s));	
	}
	@org.testng.annotations.Test
	static public void merge() {
		Stream<String> name = Stream.of("Abhijeet","Don","Utkarsh","Harsha","Aakasha");
		Stream<String>names = Stream.of("Aarti","Ravi","Rishab");
		Stream<String>merged = Stream.concat(name, names);
		merged.forEach(s->System.out.println(s));
		boolean flag = merged.anyMatch(s->s.equalsIgnoreCase("Don"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	public static void toList() {
		 List<String>ls= Stream.of("Abhijeet","Don","Utkarsh","Harsha","Aakasha").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
		
	}
	public static void getUnique() {
		Stream str=Stream.of(1,2,2,3,44,44,5,6,1,10,22,22);
		str.distinct().forEach(s->System.out.println(s));
	}
	
}
