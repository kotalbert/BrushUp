package strings;

import static java.lang.System.*;

public class Programowanie {

	public static final String prog = "programowanie";
	
	
	public static void capital_first() {
		
		for (int i = 0; i < prog.length(); i++) {
			
			char c = prog.charAt(i);
			if (i == 0) {c = Character.toUpperCase(c);} 
			
			out.print(c);
			
		}
		
		out.print('\n');
		
		
	}
	public static void capital_all() {
		
		for (int i = 0; i < prog.length(); i++) {
			
			char c = prog.charAt(i);
			
			
			out.print(Character.toUpperCase(c));
			
		}
		
		out.print('\n');
		
	}
	
	public static void reverse() {
		
		char prog_char[] =  prog.toCharArray();
		
		for (int i = prog_char.length - 1; i >= 0 ; i--) {
			
			char c = prog_char[i];
			out.print(c);
		}
		
		out.print('\n');
		
	};
	
	public static void main(String[] args) {
		
		reverse();
		capital_first();
		capital_all();
	}

}
