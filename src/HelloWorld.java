import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jattxgt
 * @site jattxgt
 * @company jattxgt.com
 * @create 2019-10-27 10:55
 */
public class HelloWorld {










    public static void main(String[] args) {
        System.out.println("hello world");
    }
    public void fun(){
        String aa="";
        ArrayList list = new ArrayList();
        try {
            FileInputStream file = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
