package edu.ncl.csc1035.collections;


public class StudentName3{
    public static void main(String[] args){
        int numberOfStudentsInRoom = 100;

        String[] studentName = new String[100];

        studentName[0] = "John";
        studentName[1] = "Paul";
        studentName[2] = "George";
        studentName[3] = "Ringo";

        for (String name: studentName) {
            System.out.println(name);
        }

        String[] studentName1 = new String[1];
        studentName1[0] = "John";

        // studentName[0] = 1;
        // studentName = "John";
    }
}
