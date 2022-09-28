package ch.zli.m223.model;


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
@Tag(name = "user", description = "Handling of User")
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Index all Users.", description = "Returns a list of all users.")
    public List<User> indexById() {
        return userService.findAll();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Index all Users.", description = "Returns a list of all users.")
    @Path("/{id}")
    public List<User> index(Long id) {
        return List.of(userService.getUserById(id));
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creates a new user.", description = "Creates a new user and returns the newly added user.")
    public User create(User user) {
       return userService.createUser(user);
    }

    @DELETE
    @Path("/{id}")
    public void delete(long id) {
    userService.deleteUser(id);
    }

     @PUT
     @Path("/{id}")
      public void update(Long id, User user) {
        user.setId(id);
        userService.update(user);
     }


/* 
@Enitity 
public class User{
    @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    @Schema(readOnly = true)
    private int id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private char age; 

    @Column(nullable = false)
    private String email; 

    @Column(nullable = false)
    private String password;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public char getAge() {
		return this.age;
	}

	public void setAge(char age) {
		this.age = age;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

*/

}