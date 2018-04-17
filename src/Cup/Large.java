package Cup;


public class Large implements Cups {
    protected double price;

    @Override
    public String ChooseSize() {
        return "Large Size";
    }

    @Override
    public double price() {
        return price=2.5;
    }
}
