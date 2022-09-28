package ch.zli.m223.service;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;


import ch.zli.m223.model.Bookinglace;

@ApplicationScoped
public class BookingplaceService{
    @Inject
    private EntityManager entityManager;

    @Transactional
    public Bookingplace createBookingplace(Bookingplace bookingplace){
        entityManager = entityManager.find(Bookingplace.class, id);
        entityManager.remove(bookingplace);
    }
    @Transactional
    public void update(Bookingplace bookingplace){
        entityManager.merge(bookingplace);
    }
    public List<Bookingplace> findAll(){
        var query = entityManager.createQuery("from Bookingplace", Bookingplace.class);
        return query.getResultList();
    }
    public Bookingplace getBookingplaceById(int id){
        return entityManager.find(Bookingplace.class, id)
    }
}