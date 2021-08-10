public class FoodDrinks extends Shopping
{
    public String myItem;
    public FoodDrinks(String item)
    {
        myItem=item;
        super.myItem=item;
    }
    public void check() {
        try {
            super.checkIfAvailable();
            System.out.println(this.myItem+" added to cart successfully");
            super.numItems++;
            System.out.println("Number of items in cart : " + super.numItems);
        } catch (myException me) {
            System.out.println(me.getMessage());
        }
    }
    public static void main(String[] args) {
        //String s = "Pen";
        FoodDrinks fd=new FoodDrinks("Soda");
        fd.check();
        fd=new FoodDrinks("Coke");
        fd.check();
        fd=new FoodDrinks("Frooti");
        fd.check();
        fd=new FoodDrinks("Milk");
        fd.check();
        }
    }
