package tp02.ejercicio4;

import tp02.ejercicio3.PilaGenerica;

public class Balance {
    PilaGenerica<Character> pila = new PilaGenerica<Character>();

    public Balance(String str) {
        for (int i = 0; i < str.length(); i++) {
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
                    this.verificar(']');
                    break;
                case ')':
                    this.verificar(')');
                    break;
                case '}':
                    this.verificar('}');
                    break;
            }
        }
        if(pila.esVacia()){
            System.out.println("Esta Balanceado.");
        }else
            System.out.println("No esta balanceado.");
    }

    public void verificar(char c){
        if(pila.esVacia()){
            System.out.println("No esta balanceado.");
            System.exit(0);
        }else{
            Character s = (Character) pila.desapilar();
            if(c != s.charValue()){
                System.out.println("No esta balanceado.");
                System.exit(0);
            }
        }
    }

}




