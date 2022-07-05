import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Loader {

    public static void main(String[] args) throws Exception {
        String fileName = "res/data-1572M.xml";
        long start = System.currentTimeMillis();
        parseFile(fileName);
        System.out.println("Time for parse: " + (System.currentTimeMillis() - start) + "ms.");
    }

    private static void parseFile(String fileName) throws Exception {
        DefaultHandler handler = new XMLHandler();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File(fileName), handler);
    }
}