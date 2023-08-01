package services;

import java.util.List;

import entities.Region;

public interface RegionService {
    List<Region> Get();
    Region Get(Integer id);
    Boolean Post(Region region);
    Boolean Put(Region region);
    Boolean Delete(Integer id);
}
