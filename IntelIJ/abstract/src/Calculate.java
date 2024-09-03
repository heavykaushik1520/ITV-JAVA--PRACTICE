abstract class Plan{
    protected  double rate;

    public abstract void gerRate();

    public void calculateBill(int units){
        System.out.println("Bill amount for : "+ units+ " units");
        System.out.println(rate*units);
    }

}

class CommercialPlan extends  Plan{

    @Override
    public void gerRate() {
        rate = 5.00;
    }
}

class DomesticPlan extends  Plan{

    @Override
    public void gerRate() {
        rate = 2.60;
    }
}

public class Calculate {

    public static void main(String[] args) {

        Plan ref;

        System.out.println("Commercial Plan : ");
        ref = new CommercialPlan();
        ref.gerRate();
        ref.calculateBill(250);

        System.out.println("Domestic Plan : ");
        ref = new DomesticPlan();
        ref.gerRate();
        ref.calculateBill(150);



    }
}
