package org.vistula.whileloopodd;

public class WhileLoopOdd1 {
    // pętla while (wersja2), która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
    public static void main(String[] args) {
        int i = -9;
        while (i <= 40) {
            System.out.println(i);
            i=i+2;
        }
    }
}
