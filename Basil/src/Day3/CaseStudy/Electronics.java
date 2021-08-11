package Day3.CaseStudy;


public class Electronics extends Products{

    private String category;
    public Electronics(String name, int stocks) {
        super(name, stocks);
        this.category = "Electronics";
    }
}
