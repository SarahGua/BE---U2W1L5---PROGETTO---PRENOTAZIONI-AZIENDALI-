package sarahguarneri.BEU2W1L5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W1L5.DAO.PrenotazioneDAO;
import sarahguarneri.BEU2W1L5.DAO.UserDAO;
import sarahguarneri.BEU2W1L5.entities.Postazione;
import sarahguarneri.BEU2W1L5.entities.Prenotazione;
import sarahguarneri.BEU2W1L5.entities.User;

import java.util.Optional;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneDAO prenotazioneDAO;

    @Autowired
    private UserDAO userDAO;

    public void save(Prenotazione pren, User user, Postazione post){
        Optional<User> userOptional = userDAO.findById(user.getId());
        if(userOptional.isPresent()){
            User existingUser = userOptional.get();
            if(existingUser.getPostazione().isEmpty()){
                existingUser.getPostazione().add(post);
                prenotazioneDAO.save(pren);
            } else {
                throw new RuntimeException("L'utente ha già una postazione prenotata");}
        } else {throw new RuntimeException("Utente non trovato");}
    }

}
