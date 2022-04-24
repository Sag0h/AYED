package tp032021.ejercicio4;

import tp032021.ejercicio1y2.ArbolBinario;

public class RedBinariaLlena {
	ArbolBinario<Integer> red;
	
	public RedBinariaLlena() {
		red = new ArbolBinario<Integer>();
	}
	
	public RedBinariaLlena(ArbolBinario<Integer> arbolLleno) {
		red = arbolLleno;
	}

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
		return this.getMax(red);
	}
}
