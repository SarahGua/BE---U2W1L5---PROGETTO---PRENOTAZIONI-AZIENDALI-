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
public class Edificio {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome_edificio;
    private String indirizzo_edificio;
    private String citta_edificio;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazione = new ArrayList<>();

    public Edificio(String nome, String indirizzo, String citta) {
        this.nome_edificio = nome;
        this.indirizzo_edificio = indirizzo;
        this.citta_edificio = citta;
    }
}
