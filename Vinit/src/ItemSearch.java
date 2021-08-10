public class ItemSearch extends Shopping
{
    public String myItem;
    public ItemSearch(String item)
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
        ItemSearch srch=new ItemSearch("Soda");
        srch.check();
        srch=new ItemSearch("Coke");
        srch.check();
        srch=new ItemSearch("Frooti");
        srch.check();
        srch=new ItemSearch("Milk");
        srch.check();
        srch=new ItemSearch("Pen");
        srch.check();
        srch=new ItemSearch("Scissors");
        srch.check();
        srch=new ItemSearch("Eraser");
        srch.check();
        }
    }
