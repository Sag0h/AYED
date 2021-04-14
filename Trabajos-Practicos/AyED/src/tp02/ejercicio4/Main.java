package tp02.ejercicio4;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            new Balance(args[0]);
        } else {
            System.out.println("Esta balanceado.");
        }
    }
}