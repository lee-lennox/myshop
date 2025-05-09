package za.co.shinysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.repository.HouseRepository;

import java.util.List;

@Service
public class HouseService implements IHouseService {
    @Autowired
    private static IHouseService service;

    private HouseRepository repo;


    @Override
    public House create(House house) {
        return this.repo.save(house);
    }

    @Override
    public House read(Integer id) {
        return this.repo.findById(id).orElse(null);
    }

    @Override
    public House update(House house) {
        return this.repo.save(house);
    }

    @Override
    public boolean delete(Integer id) {
         this.repo.deleteById(id);
         return true;
    }
    @Override
    public List<House> getall() {
        return this.repo.findAll();
    }
}
