package ch.zhaw.gpi.veka.repositories;

import ch.zhaw.gpi.veka.entities.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository-Klasse für Benutzer-Entität, welche CRUD-Operationen auf die dahinterliegende Datenbank kapselt
 * 
 * @author scep
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findByUserName(String userName);
}
