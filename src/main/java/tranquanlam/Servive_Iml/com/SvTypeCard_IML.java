package tranquanlam.Servive_Iml.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tranquanlam.Dao.com.DaoLoaiGiftCard;
import tranquanlam.Model.com.LoaiCard;

@Service
public class SvTypeCard_IML  implements tranquanlam.Servive.com.SvTypeCard{

	@Autowired 
	DaoLoaiGiftCard card;
	public List<LoaiCard> getAll() {
		
		return card.getAll();
	}

}
