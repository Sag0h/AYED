package tp02.ejercicio4;

import tp02.ejercicio3.PilaGenerica;

public class Balance {
    private PilaGenerica<Character> pila;

    public Balance() {
    	this.pila = new PilaGenerica<Character>();
    }
    
    public boolean isBalanced(String str) {
        boolean ok = true;
    	for (int i = 0;(i < str.length() && ok); i++) {
            switch (str.charAt(i)) {
                case '[':
                    pila.apilar(']');
                    break;
                case '(':
                    pila.apilar(')');
                    break;
                case '{':
                    pila.apilar('}');
                    break;
                case ']':
                    ok = this.verificar(']');
                    break;
                case ')':
                    ok = this.verificar(')');
                    break;
                case '}':
                    ok = this.verificar('}');
                    break;
            }
        }
        if(pila.esVacia()){
            return true;
        }
        return ok;
    }

    private boolean verificar(char c){  	
    	if(pila.esVacia() || (c != (Character) pila.desapilar().charValue())) 
        	return false;
        return true;
    }
    

}




