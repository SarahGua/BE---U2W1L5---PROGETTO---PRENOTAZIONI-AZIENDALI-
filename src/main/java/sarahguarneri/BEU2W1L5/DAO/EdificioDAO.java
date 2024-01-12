package sarahguarneri.BEU2W1L5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W1L5.entities.Edificio;

import java.util.UUID;

@Repository
public interface EdificioDAO extends JpaRepository<Edificio, UUID> {
}
