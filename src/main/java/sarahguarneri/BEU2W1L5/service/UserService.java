package sarahguarneri.BEU2W1L5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sarahguarneri.BEU2W1L5.DAO.UserDAO;
import sarahguarneri.BEU2W1L5.entities.User;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void save(User user){
        userDAO.save(user);
    }
}
