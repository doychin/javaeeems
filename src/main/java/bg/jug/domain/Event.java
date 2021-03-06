package bg.jug.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by doychin on 28.6.2016 г..
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NamedQueries({
        @NamedQuery(name="EventDAO.getAllEvents",
                query="SELECT e FROM Event e")
})
public class Event implements Serializable {

    @Id
    @GeneratedValue
    @XmlElement
    private long id;

    @Column
    @XmlElement(required=true)
    @Temporal(TemporalType.DATE)
    private Date eventTime;

    @Column
    @XmlElement(required=true)
    private String name;

    @ManyToMany
    private Collection<User> attendees;

    @ManyToOne
    private User organizer;

    @OneToMany(mappedBy = "event")
    private List<Talk> talks;

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

    public Collection<User> getAttendees() {
        return attendees;
    }

    public void setAttendees(Collection<User> attendees) {
        this.attendees = attendees;
    }
    
    public User getOrganizer() {
		return organizer;
	}
    
    public void setOrganizer(User organizer) {
		this.organizer = organizer;
	}


}
