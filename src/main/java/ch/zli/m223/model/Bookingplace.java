package ch.zli.m223.model;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import ch.zli.m223.model.Bookingplace;


@Path("/place")
@Tag(name = "place", description = "Place")

public class PlaceController {

    @Inject
    PlaceService placeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Index all Places.", description = "Returns a list of all Places.")
    public List<Place> indexById() {
        return placeService.findAll();
    }

	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creates a new user.", description = "Creates a new user and returns the newly added user.")
    public Place create(Place place) {
       return placeService.createPlace(place);
    }

    @DELETE
    @Path("/{id}")
    public void delete(long id) {
    placeService.deletePlace(id);
    }

     @PUT
     @Path("/{id}")
      public void update(Long id, Place place) {
        place.setId(id);
        placeService.update(place);
     }


/* @Enitity 
public class Bookingplace{
     @Id
    @GenerateValue(strategy = GenerationType.IDENTIFY)
    @Schema(readOnly = true)
    private int id;

     @Column(nullable = false)
    private String place_number;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace_number() {
		return this.place_number;
	}

	public void setPlace_number(String place_number) {
		this.place_number = place_number;
	}

    @OneToMany(mappedBy = "bokkingplace")
    @JsonIgnore
    private Set<Booking> booking; */
   
}