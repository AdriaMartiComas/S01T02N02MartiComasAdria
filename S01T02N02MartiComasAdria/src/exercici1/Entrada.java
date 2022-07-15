package exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El nombre de tipus byte és: " + llegirByte("Introdueix un nombre de tipus byte", sc) + "\n");

		System.out.println("El nombre de tipus enter és: " + llegirInt("Introdueix un nombre de tipus enter", sc) + "\n");

		System.out.println("El nombre de tipus float és: " + llegirFloat("Introdueix un nombre de tipus float", sc) + "\n");

		System.out.println("El nombre de tipus double és: " + llegirDouble("Introdueix un nombre double:", sc) + "\n");

		System.out.println("El caracter introduit és: " + llegirChar("Introdueix un caracter", sc) + "\n");
		
		System.out.println("La frase introduida és: " + llegirString("Introdueix una frase: ", sc)+ "\n");
		
		System.out.println("La resposta introduida és: " + llegirSiNo("Introdueix si o no: ", sc));
	}

	public static byte llegirByte(String missatge, Scanner sc) {
		byte n = 0;
		boolean correctInput = false;
		do {
			System.out.print(missatge + " ");
			
			try {
				n = sc.nextByte();
				sc.nextLine();
				correctInput = true;

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				correctInput = false;
				sc.nextLine();
			}
			
		} while (correctInput == false);
		
		return n;
	}

	public static int llegirInt(String missatge, Scanner sc) {
		int n = 0;
		boolean correctInput = false;
		do {
			System.out.print(missatge + " ");
			
			try {
				n = sc.nextInt();
				sc.nextLine();
				correctInput = true;

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				correctInput = false;
				sc.nextLine();
			}
			
		} while (correctInput == false);
		
		return n;
	}

	public static float llegirFloat(String missatge, Scanner sc) {
		float n = 0;
		boolean correctInput = false;
		do {
			System.out.print(missatge + " ");
			
			try {
				n = sc.nextFloat();
				sc.nextLine();
				correctInput = true;

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				correctInput = false;
				sc.nextLine();
			}
			
		} while (correctInput == false);
		
		return n;
	}

	public static double llegirDouble(String missatge, Scanner sc) {
		double n = 0;
		boolean correctInput = false;
		do {
			System.out.print(missatge + " ");
			
			try {
				n = sc.nextDouble();
				sc.nextLine();
				correctInput = true;

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				correctInput = false;
				sc.nextLine();
			}
			
		} while (correctInput == false);

		return n;
	}
	
	public static char llegirChar(String missatge, Scanner sc){
		char n = '0';
		boolean correctInput = false;
		do {
			System.out.print(missatge + " ");
			
			try {
				String s = sc.nextLine();
				if (s.length() != 1) {
					throw new Exception("Error de format");
				}
				n = s.charAt(0);
				correctInput = true;

			} catch (Exception e) {
				System.out.println("Error de format");
				correctInput = false;
			}
			
		} while (correctInput == false);

		return n;
		
	}

	public static String llegirString(String missatge, Scanner sc) {
		String n = "";
		boolean correctInput = false;
		do {
			System.out.print(missatge + " ");
			
			try {
				n = sc.nextLine();
				if (n.equals("")) {
					throw new Exception("Error de format");
				}
				correctInput = true;

			} catch (Exception e) {
				System.out.println("Error de format");
				correctInput = false;
			}
			
		} while (correctInput == false);

		return n;
	}

	public static boolean llegirSiNo(String missatge, Scanner sc) {
		char n = '0';
		boolean correctInput = false, siNo = false;
		
		do {
			System.out.print(missatge + " ");
			
			try {
				n = sc.next().charAt(0);
				if (n != 's' && n != 'n') {
					throw new Exception("Error de format");
				}
				correctInput = true;

			} catch (Exception e) {
				System.out.println("Error de format");
				correctInput = false;
			}
			
		} while (correctInput == false);

		if (n == 's') {
			siNo = true;
		}
		return siNo;
		
	}
	

}
