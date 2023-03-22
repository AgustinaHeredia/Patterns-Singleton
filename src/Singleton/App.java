package Singleton;

import java.util.Scanner;

public class App {
	private static final Scanner input = new Scanner(System.in);
    private static final Undo undo = Undo.getInstance();
    
	public static void main(String[] args) {
		
		int option=0;
		do {
            System.out.println("Introduce una opción:");
            System.out.println("1. Añadir pedido");
            System.out.println("2. Eliminar último pedido");
            System.out.println("3. Listar pedidos");
            System.out.println("4. Salir");

            option = input.nextInt();
            
            switch(option){
            	case 1 : 
            	System.out.println("Introduce el pedido: ");
                String pedido = input.nextLine();
                undo.addPedido(pedido);
                break;
            	case 2 :
            	undo.removePedido();
            	break;
            	case 3:
            	undo.listaPedidos();
            	break;
            	case 4:
            	System.out.println("Has elegido salir del programa");
            	break;
            	default:
            	System.out.println("Opción no válida");
            }
            
            
        }while (option !=4);

	}

}
