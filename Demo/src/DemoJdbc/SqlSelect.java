package DemoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlSelect {
    public static void main(String args[]){
    	Connection connection = null;
    	try {
Class.forName("com.mysql.cj.jdbc.Driver");
connection= DriverManager.getConnection(
    				"jdbc:mysql://localhost:3306/db",
    				"root","Apueti@1999");
    		Statement st = connection.createStatement();
    		ResultSet rs = st.executeQuery("Select id,name from emp");
    		while(rs.next()) {
    			System.out.print(rs.getInt(1)+" ");
    			System.out.println(rs.getString(2));
    			    		    
    		}
    		connection.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}

