package edu.ncl.csc1035.inheritance;

public class Lecturer extends UniversityPerson{
    private String department;

    public Lecturer(String name, int age, String institution, String department) {
        super(name, age, institution);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Lecturer{" + super.toString() + ',' +
                "department='" + department + '\'' +
                '}';
    }
    @Override
    public void printDetails(){
        // Call UniversityPerson method
        super.printDetails();
        // Prints additional information
        System.out.println("Department: " + department);
    }
}
