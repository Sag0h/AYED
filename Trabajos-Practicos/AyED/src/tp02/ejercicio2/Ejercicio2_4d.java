package tp02.ejercicio2;

public class Ejercicio2_4d {

    public static void main(String[] args) {
        Integer[] arreglo = {1,2,3,10,50,20};
        ListaEnlazadaGenerica<Integer> lInt = new ListaEnlazadaGenerica<Integer>();

        lInt.comenzar();

        lInt.agregar(arreglo);

        while(!lInt.fin()){
            System.out.println(lInt.proximo());
        }

    }

}
