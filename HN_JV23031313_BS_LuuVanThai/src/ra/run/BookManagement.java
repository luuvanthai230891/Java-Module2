package ra.run;

import ra.bussiness.Book;

import java.util.Scanner;

public class BookManagement {
    public static Book[] books = new Book[0];
    public static int findIndexById(int id){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() != -1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách ");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách ");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả ");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập số lượng sách cần thêm");
                    int n = Integer.parseInt(sc.nextLine());
                        Book[] newBooks = new Book[books.length + n];
                        for (int i = 0; i < books.length; i++) {
                            newBooks[i] = books[i];
                        }
                        for (int i = 0; i < n; i++) {
                            Book newBook = new Book();
                            newBook.inputData(sc);
                            newBooks[books.length+i] = newBook;
                        }
                        books = newBooks;

                    break;
                case 2:
                    if (books.length==0){
                        System.err.println("Danh sách rỗng");
                    }else {
                        System.out.println("Danh sách thư viện");
                        for (int i = 0; i <books.length ; i++) {
                            books[i].displayData();
                        }
                    }
                    break;
                case 3:
                   Book newBookTemp = new Book();
                   newBookTemp = books[0];
                    for(int i = 0; i < books.length - 1; i++){
                        for(int j = i + 1; i < books.length; i++){
                            if (books[i].getInterest() > books[j].getInterest()){
                                newBookTemp = books[j];
                                books[j] = books[i];
                                books[i] = newBookTemp;
                            }
                        }
                    }
                    if (books.length==0){
                        System.err.println("Danh sách rỗng");
                    }else {
                        System.out.println("Danh sách thư viện");
                        for (int i = 0; i <books.length ; i++) {
                            books[i].displayData();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập id sách cần xóa :");
                    int id = Integer.parseInt(sc.nextLine());
                    int indexById = findIndexById(id);
                    if (indexById !=-1){
                        Book[] newBook_del = new Book[books.length-1];
                        for (int i = 0; i < newBook_del.length; i++) {
                            if(i<indexById){
                                newBook_del[i] = books[i];
                            }else if (i>indexById){
                                newBook_del[i-1] = books[i];
                            }
                        }
                        books = newBook_del;
                        System.out.println("Xóa thành công");
                    }else {
                        System.err.println("id không tìm thấy");
                    }
                    for (int i = 0; i <books.length ; i++) {
                        books[i].displayData();
                    }
                    break;
                case 5:
                    System.out.println("Nhập chuỗi tìm kiếm theo tên  :");
                    String nameFind = sc.nextLine();
                    for (int i = 0; i < books.length; i++){
                        if(books[i].getBookName().equals(nameFind)){
                            books[i].displayData();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhập id cần edit :");
                    int idEdit = Integer.parseInt(sc.nextLine());
                    int indexByIdEdit = findIndexById(idEdit);
                    if (indexByIdEdit !=-1){
                        System.out.println("Thông tin cũ");
                        System.out.println(books[indexByIdEdit]);
                        System.out.println("Nhập thông tin mới");
                        books[indexByIdEdit].inputData(sc);
                        System.out.println("Cập nhạt thanh cong");
                    }else {
                        System.err.println("id khong tim thay");
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Lỗi nhập lựa chọn");
            }
        }
    }
}
