package sarahguarneri.BEU2W1L5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sarahguarneri.BEU2W1L5.entities.Edificio;
import sarahguarneri.BEU2W1L5.entities.Postazione;
import sarahguarneri.BEU2W1L5.entities.Tipo;
import sarahguarneri.BEU2W1L5.entities.User;
import sarahguarneri.BEU2W1L5.service.EdificioService;
import sarahguarneri.BEU2W1L5.service.PostazioneService;
import sarahguarneri.BEU2W1L5.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    UserService userService;
    @Autowired
    EdificioService edificioService;
    @Autowired
    PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Sarah97", "Sarah Guarneri", "sarah@icloud.com");
        User user2 = new User("Luca85-", "Luca Rossi", "luca@icloud.com");
        User user3 = new User("Gioia2222", "Gioia Pura", "pura@icloud.com");
        User user4 = new User("Leti777", "Letizia Bianchi", "leti77@icloud.com");
        User user5 = new User("CaConti", "Carlo Conti", "carlo@icloud.com");
//        userService.save(user1);
//        userService.save(user2);
//        userService.save(user3);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


        Edificio e1 = new Edificio("Edificio1", "Via Carlo Cattaneo 12", "Bologna");
        Edificio e2 = new Edificio("Edificio2", "Via Emanuele 3", "Brindisi");
        Edificio e3 = new Edificio("Edificio3", "Via Gorizia 55", "Gallarate");
//        edificioService.save(e1);
//        edificioService.save(e2);
//        edificioService.save(e3);

        Postazione p1 = new Postazione("Ampia", 30, Tipo.OPENSPACE, e1);
        Postazione p2 = new Postazione("Accogliente", 20, Tipo.SALA_RIUNIONI, e2);
        Postazione p3 = new Postazione("Intima", 10, Tipo.PRIVATO, e3);
        Postazione p4 = new Postazione("Colorata", 10, Tipo.PRIVATO, e1);
        Postazione p5 = new Postazione("Luminosa", 30, Tipo.OPENSPACE, e3);
//        postazioneService.save(p1);
//        postazioneService.save(p2);
//        postazioneService.save(p3);
//        postazioneService.save(p4);
//        postazioneService.save(p5);
        List<Postazione> postazioni = new ArrayList<>();
        postazioni.add(p1);
        postazioni.add(p2);
        postazioni.add(p3);
        postazioni.add(p4);
        postazioni.add(p5);

        postazioneService.filterByCity("Gallarate").forEach(System.out::println);
        postazioneService.filterByCityAndType("Gallarate", Tipo.PRIVATO).forEach(System.out::println);

    }
}
