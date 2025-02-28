import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    @Query("SELECT c FROM Contato c WHERE c.cpf LIKE '018%'")
    List<Contato> findByCpfStartingWith018();
}