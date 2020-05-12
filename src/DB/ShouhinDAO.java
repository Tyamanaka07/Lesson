package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShouhinDAO {
	static final String URL =  "jdbc:mysql://localhost/hanbai?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	public  ArrayList<Shouhin> findAll() {
		ArrayList<Shouhin> list = new ArrayList<Shouhin>();
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM hanbai.shouhin;";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				int sid= rs.getInt("sid");
				String sname = rs.getString("sname");
				int tanka = rs.getInt("tanka");

				Shouhin s = new Shouhin(sid, sname, tanka);
				list.add(s);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return list;
	}

	public  void insert(Shouhin s) {
		try {
			Connection con = DriverManager.getConnection (URL,USER,PASS);

			String sql = "INSERT INTO shouhin (sname,tanka) VALUES(?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,s.getSname());
			stmt.setInt(2,s.getTanka());

			stmt.executeUpdate();

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("insertエラー：" + e.getMessage());
		}
	}

	public void update(Shouhin s) {
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){

			String sql = "UPDATE hanbai.shouhin SET sname = ? ,tanka = ? WHERE sid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(3, s.getSid());
			stmt.setString(1, s.getSname());
			stmt.setInt(2, s.getTanka());


			stmt.executeUpdate();

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}

	public Shouhin findBySid(int sid) {
		Shouhin s = null;
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM hanbai.shouhin WHERE sid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, sid);

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				String sname = rs.getString("sname");
				int tanka = rs.getInt("tanka");

				s = new Shouhin(sid, sname, tanka);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findBySid：" + e.getMessage());
		}
		return s;
	}

	public void delete(int sid) {
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){

			String sql = "DELETE FROM shouhin WHERE sid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, sid);

			stmt.executeUpdate();

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}
}
