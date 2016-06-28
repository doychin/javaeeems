package bg.jug.persistence;

import bg.jug.domain.Event;

import javax.ejb.Stateful;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */

@Stateful
@NamedQueries({
        @NamedQuery(name="EventDAO.getAllEvents",
                query="SELECT e FROM Event e")
})
public class EventDAO extends AbstractDAO {

    public Event getEventById(long id){
        return em.find(Event.class,id);
    }

    public List<Event> getAllEvents(){
        return em.createNamedQuery("EventDAO.getAllEvents",Event.class).getResultList();
    }
    
    public Event createEvent(long organizerId, Event event) {
    	Organizer organizer = em.find(Organizer.class, organizerId);
    	event.setOrganizer(organizer);
    	em.persist(event);
    	return event;
    }
}