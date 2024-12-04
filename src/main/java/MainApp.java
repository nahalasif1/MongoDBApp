import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MainApp {
    public static void main(String[] args) {
        MongoClient client = MongoDBConnection.getClient();
        MongoDatabase database = client.getDatabase("mydb");

        // Example usage
        Person person = new Person();
        person.setName("Alice");
        person.setAge(25);

        CreatePerson.createPerson(database, person);
        ReadPerson.readPersonByName(database, "Alice");
        UpdatePerson.updatePerson(database, "Alice", 30);
        DeletePerson.deletePerson(database, "Alice");

        client.close();
    }
}
