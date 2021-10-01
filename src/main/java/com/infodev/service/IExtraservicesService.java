
package com.infodev.service;

import com.infodev.entities.Extraservicestable;

import java.util.List;

public interface IExtraservicesService {

    List<Extraservicestable> selectAllExtraservices(String masterid, String advertisementcode);

    Iterable<Extraservicestable> deleteAllExtraServices(String masterid, String advertisementcode);

}

