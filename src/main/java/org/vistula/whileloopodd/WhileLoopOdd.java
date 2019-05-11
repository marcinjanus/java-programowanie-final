package org.vistula.whileloopodd;

public class WhileLoopOdd {
    // pętla while (wersja1), która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
    public static void main(String[] args) {
        int i = -10;
        while (i <= 40) {
            if (i%2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
