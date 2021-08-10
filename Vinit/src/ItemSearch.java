public class ItemSearch
{
    public static int numItems=0;
    public String myItem;
    public boolean available;
    public String[] items;
    public void checkIfAvailable() throws myException
    {
        available=false;
        for(int i=0;i<8;i++)
        {
            if(items[i]==myItem) {
                available = true;
                break;
            }
        }
        if(available==false)
            throw new myException("Item not found");
    }
    public ItemSearch()
    {
        items = new String[]{"Cake","Peanuts","Bournville","Scissors","Pen","Soda","Pencil","Coke"};
    }
    public static void main(String[] args) {
        ItemSearch srch=new ItemSearch();

    }
}