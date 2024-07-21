package tarea1;

public class EvaBooleana {
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        boolean expresion1 = M > T;
        boolean expresion2 = T / K == -5;
        boolean expresion3 = (M + T == 7) || (M - T == 5);

        System.out.println("M > T: " + expresion1);
        System.out.println("T / K == -5: " + expresion2);
        System.out.println("(M + T == 7) || (M - T == 5): " + expresion3);
    }
}

