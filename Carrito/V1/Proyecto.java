import java.util.ArrayList;
import java.util.Scanner;


public class Proyecto{
    public static void main(String[] args) {
        ArrayList<Carrito> miCarro = new ArrayList<Carrito>();


        agregarObjeto("Jabon", 34, miCarro);
        agregarObjeto("Lampara", 150, miCarro);
        agregarObjeto("Pepino", 20, miCarro);

        System.out.println("Carrito completo:");   
        mostrarCarrito(miCarro);

        System.out.println("\nCarrito sin "+miCarro.get(0).articulo+":");
        miCarro.remove(0);
        mostrarCarrito(miCarro);

        
        int opcion,indice;
        float precio;
        String articulo;
        Scanner e = new Scanner(System.in);
        do{
            System.out.println("\n\nMenu de compras");
            System.out.println("1) Agregar objeto\n2) Eliminar objeto\n3) Mostrar carrito\n4) Salir");
            opcion = e.nextInt();
            e.nextLine(); //Si no se buguea el scanner
            switch (opcion) {
                case 1:
                    System.out.print("\nNombre del articulo: ");
                    articulo = e.nextLine();
                    System.out.print("Precio del articulo: ");
                    precio = e.nextFloat();
                    e.nextLine();
                    agregarObjeto(articulo, precio, miCarro);
                    System.out.println("--Articulo añadido-- ");
                    break;
                case 2:
                    mostrarCarrito(miCarro);
                    System.out.print("\nIndice de elemento a eliminar: ");
                    indice = e.nextInt();
                    e.nextLine();
                    if(indice>=1&&indice<=miCarro.size()){
                        miCarro.remove(indice-1);
                        System.out.println("--Elemento eliminado--: ");
                        break;
                    }
                    System.out.println("--Indice fuera de rango--: ");
                    break;
                case 3:
                    System.out.println("\nCarrito completo: ");
                    mostrarCarrito(miCarro);
                    break;
                case 4:
                    System.out.println("--Saliendo del programa--: ");
                    break;
                default:
                    System.out.println("--Opcion invalida--");
            }
        }while(opcion!=4);


    }

    public static void mostrarCarrito(ArrayList<Carrito> carrito){
        for(int i = 0; i<carrito.size();i++){
            System.out.print((i+1)+") ");
            carrito.get(i).contenido();
        }
    }

    public static ArrayList<Carrito> agregarObjeto(String articulo, float precio, ArrayList<Carrito> carrito){
        Carrito obj = new Carrito(articulo,precio);
        carrito.add(obj);
        return carrito;
    }
}