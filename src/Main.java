public class Main {

    public static void main(String[] args) {

        System.out.println("**************** Welcome to MeetFresh Loyola franchisee **************"+"\n");
        Drink drink=new BlackTea();
        drink=new Bubble(drink);
        drink=new RedBean(drink);
        drink.setCupSize(new Small());



        System.out.println("The drink you ordered is: "+drink.getDrinkDetail()
                +", and the price is $"+drink.cost()+"\n"
        +"The size of cup is: "+drink.getStrCupSize()
                +"\n");


    }
}
