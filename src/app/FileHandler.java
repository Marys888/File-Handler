package app;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {


    public String writeFile(String path, String content) {
        try (FileWriter fwr = new FileWriter(path)) {
            fwr.write(content);
            return "Success";
        }catch(IOException ex){
        System.out.println(ex.getMessage());
        return "Error";
    }
}

public String readFile(String path) {

        try(FileReader fr = new FileReader(path)){
            int symbol;
            StringBuilder sb = new StringBuilder();

            while((symbol = fr.read()) != -1) {
                sb.append((char)symbol);
            }
            return sb.toString().trim();
            }catch(IOException ex) {
            return ex.getMessage();
        }
}
}
