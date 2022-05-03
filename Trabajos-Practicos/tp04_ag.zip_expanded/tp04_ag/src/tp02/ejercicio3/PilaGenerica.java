package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> {
    private ListaGenerica<T> datos;

    public PilaGenerica() {
        datos = new ListaEnlazadaGenerica<>();
    }
    
    public PilaGenerica(ListaEnlazadaGenerica<T> l) {
    	datos = l;
    }

    public void apilar(T elem){
        datos.agregarInicio(elem);
    }

    public T desapilar(){
        T aux = datos.elemento(1);
        datos.eliminarEn(1);
        return aux;
    }

    public T tope(){
        return datos.elemento(1);
    }

    public boolean esVacia(){
        return datos.esVacia();
    }

}
