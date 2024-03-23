package calculadora;

import java.util.HashMap;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
			
			Number n1 = new Number();
			
			boolean keep = true;
			
			while (keep) {
				
				double x = 0;
				double y = 0;
				int operation = 5;
				
				System.out.println("Digite a operação que deseja realizar: "
				+                             "\n1 para soma"
				+                             "\n2 para subtração"
				+                             "\n3 para multiplicação"
				+                             "\n4 para divisão"
				+                             "\n5 para sair do programa");
				
				operation = scanner.nextInt();
				
				if (operation == 5) {	
					keep = false;
					return;
				}
				
				System.out.println("Informe o valor do primeiro número: ");
				x = scanner.nextDouble();
				
				System.out.println("Informe o segundo valor: ");
				y = scanner.nextDouble();
				
				switch (operation) {
					case 1: 
						calculate(operation, n1.sum(x, y), x, y);
						break;
					case 2: 
						calculate(operation, n1.subtraction(x, y), x, y);
						break;
					case 3: 
						calculate(operation, n1.multiplication(x, y), x, y);
						break;
					case 4: 
						calculate(operation, n1.division(x, y), x, y);
						break;
				}
			}
				scanner.close();
	}
	
	static void calculate(int operation, double result, double x, double y) {
		
		HashMap<Integer, String> mapOperation = new HashMap<>();
		
		mapOperation.put(1, "somado");
		mapOperation.put(2, "subtraido");
		mapOperation.put(3, "multiplicado");
		mapOperation.put(4, "dividido");
		
		System.out.println("\n O resultado de " + x + mapOperation.get(1) + " por " +
		x + " é igual a " + result + "\n");
	}
}
