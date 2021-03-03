package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(metodoConcatenacion("Hola"," Luis"));
//System.out.println(metodoCaracter('6'));
//System.out.println(metodoRepresentacionDecimal('a'));
		metodoCadenaNumerosDescendente(51,5);
	}
	
	static String metodoConcatenacion(String cadena1, String cadena2) {
		String cadena3=cadena1+cadena2;
		return cadena3;	
	}
	
	static char metodoCaracter(int numero) {
		char caracter=(char)(numero+'0');
		return caracter;
	}
	
	static int metodoRepresentacionDecimal(char caracter) {
		int numero=(int)caracter;
		return numero;
	}
	
	static void metodoCadenaNumerosDescendente(int numeroReferencia, int numeroDescendiente) {
		int i=numeroReferencia;
		System.out.println(numeroReferencia);
		do {
			numeroReferencia=numeroReferencia-numeroDescendiente;
			System.out.println(numeroReferencia);
			i=i-numeroDescendiente;
			}while(i>numeroDescendiente);
		
	}
	
	
	
}
