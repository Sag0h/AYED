package parcial3;

import librerias.ArbolGeneral;
import librerias.ListaEnlazadaGenerica;
import librerias.ListaGenerica;

public class Res {
	
	private void clonar(ListaGenerica<Integer> act, ListaGenerica<Integer> camino) {
		for(int i=1; i<=camino.tamanio(); i++) {
			camino.eliminarEn(i);
		}
		for(int i=1; i<=act.tamanio(); i++) {
			camino.agregarFinal(act.elemento(i));
		}
	}
	
	private void caminoAHojaMasLejanaRec(ArbolGeneral<Integer> a, ListaGenerica<Integer> caminoAct, ListaGenerica<Integer> camino){

		if(!a.esVacio()) {
			caminoAct.agregarFinal(a.getDato());
			if(!a.esHoja()) {
				for(int i=1; i<= a.getHijos().tamanio(); i++) {
					caminoAHojaMasLejanaRec(a.getHijos().elemento(i), caminoAct ,camino);
				}
			}else {
				if(caminoAct.tamanio() > camino.tamanio()) {
					clonar(caminoAct, camino);
				}	
			}
			caminoAct.eliminarEn(caminoAct.tamanio());
		}
	}
	
	public ListaGenerica<Integer> caminoAHojaMasLejana(ArbolGeneral<Integer> a){
		ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		caminoAHojaMasLejanaRec(a, new ListaEnlazadaGenerica<Integer>() ,camino);
		return camino;
	}
}
