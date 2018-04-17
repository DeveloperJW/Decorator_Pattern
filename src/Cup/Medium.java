package Cup;


public class Medium implements Cups {
    protected double price;

    @Override
    public String ChooseSize() {
        return "Medium Size";
    }

    @Override
    public double price() {
        return price=2;
    }
}
