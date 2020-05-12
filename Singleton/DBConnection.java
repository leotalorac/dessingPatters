package Singleton;

/**
 * DBConnection
 */
public class DBConnection {
    private static DBConnection connection;
    private DBConnection(){}
    public static DBConnection getInstace(){
        // create the instances if this deosn't exists 
        if(connection == null){
            connection = new DBConnection();
        }
        // return the connection instance 
        return connection;
    }
    
}