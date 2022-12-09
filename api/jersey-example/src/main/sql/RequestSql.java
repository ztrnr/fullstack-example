package sql;

import java.sql.SQLException;
import model.RequestModel;

public class RequestSql {

    public RequestSql() {}
    
    private static Connection getDBConnection() {}

    /**
     * create a new row for a new request
     * 
     * @param request object to create
     * @throws 
     */
    public void insertRequest(RequestModel request) {
        
        
        try {
            //do it
        } catch (SQLException e) {
            //log and handle/throw
        } catch (Exception e) {
            //log and handle/throw
        } finally {
            //Close connections
        }
    }
    /**
     * create a new row for a new request
     * 
     * @param request object to create
     * @throws 
     */
    public void updateRequest(RequestModel request) {
        
        
        try {
            //do it
        } catch (SQLException e) {
            //log and handle/throw
        } catch (Exception e) {
            //log and handle/throw
        } finally {
            //Close connections
        }
    }

    /**
     * get a single request that matches given ID
     * @param id of the request needed
     * @return request object of row
     * @throws 
     */
    public RequestModel selectRequest(int ID)  {
        RequestModel request = new RequestModel;
        try {
            //do it
            return request;
        } catch (SQLException e) {
            //log and handle/throw
        } catch (Exception e) {
            //log and handle/throw
        } finally {
            //Close connections
        }
    }
}
