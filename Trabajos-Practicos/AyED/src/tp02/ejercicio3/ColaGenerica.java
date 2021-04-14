package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {
    private ListaGenerica<T> datos;

    public ColaGenerica() {
        datos = new ListaEnlazadaGenerica<T>();

    }

    public void encolar(T elem){
        datos.agregarInicio(elem);
    }

    public T desencolar(){
        T aux = datos.elemento(datos.tamanio());
        datos.eliminarEn((datos.tamanio()));
        return aux;
    }

    public T tope(){
        return datos.elemento(datos.tamanio());
    }

    public boolean esVacia(){
        return datos.esVacia();
    }

}
