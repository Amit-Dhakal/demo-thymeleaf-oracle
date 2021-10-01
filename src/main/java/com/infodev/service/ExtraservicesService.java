
package com.infodev.service;

import com.infodev.entities.Extraservicestable;
import com.infodev.repository.ExtraservicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtraservicesService implements IExtraservicesService {
    @Autowired
    ExtraservicesRepository extraservicesrepo;
    @Override
    public List<Extraservicestable> selectAllExtraservices(String masterid,String advertisementcode) {

        List<Extraservicestable> listExtraservices=extraservicesrepo.selectAllExtraservices(masterid,advertisementcode);
        return listExtraservices;


    }

    @Override
    public Iterable<Extraservicestable> deleteAllExtraServices(String masterid, String advertisementcode) {
        Iterable<Extraservicestable> listExtraservices=extraservicesrepo.deleteAllExtraServices(masterid,advertisementcode);
        return listExtraservices;


    }
}

