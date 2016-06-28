package bg.jug.persistence;

import bg.jug.domain.Organizer;

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
        @NamedQuery(name="OrganizerDAO.getAllOrganizers",
                query="SELECT o FROM Organizer o")
})
public class OrganizerDAO extends AbstractDAO{
    public Organizer getOrganizerById(long id){
        return em.find(Organizer.class,id);
    }

    public List<Organizer> getAllOrganizers(){
        return em.createNamedQuery("EventDAO.getAllOrganizers",Organizer.class).getResultList();
    }

}