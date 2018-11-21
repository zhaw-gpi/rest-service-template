package ch.zhaw.gpi.veka.controller;

import ch.zhaw.gpi.veka.entities.UserEntity;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import ch.zhaw.gpi.veka.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Geschäftslogik im Zusammenhang mit Benutzern
 * 
 * @author scep
 */
@RestController
public class UserController {
    
    // Verdrahten der Benutzer-Repository
    @Autowired
    private UserRepository userRepository;
    
    /**
     * REST-Ressource für URL /vekaapi/v1/cards/{cardNumber} (GET)
     * 
     * @param userName        Benutzername
     * @return                HTTP-Response mit einem Status 200 oder 404, sowie im ersten Fall einer zum Benutzernamen passenden Benutzer-Entität als Body
     */
    @RequestMapping(value = "/userapi/v1/users/{userName}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> getUser(@PathVariable String userName){        
        // Zum Benutzername passenden Benutzer suchen
        Optional<UserEntity> user = userRepository.findByUserName(userName);
        
        // Falls Benutzer gefunden wurde, dann zurück geben
        if(user.isPresent()) {
            return new ResponseEntity(user.get(), HttpStatus.OK);
        } else {
            // Ansonsten ResourceNotFoundException (404)
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }        
    }
}
