package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> info1 = new ArrayList<String>();

        Name name1 = new Name("John Doe");
        Email email1 = new Email("jdoe@email.com");
        Education education1 = new Education("bs", "cs",
                "umd", 2019);

        info1.add(name1.getName());
        info1.add(email1.getEmail());
        info1.add(education1.toString());

        System.out.println(info1);

        for (String i : info1) {
            System.out.println(i);
        }
    }
}
