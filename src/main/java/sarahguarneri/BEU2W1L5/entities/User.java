package sarahguarneri.BEU2W1L5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String nomeCompleto;
    private String email;
    @ManyToMany
    @JoinTable(
            name = "user_postazioni",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "postazione_id")
    )
    private List<Postazione> postazione = new ArrayList<>();

    public User(String username, String nomeCompleto, String email) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.postazione = postazione;
    }
}
