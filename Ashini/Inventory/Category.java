package Day2.Inventory;

public class Category {
    private String CategoryName;

    public Category(String name){
        this.CategoryName = name;
    }

    public void setCategoryName(String categoryName) {
        this.CategoryName = categoryName;
    }

    public String getCategoryName() {
        return CategoryName;
    }
}
