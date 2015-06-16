package arrays;

public class Programowanie {

	public final static char prog[] = {'p', 'r', 'o', 'g'
			, 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
	
	public static void first_capital() {
		
		for (int i = 0; i < prog.length; i++) {
			char c = prog[i];
			
			if (i == 0) {
				
				c = Character.toUpperCase(c);
				
			}
			
			System.out.print(c);
			
			
		}
		
		System.out.print('\n');
		
	}
	public static void all_capital() {
		
		
		for (char c : prog) {
			
			System.out.print(Character.toUpperCase(c));
			
		}
		
		System.out.print('\n');
	}
	
	public static void reverse() {
		
		for (int i = prog.length - 1; i >= 0; i--) {
			
			System.out.print(prog[i]);
			
			
		}
		System.out.print('\n');
	}
	
	public static void swap() {
		
		int indx = 0;
		int n  = prog.length;
		int tail = n-1-indx;
		
		char swapped[] = new char[n];
		
		
		while (indx <= tail) {
			
			swapped[indx] = prog[tail];
			swapped[tail] = prog[indx];
					
			indx++;
			tail = n-1-indx;
		}
		
		System.out.println(swapped);
		
	}
	
	
	public static void main(String[] args) {
		
		first_capital();
		all_capital();
		reverse();
		swap();
		
	}

}
