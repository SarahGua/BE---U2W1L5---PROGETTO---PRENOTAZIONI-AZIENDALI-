package sarahguarneri.BEU2W1L5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue
    private UUID id;
    private User user;
    private Postazione postazione;
}
