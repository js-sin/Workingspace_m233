package ch.zli.m223.controller;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.User;
import ch.zli.m223.service.UserService;

@Path("/user")
@Tag(name = "user", description = "User")
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "all Users-", description = "List of all Users")
    public List <User> indexById() {
        return userService.findAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "all Users-", description = "List of all Users")
    @Path("/{id}")
    public List<User>index(int id) {
        return List.of(userService.getUserById(id));
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "creates a new User-", description = "creates and return new User")
    public User create(User user) {
        return userService.createUser(user);
    }

    @DELETE
    @Path("/{id}")
    userService.deleteUser(id);

    @PUT
    @Path("/{id}")
        public void update(int id, User user) {
        user.setId(id);
        userService.update(user);
     }



}