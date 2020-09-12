package recursion.tecnique;

public class Primo {

	int cont = 1;
	int num = 20;
	int suma = 0;
	

	public static void main(String[] args) {
		
		if (primo(1, 18, 0)) {
			System.out.println("El número es primo");
		}
		else {
			System.out.println("El número no es primo");
		}
		
		
		
		} 
		

	public static boolean primo(int cont, int num, int suma) {
		int mod = 0;
		
		if(cont>num) {
			return suma == 2;
			
		}else {
			mod = num % cont;
			if (mod == 0) {
				suma ++;
			}
			
		}
		
		
		
		return primo(cont+1, num, suma);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

		

	
}
