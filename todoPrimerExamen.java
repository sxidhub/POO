import java.util.Scanner; //Para inputs
import java.util.ArrayList; //Para array
import java.util.Hashtable; //Para hash
import java.util.Random; //Para random

public class todoPrimerExamen {
    public static void main(String[] args) {
            
        //Scanner
        System.out.print("Ingresa tu edad: ");
        Scanner lector = new Scanner(System.in);
        int edad = lector.nextInt(); //nextLine para str
        lector.close();
        System.out.println("Tu edad es: "+edad);
        System.out.println("Te faltan "+edadParaAdulto(edad)+" años para tener 18");

        //Array
        ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();
        arrayNumeros.add(10);
        arrayNumeros.add(0,9);
        System.out.println(arrayNumeros);
        /*
        .add(numero) o .add(index,numero)
        .set(pos,numero)
        .size()
        .get(index)
        .isEmpty()
        .contains(num)
        */
            

        //Hashs
        Hashtable<Integer,String> dicsionario = new Hashtable<Integer,String>();
        dicsionario.put(322080869, "Said");
        dicsionario.put(127, "Vanessa");
        System.out.println(dicsionario);
        /*
        .put(key,value)
        .get(key)
        .remove(key)
        .containsKey(key)
        .containsValue(value)
        .size()
        .isEmpty()
        .clear()
        .keySet() para keys
        .values() para values
        */

            
        //Random
        int semilla = 1;
        Random aleatorio = new Random(semilla);
        int valorRandom = aleatorio.nextInt(2,4); //(num) para 0-num, () para todo el rango
        System.out.println(valorRandom);


        //Args
        //System.out.println(args[0]);
        ArrayList<String> arrayArgs = new ArrayList<String>();
        for (String entrada : args) {
            arrayArgs.add(entrada);
        }
        System.out.println(arrayArgs);


        //Objeto
        Coche cochePapa = new Coche("Nissan", "Sentra", 2018);
        cochePapa.mostrarInfo();

    }


    //Funcion
    public static int edadParaAdulto(int edad){
        if (edad>=18){
            System.out.println("Ya eres adulto!");
            return 0;
        }
        return 18-edad;
    }


    //Clase
    public static class Coche {
        String marca;
        String modelo;
        int anio;

        // Constructor, se llama automáticamente cuando se crea un nuevo objeto de tipo Coche
        public Coche(String marca, String modelo, int anio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }

        // Método para mostrar la información del coche
        public void mostrarInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + anio);
        }
    }
}
