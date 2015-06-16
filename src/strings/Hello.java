
package strings;

import static java.lang.System.*;


public class Hello {

	public static final String hello = "Dzieñ dobry!";
	
	public static void print_v() {
		
		char c;
		
		for (int i = 0; i < hello.length(); i++) {
			c = hello.charAt(i);
			out.println(c);
		}
		
	}
	public static void print_h(char delim) {
		
		char c;
		
		for (int i = 0; i < hello.length(); i++) {
			c = hello.charAt(i);
			out.print(c);
			out.print(delim);
		}
		out.print('\n');
		
		
	}
	
	public static void main(String[] args) {
		
		print_v();
		print_h('-');

	}

}
