import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Siguiente nodo");
            System.out.println("3. Nodo anterior");
            System.out.println("4. Imprimir nodo actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Introduce el valor: ");
                    int value = scanner.nextInt();
                    list.insert(value);
                    break;
                case 2:
                    list.next();
                    break;
                case 3:
                    list.previous();
                    break;
                case 4:
                    list.printCurrent();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (choice != 0);

        scanner.close();
    }
}
