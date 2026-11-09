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
                    System.out.println(" \n  LISTA DE REFERENCIAS \n ");
                    int cont =1;
                    for (String prenda : referencias){
                        if (prenda != null) {
                            System.out.println(cont + ". " + prenda);
                            cont++;
                        }
                    }
                    break;

                case 2 :
                     System.out.println("  BUSCAR REFERENCIA ");
                     System.out.println("Qué prenda deseas buscar?");
                     String buscada = sc.nextLine();
                     boolean existe = buscarReferencia(referencias, buscada); 

                     if ()
                    break;
                
                case 3:
                    System.out.println("\n  AGREGAR REFERENCIA  ");
                    System.out.print("Ingrese el nombre de la nueva prenda: ");
                    String nuevaPrenda = sc.nextLine();

                    boolean insertado = false;

                    // Recorremos con un for tradicional para poder modificar la posición del arreglo
                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] == null) {
                            referencias[i] = nuevaPrenda;
                            insertado = true;
                            System.out.println("¡Prenda '" + nuevaPrenda + "' agregada con éxito!");
                            break; 
                            // Salimos del ciclo para no insertarla en las demás casillas vacías
                        }
                    }

                    if (!insertado) {
                        System.out.println("El inventario está lleno. No se pueden agregar más referencias.");
                    }
                    break;


                case 4 :
                     System.out.println("Gracias por elegirnos \n Un feliz día ");
                    break;
                default:
                     System.out.println("Opción no válida");
            }


            } while (opcion != 4);

            sc.close();
    }

    // Función para buscar la referencia en el arreglo
    public static boolean buscarReferencia(String[] arreglo, String nombreRef) {
        for (String ref : arreglo) {
            if (ref != null) {
                if (ref.equalsIgnoreCase(nombreRef)) {
                    return true;
                }
            }
        }
        return false;

        
}