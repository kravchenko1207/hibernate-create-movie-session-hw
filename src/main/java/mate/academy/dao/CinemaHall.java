package mate.academy.dao;

import java.util.List;

public interface CinemaHall {

    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
