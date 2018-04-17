package Cup;


public class Small implements Cups {
    protected double price;


    @Override
    public String ChooseSize() {
        return "Small Size";
    }

    @Override
    public double price() {
        return price=1;
    }
}
