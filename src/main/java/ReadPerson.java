import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class ReadPerson {
    public static void readPersonByName(MongoDatabase database, String name) {
        MongoCollection<Document> collection = database.getCollection("persons");
        Document doc = collection.find(eq("name", name)).first();

        if (doc != null) {
            System.out.println("Person found: " + doc.toJson());
        } else {
            System.out.println("Person not found with name: " + name);
        }
    }
}
