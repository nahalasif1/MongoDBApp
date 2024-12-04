import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

public class UpdatePerson {
    public static void updatePerson(MongoDatabase database, String name, int newAge) {
        MongoCollection<Document> collection = database.getCollection("persons");
        collection.updateOne(eq("name", name), set("age", newAge));
        System.out.println("Person updated: " + name + " with new age: " + newAge);
    }
}
