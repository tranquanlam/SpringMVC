package tranquanlam.Servive.com;

import java.util.List;

import org.springframework.stereotype.Service;

import tranquanlam.Model.com.LoaiCard;

@Service
public interface SvTypeCard {
    public List<LoaiCard> getAll();
}
