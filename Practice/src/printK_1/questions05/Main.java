package printK_1.questions05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgrestest";
		
		String sql = "select 飼育県,個体識別番号,"
				+ "     case 雌雄コード when '1' then '雄'"
				+ "  				    when '2' then '雌'"
				+ "                     end as 雄雌"
				+ "     from 個体識別"
				+ "    where 飼育県   in (select 飼育県 from 頭数集計 order by 頭数 desc limit 3)";
		
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				String from = result.getString("飼育県");
				int count = result.getInt("個体識別番号");
				String osumesu = result.getString("雄雌");
				
				System.out.println("%s:%d:%s".formatted(from,count,osumesu));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
