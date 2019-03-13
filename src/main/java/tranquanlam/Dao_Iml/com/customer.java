package tranquanlam.Dao_Iml.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import tranquanlam.Dao.com.DaoCustomer;
import tranquanlam.Model.com.Customer;


@Repository
public class customer implements DaoCustomer {

	@Autowired
	JdbcTemplate jdbcTemplate;
	

	
	
	public List<Customer> tableCustomer() {
		String sql="Select*from Customer";
		
		return  jdbcTemplate.query(sql, new Object[] {}, new RowMapper<Customer>() {

			 public Customer mapRow(ResultSet arg0, int arg1) throws SQLException {
				Customer cus=new Customer();
				cus.setTenKH(arg0.getString("TenKH"));
				cus.setTuoiKH(arg0.getInt("TuoiKH"));
				cus.setSoCMND(arg0.getString("SoCMND"));
				cus.setEmail(arg0.getString("DiaChiEmail"));
				cus.setSoDT(arg0.getString("SoDT"));
				
				return cus;
			}
			
		});
			
			
		
		
		
	}

}
