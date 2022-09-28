package ch.zli.m223.model;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

@Path("/booking")
@Tag(name = "booking", description = "Bookings")

public class BookingController {

    @Inject
    BookingService bookingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "All Bookings.", description = "Returns a list of all bookings.")
    public List<Booking> indexById() {
        return bookingService.findAll();
    }

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Index all Users.", description = "Returns a list of all users.")
    @Path("/{id}")
    public List<Booking> index(Long id) {
        return List.of(bookingService.getBookingById(id));
    }

	@DELETE
    @Path("/{id}")
    public void delete(long id) {
    bookingService.deleteBooking(id);
    }

     @PUT
     @Path("/{id}")
      public void update(Long id, Booking booking) {
        booking.setId(id);
        bookingService.update(booking);
     }



/* @Enitity 
public class Booking{
    @Id
    @GenerateValue (strategy = GenerationType.IDENTIFY)
    @Schema(readOnly = true)
    private int id;

    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private char status;

    @ManyToOne
    @JoinColumn(name = "bookingplace")
    private Bookingplace bookingplace;

    @ManyToMany
    @JoinColumn(name = "user")
    private User user;

     @ManyToOne
    @JoinColumn(name = "bookingdate")
    private Bookingdate bookingdate;


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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public = getFalse)() {
		return this.false);
	}

	public void setFalse)(= false)) {
		this.false) = false);
	}

	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	} */
}