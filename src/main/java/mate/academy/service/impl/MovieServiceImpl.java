package mate.academy.service.impl;

import java.util.List;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = session.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can not add movie " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Movie get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return movieDao.get(id).get();
        } catch (Exception e) {
            throw new DataProcessingException("Can not get movie by id " + id, e);
        }
    }

    @Override
    public List<Movie> getAll() {
        Session session = null;
        Transaction transaction = null;
        List<Movie> movies = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            movies = session.createQuery("FROM Movie", Movie.class).getResultList();
            transaction.commit();
        } catch (Exception e) {
            throw new DataProcessingException("Can not get all movie from DB ", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movies;
    }
}
