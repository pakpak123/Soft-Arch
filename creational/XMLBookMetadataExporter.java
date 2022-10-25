package creational;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createBook() throws IOException, ParserConfigurationException {
        // TODO Auto-generated method stub
        return new XMLBookMetadataFormatter();
    }
}
