public class Stationary extends Shopping
{
    public String myItem;
    public Stationary(String item)
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
        Stationary st=new Stationary("Pen");
        st.check();
        st=new Stationary("Pencil");
        st.check();
        st=new Stationary("Erasee");
        st.check();
        st=new Stationary("Scissors");
        st.check();
    }
}
