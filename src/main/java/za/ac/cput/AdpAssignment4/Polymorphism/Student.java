package za.ac.cput.AdpAssignment4.Polymorphism;

public class Student {

    private String name;
    private String studNum ;
    private double loanAmount;


    public Student(String name, String studNum, double loanAmount) {
        this.name = name;
        this.studNum = studNum;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
