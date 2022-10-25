package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createBook() throws IOException {
        // TODO Auto-generated method stub
        return new CSVBookMetadataFormatter();
    }

}
