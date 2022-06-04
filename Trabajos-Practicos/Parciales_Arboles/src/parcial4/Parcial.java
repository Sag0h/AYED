package parcial4;
import librerias.*;

public class Parcial {
	
	private static int resolver(ArbolBinario<Integer> a, ListaGenerica<Integer> l) {
		if(!a.esVacio()) {
			int desIzq = 0;
			int desDer = 0;
			if(a.tieneHijoIzquierdo()) {
				desIzq++;
				desIzq+=resolver(a.getHijoIzquierdo(), l);
			}
			if(a.tieneHijoDerecho()) {
				desDer++;
				desDer+=resolver(a.getHijoDerecho(), l);
			}
			if(desIzq == desDer) {
				l.agregarInicio(a.getDato());
			}
			return desIzq + desDer;
		}
		return 0;
	}
	
	public static ListaGenerica<Integer> resolver(ArbolBinario<Integer> arbol){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		resolver(arbol, lista);
		return lista;
	}
	
}
