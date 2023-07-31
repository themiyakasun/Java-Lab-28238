package com.mycompany.test;

public class Test {

    public static void main(String[] args) {
        Speaker politician = new Politician();
        Speaker priest = new Priest();
        Speaker lecturer = new Lecturer();

        politician.speak();
        priest.speak();
        lecturer.speak();
    }
}
