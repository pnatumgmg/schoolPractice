package printK_1.questions03;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		//1
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgrestest";

		String sql = "delete from 家計簿 where 日付 = ?";

		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date d1 = sf.parse("2024-07-25");
			long time = d1.getTime();
			
			Date d = new java.sql.Date(time);
			pstmt.setDate(1, d);

			int num = pstmt.executeUpdate();

			System.out.println(num + "行削除されました");

		}catch(SQLException | ParseException e) {
			e.printStackTrace();
		}
	}

}
