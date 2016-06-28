package bg.jug.persistence;

import bg.jug.domain.Attendee;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */


@Stateful
@NamedQueries({
        @NamedQuery(name="AttendeeDAO.getAllAttendees",
                query="SELECT a FROM Attendee a")
})
public class AttendeeDAO extends AbstractDAO{

    public Attendee getAttendeeById(long id){
        return em.find(Attendee.class,id);
    }

    public List<Attendee> getAllAttendees(){
        return em.createNamedQuery("AttendeeDAO.getAllAttendees",Attendee.class).getResultList();
    }

}
