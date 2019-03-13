package tranquanlam.Servive_Iml.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tranquanlam.Dao.com.DaoGiftCard;
import tranquanlam.Model.com.GiftCard;
import tranquanlam.Servive.com.SvGiftCard;

@Service
public class svGiftCard_iml implements SvGiftCard {

	@Autowired
	DaoGiftCard card;
	
	public List<GiftCard> getAll() {
		// TODO Auto-generated method stub
		return card.getAll();
	}

}
