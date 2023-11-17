package exercise3;

public class Mortgage implements MortgageConstant {
    protected int mortgageNumber ;
    protected String customerName ;
    protected double amountOfMortgage;
    protected double interestRate;
    protected int term;

    public Mortgage( int amortgageNumber ,String acustomerName ,double aamountOfMortgage,double ainterestRate,int aterm) {

        mortgageNumber=amortgageNumber;
        customerName=acustomerName;
        amountOfMortgage=aamountOfMortgage;
        interestRate=ainterestRate;
        term=aterm;
    }

    public static boolean validate(double amountOfMortgage){
        return amountOfMortgage <= max;
    }

    static int setTerm(int term){
        if (term == shortTerm || term == mediumTerm || term == longTerm){
            return term;
        }
        else{
            return 1;
        }

    }

    void getMortgageInfo(){
        System.out.println("------------------------------------------------------");
        System.out.println("");
        System.out.println("------------------MORTGAGE INFORMATION-----------------");
        System.out.println("Bank name:"+bankName);
        System.out.println("Mortgage number:"+mortgageNumber);
        System.out.println("Mortgage type :"+ this.getClass().getSimpleName());
        System.out.println("Customer name :"+ customerName);
        System.out.println("amount of mortgage :"+amountOfMortgage);
        System.out.println("Interest rate :"+interestRate*100+"%");
        System.out.println("Terms in years :"+term);
        System.out.println("Total amount :"+amountOfMortgage+Math.pow((interestRate),term));
        System.out.println("");
    }
}
