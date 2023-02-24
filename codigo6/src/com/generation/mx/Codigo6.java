public class Codigo6 {
// El nombre de la clase debería empezar con mayúscula

	public static void main(String[] args) {
		// La inicialización del arreglo está correcta
		int[] n = new int[20];

		// Agregar el operador de incremento ++ después de la variable i
		for (int i = 0; i < 20; i++) {
			n[i] = (int) (Math.random() * 381) + 20;
			// El método de impresión debería ser System.out.print
			System.out.print(n[i] + " ");
		}

		// La impresión del mensaje está correcta
		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		// Faltaba cerrar un paréntesis en la línea anterior
		int opcion = Integer.parseInt(System.console().readLine());

		// La condición ternaria está escrita correctamente
		int multiplo = (opcion == 1) ? 5 : 7;

		// El bucle for-each está mal escrito y la variable debería ser de tipo int
		for (int e : n) {
			if (e % multiplo == 0) {
				System.out.print("[" + e + "] ");
			} else {
				System.out.print(e + " ");
			}
		}

	}

}

