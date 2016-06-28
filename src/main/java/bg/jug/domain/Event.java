package bg.jug.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by doychin on 28.6.2016 г..
 */
@Entity
public class Event implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private Date eventTime;

    @Column
    private String name;

    @ManyToMany
    private Collection<Attendee> attendees;

    @ManyToOne
    private Organizer organizer;

    public Event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(Collection<Attendee> attendees) {
        this.attendees = attendees;
    }
}
