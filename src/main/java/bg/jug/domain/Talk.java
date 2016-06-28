package bg.jug.domain;

import javax.persistence.*;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */
@Entity
public class Talk {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String topic;

    @Column
    private boolean accepted;

    @ManyToOne
    private User speaker;

    @ManyToOne
    private Event event;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public User getSpeaker() {
        return speaker;
    }

    public void setSpeaker(User speaker) {
        this.speaker = speaker;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Talk talk = (Talk) o;

        if (id != talk.id) return false;
        if (accepted != talk.accepted) return false;
        if (topic != null ? !topic.equals(talk.topic) : talk.topic != null) return false;
        return speaker != null ? speaker.equals(talk.speaker) : talk.speaker == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (accepted ? 1 : 0);
        result = 31 * result + (speaker != null ? speaker.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Talk{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", accepted=" + accepted +
                ", speaker=" + speaker +
                '}';
    }
}
