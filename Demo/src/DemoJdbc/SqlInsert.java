package DemoJdbc;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class SqlInsert {
	public static void main(String args[]){
    	Connection connection = null;
    	try {
Class.forName("com.mysql.cj.jdbc.Driver");
connection= DriverManager.getConnection(
    				"jdbc:mysql://localhost:3306/db",
    				"root","Apueti@1999");
PreparedStatement statement = connection.prepareStatement("insert into emp values(?,?)");
statement.setInt(1,900);
statement.setString(2, "IT");
statement.executeUpdate();
System.out.println("Data inserted");
connection.close();
}catch(Exception e){
e.printStackTrace();
}
}
}
