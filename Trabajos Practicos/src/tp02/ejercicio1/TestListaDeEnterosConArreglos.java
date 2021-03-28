package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {
    public static void main(String[] args) {
        ListaDeEnterosConArreglos lista= new ListaDeEnterosConArreglos();
        lista.comenzar();
        for(int i=0; i<args.length; i++){
            lista.agregarFinal(Integer.parseInt(args[i]));
        }
        if(!lista.esVacia()) {
            for (int i = 1; i < lista.tamanio(); i++) {
                System.out.println(lista.elemento(i));
            }
        }
    }
}
