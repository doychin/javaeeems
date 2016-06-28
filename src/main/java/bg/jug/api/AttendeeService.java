package bg.jug.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import bg.jug.domain.Attendee;

@Path("/api/attendees")
public class AttendeeService {

	@POST
	public void createAttendee(Attendee attendee) {
		
	}
}
