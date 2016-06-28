package bg.jug.persistence;

import bg.jug.domain.User;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */
@Stateless
public class UserDAO extends AbstractDAO{

    @PersistenceContext(unitName = "ems")
    protected EntityManager em;

    public User getUserById(long id){
        return em.find(User.class,id);
    }

    public List<User> getAllUsers(){
        return em.createNamedQuery("UserDAO.getAllUsers",User.class).getResultList();
    }


    public void createUser(User User){
        em.persist(User);
    }

    public void deleteUser(long id){
        em.remove(em.find(User.class,id));
    }
}