package edu.ncl.csc1035.inheritance;

public class UniversityPerson extends Person {
    private String institution;

    public UniversityPerson(String name, int age, String institution) {
        super(name, age);
        this.institution = institution;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "UniversityPerson{" + super.toString() + ',' +
                "institution='" + institution + '\'' +
                '}';
    }
    @Override
    public void printDetails(){
        // Calls Person method
        super.printDetails();
        // Prints additional information
        System.out.println("Institution: " + institution);
    }
}
