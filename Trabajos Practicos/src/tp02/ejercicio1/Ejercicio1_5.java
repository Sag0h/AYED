package tp02.ejercicio1;

public class Ejercicio1_5 {

    public static void imprimirListaInversoRec(ListaDeEnterosEnlazada l, int aux){
        if(aux < l.tamanio()){
            imprimirListaInversoRec(l, ++aux);
            System.out.println(l.elemento(aux));
        }
    }

    public static void main(String[] args) {
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

        lista.comenzar();
        for(int i=0; i<args.length; i++){
            lista.agregarFinal(Integer.parseInt(args[i]));
        }
        if(!lista.esVacia()) {
            int aux = 0;
            imprimirListaInversoRec(lista,aux);
        }

    }
}
