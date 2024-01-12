package sarahguarneri.BEU2W1L5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W1L5.DAO.EdificioDAO;
import sarahguarneri.BEU2W1L5.entities.Edificio;

@Service
public class EdificioService {

    @Autowired
    private EdificioDAO edificioDAO;

    public void save(Edificio edificio){
        edificioDAO.save(edificio);
    }
}
