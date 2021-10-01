package com.infodev.service;

import com.infodev.entities.Rmispaymentlogs;

import java.util.List;

public interface IRmispaymentService  {

    List<Rmispaymentlogs> selectAllRmisPaymentservices(String studentmasterid, String advertisementcode);

Iterable<Rmispaymentlogs> deleteAllRmispaymentlogs(String studentmasterid, String advertisementcode);


}
