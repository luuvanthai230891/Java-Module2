package ra.bussiness;

import java.text.ParseException;
import java.util.Scanner;

public class Book {
   private int bookId;
   private String bookName ;
   private String author ;
   private String descriptions ;
   private double importPrice ;
   private double exportPrice ;
   private float interest = (float) (exportPrice - importPrice);
   private boolean bookStatus = true;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    //    public Book(int bookId, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, boolean bookStatus) {
//        this.bookId = bookId;
//        if(bookName.length() > 0){
//            this.bookName = bookName;
//        }else {
//            System.err.println("Tên sách không được để trống");
//        }
//
//        if(author.length() > 0){
//            this.author = author;
//        }else {
//            System.err.println("Tên tác giả không được để trống");
//        }
//
//        if(descriptions.length() >= 10){
//            this.descriptions = descriptions;
//        } else {
//            System.err.println("Vui lòng nhập ít nhất 10 ký tự");
//        }
//
//        if (importPrice > 0) {
//            this.importPrice = importPrice;
//        } else {
//            throw new IllegalArgumentException("Giá nhập phải lớn hơn 0");
//        }
//        if(exportPrice > importPrice*1.2){
//            this.exportPrice = exportPrice;
//        } else {
//            throw new IllegalArgumentException("Giá xuất phải lớn hơn 1.2 lần giá nhập");
//        }
//
//        this.interest = (float) (exportPrice - importPrice);
//        this.bookStatus = true;
//    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        if (exportPrice > 1.2 * importPrice) {
            this.exportPrice = exportPrice;
        } else {
            throw new IllegalArgumentException("Giá xuất phải lớn hơn 1.2 lần giá nhập");
        }
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public float setInterest(float interest) {
       return (float) (exportPrice - importPrice);
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void inputData(Scanner sc) {
         bookId++;
        System.out.println("Nhập tên sách:");
            this.bookName = sc.nextLine();
        System.out.println("Nhập tên tác giả:");
            this.author = sc.nextLine();
        System.out.println("Nhập mô tả sách:");
            this.descriptions = sc.nextLine();
        System.out.println("Nhập giá nhập: ");
            this.importPrice = sc.nextDouble();
        System.out.println("Nhập giá xuất: ");
            this.exportPrice = sc.nextDouble();
        this.bookStatus = true;
    }
    public void displayData(){
        System.out.println("Thông tin sách{" +
                "bookId :'" + bookId + '\'' +
                ",bookName :'" + bookName + '\'' +
                ", author :" + author +
                ", desciptions :" + descriptions +
                ", importPrice :'" + importPrice + '\'' +
                ", exportPrice :'" + exportPrice + '\'' +
                ", interest :'" + (exportPrice - importPrice) + '\'' +
                ", bookStatus :'" + bookStatus + '\'' +
                '}');
    }

}
