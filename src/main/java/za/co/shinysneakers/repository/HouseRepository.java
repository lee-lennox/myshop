package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.House;

import java.util.List;
@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {

}
