package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(metodoConcatenacion("Hola"," Luis"));
System.out.println(metodoCaracter('1'));
	}
	
	static String metodoConcatenacion(String cadena1, String cadena2) {
		String cadena3=cadena1+cadena2;
		return cadena3;	
	}
	
	static char metodoCaracter(int numero) {
		char caracter=(char)(numero+'0');
		return caracter;
	}
	
	
	
}
