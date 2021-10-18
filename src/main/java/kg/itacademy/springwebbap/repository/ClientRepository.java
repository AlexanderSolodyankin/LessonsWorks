package kg.itacademy.springwebbap.repository;

import kg.itacademy.springwebbap.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
