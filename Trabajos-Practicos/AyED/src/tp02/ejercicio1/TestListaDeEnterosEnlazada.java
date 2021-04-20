package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {
    public static void main(String[] args) {

        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

        lista.comenzar();
        for(int i=0; i<args.length; i++){
            lista.agregarInicio(Integer.parseInt(args[i]));
        }
        if(!lista.esVacia()) {
            for (int i = 1; i < lista.tamanio()+1; i++) {
                System.out.println(lista.elemento(i));
            }
        }

    }
}
