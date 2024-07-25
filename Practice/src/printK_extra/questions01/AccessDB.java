package printK_extra.questions01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AccessDB {
	private Connection conn;
	String url;
	String user;
	String password;

	public AccessDB(){
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgrestest";
	}

	public void connect(){
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public void disConnect() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	public List<M_goods> getgoodsList(){
		List<M_goods> l1 = new ArrayList<M_goods>();
		
		String sql = "select * from m_goods";
		connect();
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			ResultSet result = pstmt.executeQuery();

			while(result.next()) {
				int itemcode = result.getInt("itemcode");
				String itemname = result.getString("itemname");
				int supcode = result.getInt("supcode");
				int price = result.getInt("price");
				Date d1 = result.getDate("update_date");
				String strDate = d1.toString();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			    java.util.Date date = format.parse(strDate);
			    
			    l1.add(new M_goods(itemcode,itemname,supcode,price,date));
			}
		}catch (SQLException | ParseException e) {
			// TODO: handle exception
		}
		disConnect();
		return l1;
	}
	
	
	
	public List<M_supplier> getSupplierList() {
		List<M_supplier> l1 = new ArrayList<M_supplier>();

		String sql = "select * from m_supplier";

		connect();
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			ResultSet result = pstmt.executeQuery();

			while(result.next()) {
				int supcode = result.getInt("supcode");
				String supname = result.getString("supname");
				String address = result.getString("address");
				String tel = result.getString("tel");
				String repName = result.getString("rep_name");
				Date d1 = result.getDate("update_date");
				String strDate = d1.toString();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			    java.util.Date date = format.parse(strDate);
				
				l1.add(new M_supplier(supcode,supname,address,tel,repName,date));
				
			}
		} catch (SQLException | ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		disConnect();
		return l1;
	}
	
	

}
