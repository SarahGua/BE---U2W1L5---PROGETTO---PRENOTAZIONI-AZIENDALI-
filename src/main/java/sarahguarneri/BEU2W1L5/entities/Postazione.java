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
public class Postazione {
    @Id
    @GeneratedValue
    private UUID id;
    private String descrizione;
    private int maxPersone;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    @ManyToMany
    private List<User> user = new ArrayList<>();

    public Postazione(String descrizione, int maxPersone, Tipo tipo, Edificio edificio) {
        this.descrizione = descrizione;
        this.maxPersone = maxPersone;
        this.tipo = tipo;
        this.edificio = edificio;
        this.user = user;
    }
}
