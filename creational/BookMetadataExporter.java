package creational;

import java.io.IOException;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException,
            ParserConfigurationException {
        // Please implement this method. You may create additional methods as you see
        // fit.
        BookMetadataFormatter BOOK = createBook();
        for (Book book : books) {
            BOOK.append(book);
        }
        System.out.println(BOOK.getMetadataString());
    }

    public abstract BookMetadataFormatter createBook() throws IOException,
            ParserConfigurationException;

}
