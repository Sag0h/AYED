package tp02.ejercicio4;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            Balance checkBalanced = new Balance();
            if(checkBalanced.isBalanced(args[0])) System.out.println("Esta balanceado");
            else System.out.println("No esta balanceado.");
            	
        } else {
            System.out.println("Esta balanceado.");
        }
    }
}