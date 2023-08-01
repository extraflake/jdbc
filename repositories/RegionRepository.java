package repositories;

import java.util.List;

import entities.Region;

public interface RegionRepository {
    List<Region> Get();
    Region Get(Integer id);
    Boolean Post(Region region);
    Boolean Put(Region region);
    Boolean Delete(Integer id);
}
