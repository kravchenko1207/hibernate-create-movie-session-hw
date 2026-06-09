package mate.academy.dao;

import java.util.List;

public interface CinemaHallDao {

    CinemaHallDao add(CinemaHallDao cinemaHall);

    CinemaHallDao get(Long id);

    List<CinemaHallDao> getAll();
}
