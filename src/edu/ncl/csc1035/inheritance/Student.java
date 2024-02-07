package edu.ncl.csc1035.inheritance;

public class Student extends UniversityPerson{
    private int stage;

    public Student(String name, int age, String institution, int stage) {
        super(name, age, institution);
        this.stage = stage;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ',' +
                "stage=" + stage +
                '}';
    }
    @Override
    public void printDetails(){
        // Call UniversityPerson method
        super.printDetails();
        // Prints additional information
        System.out.println("Stage: " + stage);
    }
}
