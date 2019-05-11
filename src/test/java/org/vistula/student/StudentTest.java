package org.vistula.student;

import org.junit.Test;

public class StudentTest {

    @Test
    public void shouldCorrectlyReturnAgeName() { //Test of constructor with two parameters
        Student marcin = new Student(24,"Marcin"); // Creating a new object class Student = marcin (with two parameters)
        assert marcin.getAge() == 24; // We get the age value = 24
        assert marcin.getName().equals("Marcin"); // We assign the value 19
    }

    @Test
    public void shouldCorrectlySetAge() {
        Student marcin = new Student(24, "Marcin"); // Creating a new object class Student = marcin (with two parameters)
        marcin.setAge(19);  // We assign the value 19
        assert marcin.getAge() == 19; // Checking if it agrees
    }

    @Test
    public void shouldCorrectlySetName() {
        Student marcin = new Student(24, "Marcin"); // Creating a new object class Student = marcin (with two parameters)
        marcin.setName("Marek");  // We assign the value = Marcin
        assert marcin.getName().equals("Marek"); // Checking if it agrees
    }

    @Test
    public void shouldDetermineIfWoman() {
        Student marcin = new Student();
        marcin.determineIfWoman("Agnieszka");
        assert marcin.isWoman() == true;
    }

    @Test
    public void shouldDetermineIMan() {
        Student marcin = new Student();
        marcin.determineIfWoman("Kuba");
        assert marcin.isWoman() == false;
    }
}
