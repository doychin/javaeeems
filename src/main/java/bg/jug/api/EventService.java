package bg.jug.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import bg.jug.domain.Event;

@Path("/api/events")
public class EventService {

	
	@POST
	public void createEvent(Event event) {
		
	}
	
	@GET
	@Path("{id}")
	public void getEvent(@PathParam("id") int eventId) {
		
	}
	
	@GET
	public void getEvents(Event event) {
		
	}
	
	
}
