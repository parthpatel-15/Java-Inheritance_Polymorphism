package exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args){
        int mType=1;
        int mNumber=0;
        double amount= 0.0;
        int term = 1;
        String name ="";
        Scanner s =new Scanner(System.in);
        int n = 3;
        Mortgage[] m = new Mortgage[n];
        System.out.println("regular interest rate is :"+Mortgage.primeRate*100);

        // array of three entries
        for (int i=0; i<n; i++){


            boolean validate;
            System.out.println("enter mortgage number-"+(i+1));
            //loop for valid entry
            do {
                validate = true;
                try{
                    System.out.println("enter your name:");
                    name = s.nextLine();
                    s.nextLine();
                    System.out.println("enter term(for how much time you want mortgage):");
                    System.out.println("there are three term available: short-term (one year), medium-term (three years) and long-term (5 years) ");
                    System.out.println("enter term in numbers" );

                    int t= s.nextInt();
                    term = Mortgage.setTerm(t);
                    System.out.println("enter mortgage number");
                    mNumber= s.nextInt();
                    boolean rightAmount= false;
                    while (!rightAmount){
                        System.out.println("enter mortgage amount:");
                        amount= s.nextDouble();
                        if(!Mortgage.validate(amount)){
                            System.out.println("Amount is out of range. Please enter amount under $300,000");
                        }else{
                            rightAmount=true;
                        }
                    }
                    do{
                        System.out.println(" this bank provides two types of mortgages 1.Business and 2.Personal ");
                        System.out.println(" For business enter 1.");
                        System.out.println(" For personal enter 2.");
                        mType = s.nextInt();
                    }while (!(mType == 1||mType==2));

                }catch(InputMismatchException a){
                    System.out.println("try again, something was wrong");
                    validate= false;
                }
            }while(!validate);



            // object to call classes
            if (mType == 1){
                m[i]= new BusinessMortgage(mNumber,name,amount,term);
            }else{
                m[i]= new PersonalMortgage(mNumber,name,amount,term);
            }
        }

        for (int i=0; i<n; i++){
            m[i].getMortgageInfo();
        }

    }
}
