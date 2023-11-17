package exercise3;

public class BusinessMortgage extends Mortgage{

    final static double interestRate = primeRate + 0.01;

    public BusinessMortgage(int amortgageNumber, String acustomerName, double aamountOfMortgage, int aterm) {
        super(amortgageNumber, acustomerName, aamountOfMortgage, interestRate, aterm);
    }
}
