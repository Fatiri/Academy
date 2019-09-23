import com.enigma.service.FileService;
import com.enigma.service.PersonTranform;

public class MainReader {
    public static void main(String[] args) {
        FileService personParsing = new FileService();
        personParsing.sendRead();
    }

}
