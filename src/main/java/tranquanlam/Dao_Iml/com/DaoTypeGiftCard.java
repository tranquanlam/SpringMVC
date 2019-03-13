package tranquanlam.Dao_Iml.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import tranquanlam.Dao.com.DaoLoaiGiftCard;
import tranquanlam.Model.com.LoaiCard;

@Repository
public class DaoTypeGiftCard implements DaoLoaiGiftCard {

	@Autowired
	@Qualifier("template1")
	JdbcTemplate template1;
	public List<LoaiCard> getAll() {
		String sql="select * from LoaiQT";
		return template1.query(sql, new Object [] {}, new RowMapper<LoaiCard>() {

			public LoaiCard mapRow(ResultSet arg0, int arg1) throws SQLException {
				LoaiCard card=new LoaiCard();
				card.setMaLoaiC(arg0.getInt(1));
				card.setTenLoaiC(arg0.getString(2));
				card.setTrangLoaiCard(arg0.getString(4));
				return card;
			}
			
		});
		
	}

}
