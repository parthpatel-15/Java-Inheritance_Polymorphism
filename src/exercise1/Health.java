package exercise1;

public class Health extends Insurance{
    private Double insuranceCost;


    public Health(String atypeOfInsurance, Double amonthlyCost)
    {
        super(atypeOfInsurance, amonthlyCost);
    }

    @Override
    public void setInsuranceCost(Double amonthlyCost){
        this.insuranceCost = amonthlyCost * 5.0;

    }

    Double getInsuranceCost(){return insuranceCost;}


    public void display(){
        System.out.println("your insurance type is:"+ super.getTypeOfInsurance());
        System.out.println("your total cost of insurance is :" + insuranceCost);

    }


}
