package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.House;

import java.util.List;

public interface IHouseService extends IService<House ,String> {
    List<House>getall();

}
