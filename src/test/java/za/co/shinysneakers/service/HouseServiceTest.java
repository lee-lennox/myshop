package za.co.shinysneakers.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.factory.HouseFactcory;

import static org.junit.jupiter.api.Assertions.*;

class HouseServiceTest {

private HouseService houseService ;
private House house = HouseFactcory.validateStringAttribbutesAndCreateHouse("Dickson","phb","plk","Limpopo");
    @Test
    void create() {
        House crated =houseService.create(house);
        assertNotNull(crated);
        System.out.println(crated);
    }

    @Test
    void read() {
        House read= houseService.read(house.getErfNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        House newHouse =new House.Builder().copy(house).setCity("cpt").build();
        House updated =houseService.update(newHouse);
        assertNotNull(updated);
    }


    @Test
    void getall() {
        System.out.println(houseService.getall());
    }
}