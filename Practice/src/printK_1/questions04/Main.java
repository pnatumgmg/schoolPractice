package printK_1.questions04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		//1
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgrestest";
		
		String sql = "insert into 家計簿 values(?,?,?,?,?)";
		
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);){
			
			Date d = new Date();
			long time = d.getTime();
			java.sql.Date d2 = new java.sql.Date(time);
			
			pstmt.setDate(1, d2);
			pstmt.setString(2, "食費");
			pstmt.setString(3, "マクドナルド");
			pstmt.setInt(4, 0);
			pstmt.setInt(5, 850);
			
			int num = pstmt.executeUpdate();
			
			System.out.println(num + "行が追加されました");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
