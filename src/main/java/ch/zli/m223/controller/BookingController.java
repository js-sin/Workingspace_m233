package ch.zli.m223.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Booking;
import ch.zli.m223.service.BookingService;

@Path("/booking")
@Tag(name = "booking", description = "booking")
public class BookingController {

    @Inject
    BookingService bookingService;

    @Inject 
    JsonWebToken jwt;

    @GET
    @RolesAllowed({"Admin", "Mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "all Bookings", description = "List of all Bookings")
    public List<Booking> indexById(){
        return bookingService.findAll();
    }

    @GET
    @RolesAllowed({"Admin", "Mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "all Users" description = "List of all Users")
    @Path("/{id}")
    public List<Booking> index(int id){
        return List.of(bookingService.getBookingById(id));
    }

    @POST
    @RolesAllowed({"Admin", "Mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "create Booking", description = "new created booking")
    public Booking create(Booking booking) {
       return bookingService.createBooking(booking);
    }

    @DELETE
    @Path("/{id}")
    @RolesAllowed({"Admin", "Mitglied"})
    public void delete(Long id) {
    bookingService.deleteBooking(id);
    }

    @PUT
    @RolesAllowed({"Admin", "Mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response update(Long id, Booking booking) {
        if (booking.getUser().getId().toString().equals(jwt.getClaim("id").toString()) || jwt.getGroups().contains("Admin")) {
            booking.setId(id);
            bookingService.update(booking);
            return Response.ok(booking).build();
        }
        return Response.status(Status.UNAUTHORIZED).build();
    }
}
