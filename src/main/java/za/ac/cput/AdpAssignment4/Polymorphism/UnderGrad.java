package za.ac.cput.AdpAssignment4.Polymorphism;

public class UnderGrad extends Student implements LoanInterest {


    public UnderGrad(String name, String studNum, double loanAmount) {
        super(name, studNum, loanAmount);
    }

    @Override
    public double interest() {
        return getLoanAmount() * 0.12;
    }
}
