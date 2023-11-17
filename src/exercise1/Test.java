package exercise1;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Test {

    static List<Double> arr = new ArrayList<>();
    


    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name of which type of insurance you want:");
        String name = s.nextLine();
        String n = name.toLowerCase();
        System.out.println(n);

        System.out.println("enter the monthly fees for your insurance:");
        Double amount =  s.nextDouble();

        if(n.equals("health")){

            Insurance ob1 = new Health("health", amount);
            ob1.setInsuranceCost(amount);
            double a = ((Health) ob1).getInsuranceCost();

            arr.add(a);
            ((Health) ob1).display();
        }
        else if(n.equals("life")){
            Insurance ob1 = new Life("life", amount);
            ob1.setInsuranceCost( amount);
            double a = ((Life) ob1).getInsuranceCost();

            arr.add(a);
            ((Life) ob1).display();
        }
        else {
            System.out.println("entered insurance is not available");
        }

        System.out.println(arr);

    }
}
