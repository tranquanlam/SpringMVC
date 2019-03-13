package tranquanlam.Dao_Iml.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import tranquanlam.Dao.com.DaoGiftCard;
import tranquanlam.Model.com.GiftCard;

@Repository
public class giftcardDAO implements DaoGiftCard {

	@Autowired
	@Qualifier("template1")
	JdbcTemplate jdbcTemplate2;
	
	public List<GiftCard> getAll() {
		String sql="select*from QTCard";
		return jdbcTemplate2.query(sql, new Object[] {}, new RowMapper<GiftCard>() {

			public GiftCard mapRow(ResultSet rs, int arg1) throws SQLException {
				GiftCard card=new GiftCard();
				card.setMaQT(rs.getString(1));
				card.setTenQT(rs.getString(2));
				card.setTrangthai(rs.getString(3));
				card.setGiaQT(rs.getFloat(4));
				card.setMaLoaiQT(rs.getString(5));
				
				return card;
			}
			
		});
		
		
	}

}
