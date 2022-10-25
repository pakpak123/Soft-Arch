package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createBook() {
        // TODO Auto-generated method stub
        return new JSONBookMetadataFormatter();
    }
}
