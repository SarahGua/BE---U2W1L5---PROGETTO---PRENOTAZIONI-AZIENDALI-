package sarahguarneri.BEU2W1L5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W1L5.entities.Postazione;
import sarahguarneri.BEU2W1L5.entities.Tipo;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, UUID> {

    @Query("SELECT p FROM Postazione p WHERE p.edificio.citta = :citta")
    List<Postazione> findByCity(String citta);

    @Query("SELECT p FROM Postazione p WHERE p.edificio.citta = :citta AND p.tipo = :tipo")
    List<Postazione> findByCityAndType(String citta, Tipo tipo);
}
