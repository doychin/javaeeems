package bg.jug.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import bg.jug.domain.Event;
import bg.jug.domain.Organizer;

@Path("/api/organizers")
public class OrganizerService {
	
	@POST
	public void createOrganizer(Organizer attendee) {
		
	}

	@POST
	@Path("event")
	public void addEvent(Event event) {
		
	}
}
