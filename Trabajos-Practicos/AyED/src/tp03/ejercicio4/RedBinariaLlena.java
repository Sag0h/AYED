package tp03.ejercicio4;

import tp03.ejercicio1y2.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;
	
	public int getMax(ArbolBinario<Integer> a) {
		int max1 = a.getDato();
		int max2 = a.getDato();
		
		if(!a.esHoja()) {
			max1 += getMax(a.getHijoIzquierdo());
			max2 += getMax(a.getHijoDerecho());
		}
		
		return Math.max(max1, max2);
	}
		

	
	public int retardoReenvio() {
		return this.getMax(arbol);
	}
}
