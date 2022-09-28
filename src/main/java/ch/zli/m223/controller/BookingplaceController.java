package ch.zli.m223.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ch.zli.m223.model.Booking;
import ch.zli.m223.service.BookingService;

@Path("/bookingplace")
@Tag(name = "bookingplace", description = "Bookingplace")
public class BookingPlaceController {
    @Inject
    BookingplaceService bookingplaceservice;

    @GET
     @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "places", description = "List of all places")
    public List<Bookingplace> indexById() {
        return BookingplaceService.findAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "1 place", description = "one place")
    @Path("/{id}")
    public List<Place> index(int id) {
        return List.of(BookingplaceService.getBookingplaceById(id));
    }
    @POST
    @RolesAllowed({"Admin", "Mitglied"})
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "create new User", description = "shows created new User")
    public Bookingplace create(Bookingplace bookingplace) {
       return bookingplaceService.createBookingplace(bookingplace);
    }
    //DA WEITER ARBEITEN
    @DELETE
    @RolesAllowed("Admin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public void delete(Long id) {
    bookingplaceService.deleteBookingplace(id);
    }

    @PUT
    @RolesAllowed("Admin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public void update(Long id, Bookinplace bookingplace) {
        Bookingplace.setId(id);
        bookingplaceService.update(bookingplace);
     }
}