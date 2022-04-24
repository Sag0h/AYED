package tp03.ejercicio3;

import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosEnlazada;
import tp03.ejercicio1y2.ArbolBinario;

public class ContadorArbol {
	private ArbolBinario<Integer> arbol;

	public ContadorArbol(ArbolBinario<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	public ArbolBinario<Integer> getArbol() {
		return arbol;
	}

	public void setArbol(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	private void numerosparesInOrden(ArbolBinario<Integer> arbol, ListaDeEnteros lista) {
		if(!arbol.esVacio()) {
			if(arbol.tieneHijoIzquierdo()) this.numerosparesInOrden(arbol.getHijoIzquierdo(), lista);
			if(arbol.getDato() % 2 == 0) {
				lista.agregarFinal(arbol.getDato());
			}
			if(arbol.tieneHijoDerecho()) this.numerosparesInOrden(arbol.getHijoDerecho(), lista);
		}
	}
	
	public ListaDeEnteros numerosParesInOrden() {
		ListaDeEnteros lista = new ListaDeEnterosEnlazada();
		lista.comenzar();
		this.numerosparesInOrden(arbol, lista);
		return lista;
		
	}

	private void numerosparesPostOrden(ArbolBinario<Integer> arbol, ListaDeEnteros lista) {
		if(!arbol.esVacio()) {
			if(arbol.tieneHijoIzquierdo()) this.numerosparesInOrden(arbol.getHijoIzquierdo(), lista);
			if(arbol.tieneHijoDerecho()) this.numerosparesInOrden(arbol.getHijoDerecho(), lista);
			if(arbol.getDato() % 2 == 0) {
				lista.agregarFinal(arbol.getDato());
			}
		}
	}
	
	public ListaDeEnteros numerosParesPostOrden() {
		ListaDeEnteros lista = new ListaDeEnterosEnlazada();
		lista.comenzar();
		this.numerosparesPostOrden(arbol, lista);
		return lista;
	}
	
}
