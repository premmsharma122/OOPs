class DatabaseConnection{
    private static DatabaseConnection instance;
    private DatabaseConnection(){}

    static DatabaseConnection getInstance(){
        if(instance==null){
            instance = new DatabaseConnection();
        }
        return instance;
    };

    void displayConnection(){
        System.out.println("Connection done!");
    };
}
public class day11 {
    public static void main(String[] args) {
        
        DatabaseConnection d1 = DatabaseConnection.getInstance();
        DatabaseConnection d2 = DatabaseConnection.getInstance();
        d1.displayConnection();
        System.out.println(d1==d2);
    }
}
