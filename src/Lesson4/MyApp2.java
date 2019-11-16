package Lesson4;

import java.sql.Date;

enum Numbers{ONE,TWO,THREE,FOUR,FIVE}

class Quest<T1,T2>{	
}
public class MyApp2<T> {

	
	
	
	public static void main(String[] args) {
Numbers n1 = Numbers.ONE;
Numbers n2 = Numbers.ONE;
if(n1==n2 ) {
	System.out.print("true");
}else{System.out.println("false");}
System.out.println(Numbers.FIVE.ordinal());

//Quest <Object,Integer> obj = new Quest<Integer,Object>();

Quest  obj1 = new Quest();
Quest <Number, Integer> obj2 = new Quest<Integer, Integer>();




	}
// alt shift s  getter i setter
	
	
	
}

