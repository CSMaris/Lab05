package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DAO {
	
	public boolean verificaValidita(String w)
	{
	String jdbcURL="jdbc:mysql://localhost/dizionario?user=root&password=qwertyuiop";
	String sql="SELECT nome FROM parola WHERE nome=?";
	
  try {
	  
	  Connection conn = DriverManager.getConnection(jdbcURL);
		
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, w);
		ResultSet rs = st.executeQuery();
	
	
	if(rs.next())
	{
		conn.close();
		return true;
	}
	
	else
	{
		conn.close();
		return false;
	}
	
} catch (SQLException e) {
		e.printStackTrace();
	}
  
return false;
	}

}
