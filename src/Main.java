public class Main {
    public static void main(String[] args) {

        //------------PRIMERA PARTE--------------------
        //llamar la funcion dandode valores
        int resultado = suma(4, 2, 4);
        System.out.println("El resultado de la primera parte es: " + resultado + "\n");


        //----------------SEGUNDA PARTE----------------
        coche miCoche = new coche(); //Objeto Micoche
        miCoche.AumentarPuertas(); //aumeto de puertas
        miCoche.AumentarPuertas();
        System.out.println("El numero de Puertas es: " + miCoche.NumPuertas);

    }
    //------------PRIMERA PARTE--------------------
    //Funcion con 3 parametros que se sumen entre si
    public static int suma(int a, int b, int c){
        return a +b + c;
    }
}
//----------------SEGUNDA PARTE----------------
//Clase coche
class coche{

    //variable Numero de puertas
    public int NumPuertas = 0;

    //funcion incremento Numero de puertas
    public void AumentarPuertas() {
        this.NumPuertas++;
    }
}