package bg.jug.api;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import bg.jug.domain.Event;
import bg.jug.domain.Organizer;
import bg.jug.persistence.EventDAO;
import bg.jug.persistence.OrganizerDAO;

@Path("/api/organizers")
public class OrganizerService {

	@Inject
	OrganizerDAO organizerDAO;

	@Inject
	EventDAO eventDAO;

	@POST
	public Organizer createOrganizer(Organizer organizer) {
		return organizerDAO.createOrganizer(organizer);
	}

	@POST
	@Path("{id}/event")
	public Event addEvent(@PathParam("id") long organizerId, Event event) {
		return eventDAO.createEvent(organizerId, event);
	}
}
