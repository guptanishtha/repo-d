package Day3.CaseStudy;

public class Food extends Products {
    private String category;
    public Food(String name, int stocks) {
        super(name, stocks);
        String category = "Food";
    }
}
