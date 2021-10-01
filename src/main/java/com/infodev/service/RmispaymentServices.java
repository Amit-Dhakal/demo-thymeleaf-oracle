package com.infodev.service;

import com.infodev.entities.Rmispaymentlogs;
import com.infodev.repository.RmispaymentlogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RmispaymentServices implements IRmispaymentService {

    @Autowired
    RmispaymentlogsRepository rmispaymentrepository;

    @Override
    public List<Rmispaymentlogs> selectAllRmisPaymentservices(String studentmasterid, String advertisementcode) {
        List<Rmispaymentlogs> listRmispayment=rmispaymentrepository.selectAllRmisPaymentservices(studentmasterid,advertisementcode);
        return listRmispayment;
    }

    @Override
    public Iterable<Rmispaymentlogs> deleteAllRmispaymentlogs(String studentmasterid, String advertisementcode) {

        Iterable<Rmispaymentlogs> listRmispaymentlogs=rmispaymentrepository.deleteAllRmispaymentlogs(studentmasterid,advertisementcode);
        return listRmispaymentlogs;

    }
}
