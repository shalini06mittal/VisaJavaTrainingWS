package inheritance;

public  class Chair extends Furniture {

    @Override
    public double calculateMrp() {
        System.out.println("Chair calculate mrp");
        return 0;
    }

    Chair()
    {

        super();
        System.out.println("Chair constructor");
    }
}
