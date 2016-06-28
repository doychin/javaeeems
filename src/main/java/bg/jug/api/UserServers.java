package bg.jug.api;

import bg.jug.domain.User;
import bg.jug.persistence.UserDAO;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by Dmitry Alexandrov on 28.06.16.
 */
@Path("/api/attendees")
public class UserServers {

    @Inject
    private UserDAO userDAO;

    @POST
    public void createUser(User user) {
        userDAO.createUser(user);
    }
}
