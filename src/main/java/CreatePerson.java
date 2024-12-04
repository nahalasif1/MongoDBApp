import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class CreatePerson {
    public static void createPerson(MongoDatabase database, Person person) {
        MongoCollection<Document> collection = database.getCollection("persons");
        Document doc = new Document("name", person.getName())
                .append("age", person.getAge());
        collection.insertOne(doc);
        System.out.println("Person added: " + person.getName());
    }
}
