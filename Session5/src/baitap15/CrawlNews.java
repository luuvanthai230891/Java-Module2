package baitap15;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            // tạo đối tượng url
            URL url = new URL("https://www.24h.com.vn/the-thao-c101.html");
            // : Mở luồng đọc từ địa chỉ web sử dụng url.openStream()
            // và tạo một Scanner để đọc nội dung từ luồng.
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

            // Sử dụng ký tự "\Z" làm đại diện cho hết nội dung,
            // giúp đọc toàn bộ nội dung từ luồng.
            scanner.useDelimiter("\\Z");

            //Đọc toàn bộ nội dung HTML vào một chuỗi html.
            String html = scanner.next();
            //Đóng Scanner để giải phóng tài nguyên.
            scanner.close();
//            html = html.replaceAll("\n","");
            // Tạo một đối tượng Pattern với biểu thức chính quy
            // để tìm kiếm thông tin trong HTML. Trong trường hợp này,
            // biểu thức chính quy là "' >(.*?)</a></li>", nghĩa là tìm chuỗi
            // bắt đầu từ "' >" và kết thúc trước ký tự </a></li>,
            // và lấy nội dung trong ngoặc đơn làm nhóm.
            Pattern pattern = Pattern.compile("' >(.*?)</a></li>");
            //Tạo một đối tượng Matcher để áp dụng biểu thức chính quy vào nội dung HTML.
            Matcher matcher = pattern.matcher(html);
            //Sử dụng vòng lặp để lấy tất cả các kết quả từ biểu thức chính quy
            // và in ra nội dung của nhóm đầu tiên.
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
//            System.out.println(html);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}