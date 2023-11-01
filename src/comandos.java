import java.util.Scanner;

public class comandos {

	public static void main(String[] args) {
		int varInt; 
		double varDouble; 
		String varString; 
		String varFrase;
		float varFloat; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite uma frase: ");
		varFrase = input.nextLine();
		System.out.println("Sua frase:" + varFrase);
		
		System.out.println("Digite um Int: ");
		varInt = input.nextInt();
		System.out.println("int:" + varInt);
		
		System.out.println("Digite um Double: ");
		varDouble = input.nextDouble();
		System.out.println("double:" + varDouble);
		
		System.out.println("Digite um float: ");
		varFloat = input.nextFloat();
		System.out.println("float:" + varFloat);

	}

}
