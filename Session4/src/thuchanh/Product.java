package thuchanh;

public class Product {

    int productId;
    String productName;

    double productPrice;

    Category category;

    public Product(){

    }

    public Product(int productId,String productName,double productPrice,Category category ){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }
    public void display(){
        System.out.println("Ma danh muc : " + productId + "\n"+
                           "ten san pham :" + productName + "\n"+
                           "Gia: " + productPrice + "\n"+
                           "Danh muc : " + category.categoryName);
    }

}
