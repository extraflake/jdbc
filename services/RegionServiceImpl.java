package services;

import java.util.List;

import entities.Region;
import repositories.RegionRepositoryImpl;

public class RegionServiceImpl implements RegionService {
    RegionRepositoryImpl regionRepository = new RegionRepositoryImpl();

    @Override
    public List<Region> Get() {
        return regionRepository.Get();
    }

    @Override
    public Region Get(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Get'");
    }

    @Override
    public Boolean Post(Region region) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Post'");
    }

    @Override
    public Boolean Put(Region region) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Put'");
    }

    @Override
    public Boolean Delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }
    
}
