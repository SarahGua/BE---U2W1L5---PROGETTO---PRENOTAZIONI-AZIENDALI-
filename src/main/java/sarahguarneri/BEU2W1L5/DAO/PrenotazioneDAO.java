package sarahguarneri.BEU2W1L5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W1L5.entities.Prenotazione;

import java.util.UUID;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, UUID> {
}
