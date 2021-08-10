package Day2.CaseStudy;

public class Clothing extends Item{
    String category;
    public Clothing(String name, int stock)
    {
        super(name,stock);
        this.category = "Clothing";
    }
}
