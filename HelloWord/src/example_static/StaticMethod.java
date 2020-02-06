package example_static;
import java.util.Scanner;
public class StaticMethod {
	 public static int x = 5;
	    public int y;
	     
	    public static void fn() {
	      
	        System.out.println(x);  
	    }
	     
	  
	   public void fn2() {
	        System.out.println(y);
	        System.out.println(x);
	    }
	     
	    public static void main(String[] args) {
	        StaticMethod.fn();  
	        StaticMethod staticMethod = new StaticMethod();
	        staticMethod.fn2();
	    }
	
}
