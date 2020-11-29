package com.testing.string;

public class LearningString {

	public static void main(String[] args) {
//mutable = use concat()==> join two String together
		String a = "sarower";// non primitive data type==> String pool/ String literal/literal pool
		a.concat("Ahmmed");//not changed ==> immutable
		
		System.out.println(a);//not changed

		String obj = new String("Azam");// Store Heap
		obj.concat("Ahmmed");//Not work==> immutable
		System.out.println(obj);

		// StringBuffer & StringBuilder ==> both class
// no concat() method , but similar method append()
		StringBuffer bf = new StringBuffer("Farhan");//Heap
		bf.append("Ahmmed");//mutable
		System.out.println(bf);
		
		StringBuilder bd = new StringBuilder("Amin");//Heap
		bd.append("Ahmmed");//mutable
		System.out.println(bd);
	}

}
