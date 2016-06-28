package bg.jug.persistence;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import bg.jug.domain.Organizer;

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

    public Organizer createOrganizer(Organizer organizer){
    	em.persist(organizer);
    	em.flush();
    	return organizer;
    }
    
}