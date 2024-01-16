package thuchanh;

public class Category {
    int categoryId;

    String categoryName;

    public Category(){
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void display(){
        System.out.println("ma danh muc: " + categoryId + "\n" +
                "ten danh muc :" + categoryName);
     }
}
