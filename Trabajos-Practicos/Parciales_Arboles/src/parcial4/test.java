package parcial4;
import librerias.*;

public class test {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> a1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(5);
		a.agregarHijoIzquierdo(a1);
		a.agregarHijoDerecho(a5);
		ArbolBinario<Integer> a8 = new ArbolBinario<Integer>(8);
		a5.agregarHijoDerecho(a8);
		
		a1.agregarHijoIzquierdo(new ArbolBinario<Integer>(16));
		a1.agregarHijoDerecho(new ArbolBinario<Integer>(6));
		a8.agregarHijoIzquierdo(new ArbolBinario<Integer>(22));
		
		ListaGenerica<Integer> l = Parcial.resolver(a);
			
		for(int i=1; i<=l.tamanio(); i++) {
			System.out.print(l.elemento(i));
			if(i<l.tamanio()) {
				System.out.print(" - ");
			}else {
				System.out.print("\n");
			}
		}
		
	}

}
