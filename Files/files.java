package Files;
import java.io.File;
public class files {
    public static void main(String[] args) {
        File file = new File("test.py");
        if (file.exists()){
            System.out.print("File Exists....");
        }
        else{
            System.out.print("File Not Exists.....");
        }
    }
}