package controllers;

import java.util.List;

import entities.Region;
import services.RegionServiceImpl;

public class RegionController {
    RegionServiceImpl regionService = new RegionServiceImpl();

    public List<Region> Get() {
        return regionService.Get();
    }

    public String Post(Region region) {
        Boolean result = regionService.Post(region);
        if(result) {
            return "Insert berhasil";
        }
        else {
            return "Insert tidak berhasil";
        }
    } 
}
