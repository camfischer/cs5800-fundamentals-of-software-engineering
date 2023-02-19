import java.sql.*;

public class Iter0 {
    // heres another comment
    // Here is Roy's comment
    public static void main(String[] args) {
        String url
            = "jdbc:mysql://localhost:3306/exam"; // table details
        String username = "root"; // MySQL credentials
        String password = "Cams6487!3";
        String query
            = "select *from branch"; // query to be run // Driver name
        String queryinsert
            = "INSERT INTO branch VALUES (6, 'University of Iowa', 'Iowa City')";
        try {
            Connection con = DriverManager.getConnection(
                url, username, password);
                System.out.println(
                    "Connection Established successfully");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query); // Execute query
                rs.next();
                String name
                    = rs.getString("City"); // Retrieve name from db
                st.executeUpdate(queryinsert);
         
                System.out.println(name); // Print result on console
                st.close(); // close statement
                con.close(); // close connection
                System.out.println("Connection Closed....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
       

        System.out.println(sum(1,2));
    }

    public static int sum(int x, int y){
        return x + y;
    }
}