public class Singleton{

    public static void main(String[] args){
    
        Database db_ob;
        Database.get_instance();
        Database.get_connection();
    }
}

class Database{

    private static Database db_ob; 

    private Database(){}

    public static Database get_instance(){
    
        if(db_ob == null){
        
            db_ob = new Database();
        }
        
        return db_ob;
    } 
    
    public static void get_connection(){
    
        System.out.println("you are connected to the database now");
    }
} 

/*

a singleton object in java is a normal class that only will have 1 object

*/
