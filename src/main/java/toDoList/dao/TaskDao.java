package toDoList.dao;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import toDoList.entity.Task;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TaskDao {

    private final SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Task> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Task ORDER BY id", Task.class).list();
    }

    public List<Task> findAll(int page, int size) {
        Session session = sessionFactory.getCurrentSession();
        Query<Task> query = session.createQuery("FROM Task ORDER BY id", Task.class);
        query.setFirstResult(page * size);
        query.setMaxResults(size);
        return query.list();
    }

    public Task findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Task.class, id);
    }

    public void save(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(task);
    }

    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Task task = session.get(Task.class, id);
        if (task != null) {
            session.delete(task);
        }
    }

    public long count() {
        Session session = sessionFactory.getCurrentSession();
        Query<Long> query = session.createQuery("SELECT COUNT(*) FROM Task", Long.class);
        return query.uniqueResult();
    }
}
