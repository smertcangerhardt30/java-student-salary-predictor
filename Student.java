package CMPE_113;

import java.util.Scanner;

public class Student {

    String department;
    String studentID;
    String name;
    int yearsOfStudy;
    double gpa;
    boolean hasScholarship;

    public void readInformation() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Student ID: ");
        studentID = scan.nextLine();

        System.out.println("Name: ");
        name = scan.nextLine();

        System.out.println("Years of study: ");
        yearsOfStudy = scan.nextInt();

        System.out.println("GPA: ");
        gpa = scan.nextDouble();
        scan.nextLine();

        System.out.println("Scholarship (yes/no): ");
        String scholarshipCheck = scan.nextLine();

        if (scholarshipCheck.equalsIgnoreCase("yes")) {
            hasScholarship = true;
        } else {
            hasScholarship = false;
        }

    }

    public void predictFultureSalary(int p) {

        double fultureSalary;

        if (p == 1) {
            fultureSalary = (gpa * 1000) - (yearsOfStudy * 10);

            if (hasScholarship == true) {
                fultureSalary += 300;
            }

            System.out.println("This student may get " + fultureSalary + " TL as salary in Turkey.");
        } else {
            fultureSalary = (gpa * 10000) - (yearsOfStudy * 100);

            if (hasScholarship == false) {
                fultureSalary -= 2000;
            }

            System.out.println("This student may get " + fultureSalary + " TL as salary abroad.");
        }
    }

    public void printInformation() {
        String s;

        if (hasScholarship == true) {
            s = "with a scholarship";
        } else {
            s = "without a scholarship";
        }

        if (yearsOfStudy == 1) {
            System.out.println(name + ", whose student ID is " + studentID + ", is studying 1st year at the "
                    + department + " department " + s + ".\n" + name + " has a GPA of " + gpa + ".");
        } else if (yearsOfStudy == 2) {
            System.out.println(name + ", whose student ID is " + studentID + ", is studying 2nd year at the "
                    + department + " department " + s + ".\n" + name + " has a GPA of " + gpa + ".");
        } else if (yearsOfStudy == 3) {
            System.out.println(name + ", whose student ID is " + studentID + ", is studying 3rd year at the "
                    + department + " department " + s + ".\n" + name + " has a GPA of " + gpa + ".");
        } else if (yearsOfStudy == 4) {
            System.out.println(name + ", whose student ID is " + studentID + ", is studying 4th year at the "
                    + department + " department " + s + ".\n" + name + " has a GPA of " + gpa + ".");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.department = "CENG";
        s1.studentID = "12345";
        s1.name = "Ada";
        s1.yearsOfStudy = 4;
        s1.gpa = 3.7;
        s1.hasScholarship = true;
        s1.printInformation();
        s1.predictFultureSalary(1);

        Student s2 = new Student();
        s2.department = "ECON";
        s2.readInformation();
        s2.printInformation();
        s2.predictFultureSalary(2);
    }

}
