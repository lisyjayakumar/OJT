package javacoders.mongodbcrud;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;


/**
 *
 * @author ADIT
 */
public class MongoDBCrud {
    private static final String CONNECTION_STRING="mongodb://localhost:27017";
    private static final  String DATABASE_NAME="mydb";
    private static final String COLLECTION_NAME="col";
    public static void createStud(String studid,String studname,String studage){
        try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            Document stud = new Document("id",studid).append("name",studname).
                    append("age",studage);
            col.insertOne(stud);
            System.out.println("Student details created: "+stud.toJson());
            System.out.println("*************");
            
        }
    }
    public static void readStud(){
        try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            FindIterable<Document> studs=col.find();
            System.out.println("Student details: ");
            for(Document obj:studs){
                System.out.println(obj.toJson());
                
            }
            System.out.println("*************");
        }
    }
    public static void updateStud(String studid,String studname){
        try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            col.updateOne(Filters.eq("id",studid),Updates.set("name",studname));
            System.out.println("Student name updated");
            System.out.println("*************");
        }
        
    }
    public static void deleteStud(String studname){
        try(MongoClient mc=MongoClients.create(CONNECTION_STRING)){
            MongoDatabase db = mc.getDatabase(DATABASE_NAME);
            MongoCollection<Document> col = db.getCollection(COLLECTION_NAME);
            col.deleteOne(Filters.eq("name",studname));
            System.out.println("Student details deleted");
        }
        
    }
  
    public static void main(String[] args) {
        //createStud("6","lisy","23");
        //readStud();
        //updateStud("6","lisy jayakumar");
        //readStud();
        deleteStud("lisy jayakumar");
        readStud();
    }
}
