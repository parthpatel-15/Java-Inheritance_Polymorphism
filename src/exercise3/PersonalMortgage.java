package exercise3;

public class PersonalMortgage extends Mortgage {

     final static double interestRate = primeRate + 0.02;

    public PersonalMortgage(int amortgageNumber, String acustomerName, double aamountOfMortgage, int aterm) {
        super(amortgageNumber, acustomerName, aamountOfMortgage, interestRate, aterm);
    }
}
