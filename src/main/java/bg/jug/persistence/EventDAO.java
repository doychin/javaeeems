package bg.jug.persistence;

import bg.jug.domain.Event;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */

@Stateless

public class EventDAO extends AbstractDAO {


    public Event getEventById(long id){
        return em.find(Event.class,id);
    }

    public List<Event> getAllEvents(){
        return em.createNamedQuery("EventDAO.getAllEvents",Event.class).getResultList();
    }
}