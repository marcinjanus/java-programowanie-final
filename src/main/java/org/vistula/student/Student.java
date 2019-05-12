package org.vistula.student;

public class Student {
    /*Pola - mogoa byc wykorzystywane w calej klasie*/
    String name;
    int age;
    boolean isWoman;

    //Konstruktor bezargumentowy
    public Student() {

    }
    //Konstruktor argumentowy
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void determineIfWoman(String name) {
        if (name.contains("Bonawentura") ||
                name.contains("Barnaba") ||
                name.contains("Kosma") ||
                name.contains("Kuba") ||
                name.contains("Maria") ||
                name.contains("Dyzma") ||
                name.contains("Atylla") ||
                name.contains("Nikita") ||
                name.contains("Nikola") ||
                name.contains("Bogwidza") ||
                name.contains("Brzezdoma") ||
                name.contains("Przezdoma") ||
                name.contains("Lasota") ||
                name.contains("Niedoma") ||
                name.contains("Niegodoma") ||
                name.contains("Niemsta") ||
                name.contains("Niepełka") ||
                name.contains("Niewsza") ||
                name.contains("Zawisza") ||
                name.contains("Żegota")) { //wyjatki imiona meskie
            this.isWoman = false;
        } else if (name.endsWith("a")) { //zenskie konczace sie ns a
            this.isWoman = true; /*traktujemy jako setter*/
        } else if (name.contains("Nicole") ||
                name.contains("Dolores") ||
                name.contains("Karen") ||
                name.contains("Miriam") ||
                name.contains("Elif") ||
                name.contains("Emilie") ||
                name.contains("Megan") ||
                name.contains("Amelie") ||
                name.contains("Aylin") ||
                name.contains("Caroline") ||
                name.contains("Chanel") ||
                name.contains("Jenifer") ||
                name.contains("Melanie") ||
                name.contains("Mercedes") ||
                name.contains("Vivian") ||
                name.contains("Annabel") ||
                name.contains("Heidi") ||
                name.contains("Ingrid") ||
                name.contains("Kim") ||
                name.contains("Leah") ||
                name.contains("Leal") ||
                name.contains("Lili") ||
                name.contains("Lilian") ||
                name.contains("Rose")) { //wyjatki imiona zenskie
            this.isWoman = true;
        } else {
            this.isWoman = false; //wszystkie pozostale
        }
    }

}
