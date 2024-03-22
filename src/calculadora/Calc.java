package calculadora;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
			
			Number n1 = new Number();
			Number n2 = new Number();
			Number result = new Number();
			
				System.out.printf("Digite valor 1: ");
				n1.setValue(scanner.nextInt());
				System.out.printf("Digite valor 2: ");
				n2.setValue(scanner.nextInt());
				result.setValue(n1.getValue() + n2.getValue());
				System.out.printf("%nA soma de %d com %d é igual a %d", n1.getValue(), n2.getValue(), result.getValue());
				
				scanner.close();

	}

}
