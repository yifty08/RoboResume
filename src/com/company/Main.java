package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> info1 = new ArrayList<String>();

        System.out.print("Let\'s build you a resume! \nEnter your name: ");
        String name = scanner.nextLine();
        Name name1 = new Name(name);
        info1.add(name1.getName());

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();
        Name email1 = new Name(email);
        info1.add(email1.getName());


        System.out.print("Enter your degree: ");
        String degree = scanner.nextLine();

        System.out.print("Enter your major: ");
        String major = scanner.nextLine();

        System.out.print("Enter your university name: ");
        String uniName = scanner.nextLine();

        System.out.print("Enter your graduation year: ");
        int gradYear = scanner.nextInt();
        scanner.nextLine();

        Education education1 = new Education(degree, major, uniName, gradYear);
        info1.add(education1.toString());

        System.out.print("Enter your company name: ");
        String company = scanner.nextLine();

        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter your job description: ");
        String description = scanner.nextLine();

        System.out.print("Enter your start year: ");
        int startDate = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your end year: ");
        int endDate = scanner.nextInt();
        scanner.nextLine();

        Exp experience1 = new Exp(company, jobTitle, description, startDate, endDate);
        info1.add(experience1.toString());


        System.out.print("Enter your skills: \nSkill 1: ");
        String skill1 = scanner.nextLine();
        System.out.print("Rate your skill 1: ");
        String rate1 = scanner.nextLine();

        System.out.print("Skill 2: ");
        String skill2 = scanner.nextLine();
        System.out.print("Rate your skill 2: ");
        String rate2 = scanner.nextLine();

        System.out.print("Skill 3: ");
        String skill3 = scanner.nextLine();
        System.out.print("Rate your skill 3: ");
        String rate3 = scanner.nextLine();

        Skill skills1 = new Skill(skill1, rate1, skill2, rate2, skill3, rate3);
        info1.add(skills1.toString());

        for (String i : info1) {
            System.out.println(i);
        }





//        System.out.println(info1.get(1));

//        int searchIndex = Collections.binarySearch(info1, name1.getName());
//        if (searchIndex >= 0) {
//            System.out.println("name found " + searchIndex);
//        } else {
//            System.out.println("name not found" + searchIndex);
//        }
//        System.out.println(name);

//        Name name1 = new Name("John Doe");
//        Email email1 = new Email("jdoe@email.com");
//        Education education1 = new Education("bs", "cs",
//                "umd", 2019);
//
//        info1.add(name1.getName());
//        info1.add(email1.getEmail());
//        info1.add(education1.toString());
//
//        System.out.println(info1);
//
//        for (String i : info1) {
//            System.out.println(i);
//        }
    }
}
