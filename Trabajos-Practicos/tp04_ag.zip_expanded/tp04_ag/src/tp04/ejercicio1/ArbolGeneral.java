package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		if(this.esHoja()) {
			return 0;
		}
		int cont = 1;
		if(this.tieneHijos()) {
			int max = -1;
			for(int i=1; i<=this.getHijos().tamanio(); i++) {
				if(this.getHijos().elemento(i).altura() > max) {
					max = this.getHijos().elemento(i).altura();
				}
			}
			cont += max;
		}
		return cont;
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		if(this.getDato() == dato) return 0; 
		int nivel = 0;
		boolean encontre = false;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia() && !encontre) {
			ArbolGeneral<T> arbol = cola.desencolar();
			if(arbol != null) {
				if(arbol.getDato() == dato) {
					encontre = true;
				}else {
					if(arbol.tieneHijos()) {
						for(int i=1; i<=arbol.getHijos().tamanio(); i++) {
							cola.encolar(arbol.getHijos().elemento(i));
						}
					}
				}
			}else {
				if(!cola.esVacia()) cola.encolar(null);
				nivel++;
			}
		}
		if(!encontre) {
			return -1;
		}
		return nivel;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		int maxNodos = 0;
		int nivel = 0;
		int nivelMax = 0;
		cola.encolar(this);
		cola.encolar(null);
		int nodosNivel = 0;
		while(!cola.esVacia()) {
			ArbolGeneral<T> arbol = cola.desencolar();
			if(arbol != null) {
				if(arbol.tieneHijos()) {
					nodosNivel += arbol.getHijos().tamanio();
					for(int i=1; i<=arbol.getHijos().tamanio(); i++) {
						cola.encolar(arbol.getHijos().elemento(i));
					}
				}
			}else {
				if(!cola.esVacia()) cola.encolar(null);
				nivel++;
				if(nodosNivel >= maxNodos) {
					maxNodos = nodosNivel;
					nivelMax = nivel;
				}
				nodosNivel = 0;
			}
		}
		return nivelMax;
	}
	
	public void inOrden() {
		if(!this.esVacio()) {
			if(this.tieneHijos()) {
				this.getHijos().elemento(1).inOrden();
			}
			System.out.print(this.getDato()+" - ");
			for(int i=2; i<=this.getHijos().tamanio(); i++){
				this.getHijos().elemento(i).inOrden();
			}
		}
	}

}