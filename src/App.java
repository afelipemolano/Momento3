import java.util.Scanner;

public class App {
    public static void main(String[] args){

        // Definir el arreglo con 5 entradas 

        String[] referencias= {"Camisa Polo","Jean Levis","Tenis Adidas",null,null};
        int opcion = 0;

        // Llamar a Scanner para imprimir

        Scanner sc = new Scanner(System.in);

        // Ciclo para el menú interactivo

        do {
            System.out.println("\n    MENÚ CHEVIGNON  \n");
            System.out.println("1. Listar Referencias");
            System.out.println("2. Buscar Referencia");
            System.out.println("3. Agregar Referencia");
            System.out.println("4. Salir \n");
            System.out.println("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 :
                    System.out.println(" \n  REFERENCIAS \n ");
                    int cont =1;
                    for (String prenda : referencias){
                        if (prenda != null) {
                            System.out.println(cont + ". " + prenda);
                            cont++;
                        }
                    }
                    break;
                case 2 :
                     System.out.println("");
                    break;
                case 3 :
                     System.out.println("");
                    break;
                case 4 :
                     System.out.println("Gracias por elegirnos \n Un feliz día ");
                    break;
                default:
                     System.out.println("Opción no válida");
            }


            } while (opcion != 4);


    }

        
}