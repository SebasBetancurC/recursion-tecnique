package recursion.tecnique;

public class Mayor {

	public static void main(String[] args) {
		
		
		int[] numeros = {3,7,25,13};
		
		System.out.println("El número mayor es "+funcionMayor(numeros, 0, 0));
		
		

	}
	
	public static int funcionMayor(int[]numeros, int mayor, int i){
		if(i>=numeros.length) {
			return mayor;
		}
		
		if(numeros [i] > mayor){
			mayor = numeros[i];
		}
		
		return funcionMayor(numeros, mayor, ++i);
		
	}
	
	
	

}
