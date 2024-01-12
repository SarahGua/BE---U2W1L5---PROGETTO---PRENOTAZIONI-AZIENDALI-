package sarahguarneri.BEU2W1L5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W1L5.DAO.PostazioneDAO;
import sarahguarneri.BEU2W1L5.entities.Postazione;
import sarahguarneri.BEU2W1L5.entities.Tipo;
import sarahguarneri.BEU2W1L5.entities.User;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneDAO postazioneDAO;

    public void save(Postazione postazione){
        postazioneDAO.save(postazione);
    }

    public List<Postazione> filterByCity(String citta){
        return postazioneDAO.findByCity(citta);
    }

        public List<Postazione> filterByCityAndType(String citta, Tipo tipo){
            return postazioneDAO.findByCityAndType(citta, tipo);
    }

}
