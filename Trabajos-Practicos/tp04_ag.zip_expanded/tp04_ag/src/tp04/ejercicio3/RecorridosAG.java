package tp04.ejercicio3;

import tp02.ejercicio3.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAG {

	
	private static void numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if(!a.esVacio()) {
			if((a.getDato() % 2 != 0) && (a.getDato() > n) ) {
				l.agregarFinal(a.getDato());
			}
			if(a.tieneHijos()) {
				for(int i=1; i<=a.getHijos().tamanio(); i++) {
					numerosImparesMayoresQuePreOrden(a.getHijos().elemento(i), n, l);
				}
			}
		}
	}
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.comenzar();
		RecorridosAG.numerosImparesMayoresQuePreOrden(a, n, lista);
		return lista;
	}

	private static void numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if(!a.esVacio()) {
			if(a.tieneHijos()) {
				numerosImparesMayoresQueInOrden(a.getHijos().elemento(1), n, l);
			}
			if((a.getDato() % 2 != 0) && (a.getDato() > n) ) {
				l.agregarFinal(a.getDato());
			}
			if(a.tieneHijos()) {
				for(int i=2; i<=a.getHijos().tamanio(); i++) {
					numerosImparesMayoresQueInOrden(a.getHijos().elemento(i), n, l);
				}
			}
		}
	}
	
	public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.comenzar();
		RecorridosAG.numerosImparesMayoresQueInOrden(a, n, lista);
		return lista;
	}
	
	private static void numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> l) {
		if(!a.esVacio()) {
			if(a.tieneHijos()) {
				for(int i=1; i<=a.getHijos().tamanio(); i++) {
					numerosImparesMayoresQueInOrden(a.getHijos().elemento(i), n, l);
				}
			}
			if((a.getDato() % 2 != 0) && (a.getDato() > n) ) {
				l.agregarFinal(a.getDato());
			}
		}
		
	}
	
	public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.comenzar();
		RecorridosAG.numerosImparesMayoresQuePostOrden(a, n, lista);
		return lista;
	}


	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.comenzar();
		
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		if(!a.esVacio()) {
			cola.encolar(a);
			cola.encolar(null);
			while(!cola.esVacia()) {
				ArbolGeneral<Integer> dato = cola.desencolar();
				if(dato != null) {
					if((dato.getDato() % 2 != 0) && (dato.getDato() > n) ) {
						lista.agregarFinal(a.getDato());
					}
					if(dato.tieneHijos()) {
						for(int i=1; i<=dato.getHijos().tamanio(); i++) {
							cola.encolar(dato.getHijos().elemento(i));
						}
					}
				}else {
					cola.encolar(null);
				}
			}
			
		}
		
		return lista;
	}


	
}
