import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoDBConnection {
    private static final String CONNECTION_STRING = "mongodb+srv://nahala:<db_password>Pakistan1@cluster0.9eoto.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

    public static MongoClient getClient() {
        return MongoClients.create(CONNECTION_STRING);
    }
}
