package Day2.CaseStudy;

public class Electronics extends Item {

    String category;
    public Electronics(String name, int stock)
    {
        super(name,stock);
        this.category = "Electronics";
    }

}
