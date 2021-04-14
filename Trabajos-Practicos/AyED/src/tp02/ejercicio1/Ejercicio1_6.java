package tp02.ejercicio1;

public class Ejercicio1_6 {

    public static int calcular(int n){
        if(n > 1) {
            n = n % 2 == 0 ? (n / 2) : (n * 3 + 1);
        }
        return n;
    }


    public static ListaDeEnterosEnlazada calcularSucesion(int n){
        ListaDeEnterosEnlazada l;

        l = n > 1 ? calcularSucesion(calcular(n)) : new ListaDeEnterosEnlazada();

        l.agregarInicio(n);

        return l;
    }


    public static void main(String[] args) {

        ListaDeEnterosEnlazada l = calcularSucesion(5);

        for(int i=1; i <= l.tamanio(); i++){
            System.out.print(l.elemento(i)+ " ");
        }
    }
}
