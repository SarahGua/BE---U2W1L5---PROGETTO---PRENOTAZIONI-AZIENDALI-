package sarahguarneri.BEU2W1L5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W1L5.DAO.PostazioneDAO;
import sarahguarneri.BEU2W1L5.entities.Postazione;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneDAO postazioneDAO;

    public void save(Postazione postazione){
        postazioneDAO.save(postazione);
    }

//    public List<Postazione> filterByCity(String citta){
//        return postazioneDAO.findByCity(citta);
//    }
}
