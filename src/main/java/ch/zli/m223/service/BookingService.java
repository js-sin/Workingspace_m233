package ch.zli.m223.service;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.zli.m223.model.Booking;
import ch.zli.m223.model.User;

@ApplicationScoped
public class BookingService{
    @Inject
    private EntityManager entityManager;

     public List<Booking> findAll() {
        var query = entityManager.createQuery("FROM; Booking", Booking.class);
        return query.getResultList();
    }
     public Booking getBookingById(Long id){
        return entityManager.find(Booking.class, id);
    }
    @Transactional
    public Booking createBooking(Booking booking){
        entityManager.persist(booking);
        return booking;
    }
    @Transactional
    public void deleteBooking(int id){
        Booking booking =  entityManager.find(Booking.class, id);
        entityManager.remove(booking);
    }
    @Transactional
    public void update(Booking booking){
        entityManager.merge(booking);
    }

}