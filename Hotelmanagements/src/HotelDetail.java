import java.sql.*;
public class HotelDetail {
public static void main(String[]args)throws Exception {
	getConnectivity();
	}
public static void getConnectivity()throws Exception {
	String url = "jdbc:mysql://127.0.0.1:3306/hotel";
	String name  = "root";
	String password = "1325";
	String query = "insert into new values(?,?,?,?)";
	
	Connection con = DriverManager.getConnection(url,name,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.setInt(1,10);
	pst.setString(2,"dosa");
	pst.setString(3,"2");
	pst.setInt(4,100);
	
	pst.executeUpdate();
	con.close();

	
}
public static void selectall()throws Exception {
	String url = "jdbc:mysql://127.0.0.1:3306/hotel";
	String name  = "root";
	String password = "1325";
	String query = "select*from new ";

	Connection con = DriverManager.getConnection(url,name,password);
	Statement smt = con.createStatement();
	ResultSet rs = smt.executeQuery(query);
	while(rs.next()) {
		System.out.println("id"+rs.getInt(1));
		System.out.println("name"+rs.getString(2));
		System.out.println("quantity"+rs.getString(3));
		System.out.println("price"+rs.getInt(4));
		
	}
	con.close();
	
}

public static void update()throws Exception {
	String url = "jdbc:mysql://127.0.0.1:3306/hotel";
	String name  = "root";
	String password = "1325";
	String query = "update new set Name='Chapatti' where Id=1;";

	Connection con = DriverManager.getConnection(url,name,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.executeUpdate();
	con.close();
}
public static void delete()throws Exception {
	String url = "jdbc:mysql://127.0.0.1:3306/hotel";
	String name  = "root";
	String password = "1325";
	String query = "delete from new where Id=1;";

	Connection con = DriverManager.getConnection(url,name,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.executeUpdate();
	con.close();
}}
