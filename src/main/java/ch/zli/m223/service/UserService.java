package ch.zli.m223.service;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import ch.zli.m223.model.User;

@ApplicationScoped
public class UserService{
    @Inject
    private EntityManager EntityManager

    @Transactional
    public User createUser(User user){
        entityMangaer.persist(user);
        return user;
    }
    @Transactional
    public void deleteUser(int id){
        User user = entityMangaer.find(User.class, id);
        entityMangaer.remove(user);
    }
    @Transactional
    public void update(User user){
        entityManager.merge(user);
    }
    public List<User> findAll() {
        var query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }
    public User getUserById(Long id){
        return entityManager.find(User.class, id);
    }
}