import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document; // Import this to use Document class
import static com.mongodb.client.model.Filters.eq;

public class DeletePerson {
    public static void deletePerson(MongoDatabase database, String name) {
        MongoCollection<Document> collection = database.getCollection("persons");
        collection.deleteOne(eq("name", name));
        System.out.println("Person deleted: " + name);
    }
}
