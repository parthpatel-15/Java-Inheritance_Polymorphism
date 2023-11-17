package exercise1;
import java.util.Arrays;
public abstract class Insurance {
    private final String typeOfInsurance;
    private final Double monthlyCost;



    public Insurance(String atypeOfInsurance, Double amonthlyCost){
        typeOfInsurance= atypeOfInsurance;
        monthlyCost= amonthlyCost;
    }

    public String getTypeOfInsurance()
    {
        return typeOfInsurance;
    }
    public Double getMonthlyCost()
    {
        return monthlyCost;
    }



    public abstract void setInsuranceCost( Double amonthlyCost);


}
