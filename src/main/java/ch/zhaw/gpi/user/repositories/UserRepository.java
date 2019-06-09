package ch.zhaw.gpi.user.repositories;

import ch.zhaw.gpi.user.entities.UserEntity;
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
