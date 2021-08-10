public class Shopping extends ItemSearch
{
    public String myItem;
    public Shopping(String item)
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
            System.out.println(me.getMessage()+" ("+super.myItem+")");
        }
    }
    public static void main(String[] args) {
        //String s = "Pen";
        Shopping shop=new Shopping("Soda");
        shop.check();
        shop=new Shopping("Coke");
        shop.check();
        shop=new Shopping("Frooti");
        shop.check();
        shop=new Shopping("Milk");
        shop.check();
        shop=new Shopping("Pen");
        shop.check();
        shop=new Shopping("Scissors");
        shop.check();
        shop=new Shopping("Eraser");
        shop.check();
        }
    }
