package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1y2.ArbolBinario;

public class ContadorArbol {
	private ArbolBinario<Integer> arbol;
	
	public ContadorArbol() {
		arbol = new ArbolBinario<Integer>();
	}
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		arbol = a;
	}
	
	public ContadorArbol(Integer n) {
		arbol = new ArbolBinario<Integer>(n);
	}
	
	private void paresInOrden(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> a) {
		if(!a.esVacio()) {
			if(a.tieneHijoIzquierdo()) {
				paresInOrden(l,a.getHijoIzquierdo());
			}
			if(a.getDato() % 2 == 0) {
				l.agregarFinal(a.getDato());
			}
			if(a.tieneHijoDerecho()) {
				paresInOrden(l,a.getHijoDerecho());
			}
		}
	}
	
	private void paresPostOrden(ListaEnlazadaGenerica<Integer> l, ArbolBinario<Integer> a) {
		if(!a.esVacio()) {
			if(a.tieneHijoIzquierdo()) {
				paresPostOrden(l,a.getHijoIzquierdo());
			}
			
			if(a.tieneHijoDerecho()) {
				paresPostOrden(l,a.getHijoDerecho());
			}
			
			if(a.getDato() % 2 == 0) {
				l.agregarFinal(a.getDato());
			}
		}
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares(){
		ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		ArbolBinario<Integer> aux = arbol;
		
		// usar el metodo de recorrido que quiera comentando el otro 
		
		this.paresInOrden(l, aux);	// el metodo recursivo InOrden
		this.paresPostOrden(l, aux); // el metodo recursivo PostOrden
		return l;
	}


	
	
	
}
