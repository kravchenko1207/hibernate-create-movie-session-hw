package mate.academy.service.impl;

import java.util.List;
import mate.academy.dao.CinemaHall;
import mate.academy.service.CinemaHallService;

public class CinemaHallServiceImpl implements CinemaHallService {
    private CinemaHall cinemaHall;

    public CinemaHallServiceImpl(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    @Override
    public CinemaHall add(CinemaHall cinemaHall) {
        return cinemaHall.add(cinemaHall);
    }

    @Override
    public CinemaHall get(Long id) {
        return cinemaHall.get(id);
    }

    @Override
    public List<CinemaHall> getAll() {
        return List.of(cinemaHall);
    }
}
