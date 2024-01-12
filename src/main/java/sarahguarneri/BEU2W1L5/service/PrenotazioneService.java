package sarahguarneri.BEU2W1L5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W1L5.DAO.PrenotazioneDAO;
import sarahguarneri.BEU2W1L5.entities.Postazione;
import sarahguarneri.BEU2W1L5.entities.Prenotazione;
import sarahguarneri.BEU2W1L5.entities.User;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneDAO prenotazioneDAO;

    public void save(Prenotazione pren){
        prenotazioneDAO.save(pren);
    }

}
