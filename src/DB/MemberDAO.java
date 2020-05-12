package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	static final String URL =  "jdbc:mysql://localhost/club?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	public  ArrayList<Member> findAll() {
		ArrayList<Member> list = new ArrayList<Member>();
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM club.member;";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				int mid= rs.getInt("mid");
				String name = rs.getString("name");
				String adr = rs.getString("adr");

				Member m  = new Member(mid, name, adr);
				list.add(m);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return list;
	}

	public Member findByMid(int mid) {
		Member m = null;
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM club.member WHERE mid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, mid);

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				String adr = rs.getString("adr");

				m = new Member(mid, name, adr);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findBySid：" + e.getMessage());
		}
		return m;
	}
}
