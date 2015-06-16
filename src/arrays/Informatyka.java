package arrays;

public class Informatyka {
	
	public final static char inf[] = {'I','n', 'f', 'o', 'r',
		'm','a','t','y','k','a'};
	
	public static void print_v(){
		
		System.out.println("print_v:");
		for (char c : inf) {
			
			System.out.println(c);
		}
		
	}
	
	public static void print_h() {
		
		System.out.println("print_h:");
		for (char c : inf) {
			
			System.out.print(c);
		}
		
		System.out.print('\n');
	}
	
	public static void print_V() {
		
		System.out.println("print_V:");
		for (char c : inf) {
			
			c = Character.toUpperCase(c);
			System.out.println(c);
		}
		
		
	}
	
	public static void print_H() {
		
		System.out.println("print_h:");
		for (char c : inf) {
			
			c = Character.toUpperCase(c);
			System.out.print(c);
		}
		
		System.out.print('\n');
	}
	
	public static void main(String[] args) {
		
		print_v();
		print_V();
		
		print_h();
		print_H();

	}

}
