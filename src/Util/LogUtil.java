package Util;


public class LogUtil{
	

	
	public static void println(Class<?> t,String s){
	
		
		System.out.println("ClassName="+t.getClass().getSimpleName()+
				"  "+"The Message is"+s);
	}

}
