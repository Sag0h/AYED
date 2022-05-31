package parcial2;

import librerias.*;

public class NivelArbol {
	private ArbolBinario<Integer> arbol;
	
	public NivelArbol() {
		this.arbol = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(5);
		this.arbol.agregarHijoIzquierdo(a7);
		this.arbol.agregarHijoDerecho(a5);
		a7.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);
		a7.agregarHijoDerecho(a6);
		a6.agregarHijoIzquierdo(new ArbolBinario<Integer>(5));
		a6.agregarHijoDerecho(new ArbolBinario<Integer>(11));
		ArbolBinario<Integer> a9 = new ArbolBinario<Integer>(9);
		a5.agregarHijoDerecho(a9);
		a9.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		arbol.printPorNiveles();
	}
	
	
	public ArbolBinario<Integer> minEnNiveldeAB(int n){
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		int nivel = 0;
		ArbolBinario<Integer> min = null;
		int minValor = 9999;
		cola.encolar(arbol);
		cola.encolar(null);
		while((!cola.esVacia()) && (nivel <= n)) {
			ArbolBinario<Integer> aux = cola.desencolar();
			if(aux != null) {
				if(nivel == n) {
					if(aux.esHoja()) {
						if(aux.getDato() < minValor) {
							minValor = aux.getDato();
							min = aux;
						}
					}
				}
				if(aux.tieneHijoIzquierdo()) {
					cola.encolar(aux.getHijoIzquierdo());
				}
				if(aux.tieneHijoDerecho()) {
					cola.encolar(aux.getHijoDerecho());
				}	
			}else {
				nivel++;
				if(!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}
		return min;
	}
	
}
