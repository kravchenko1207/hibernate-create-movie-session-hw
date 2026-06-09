package mate.academy.service.impl;

import mate.academy.dao.CinemaHall;
import mate.academy.service.CinemaHallService;
import java.util.List;

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
        return null;
    }

    @Override
    public List<CinemaHall> getAll() {
        return List.of();
    }
}
