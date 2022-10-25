package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray JSON;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        JSON = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject Bookobject = new JSONObject();
        Bookobject.put(Book.Metadata.ISBN.value, b.getISBN());
        Bookobject.put(Book.Metadata.TITLE.value, b.getTitle());
        Bookobject.put(Book.Metadata.PUBLISHER.value, b.getPublisher());
        JSONArray authors = new JSONArray();
        for (String OneAuthor : b.getAuthors()) {
            authors.add(OneAuthor);
        }
        Bookobject.put(Book.Metadata.AUTHORS.value, authors);
        JSON.add(Bookobject);
        return this;
    }

    @Override
    public String getMetadataString() {
        return JSON.toString();
    }
}
