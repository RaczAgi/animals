import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReader {
    public static List<String> fileReadHandler(String path){
        List<String> lines = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                lines.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nem található a file");
        }
        return lines;
    }
}
