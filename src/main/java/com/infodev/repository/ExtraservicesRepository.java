
package com.infodev.repository;

import com.infodev.entities.Extraservicestable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExtraservicesRepository extends JpaRepository<Extraservicestable,Long> {

    @Query(value="select * from Extraservicestable WHERE masterid=?1 and advertisementcode=?2",nativeQuery = true)
     List<Extraservicestable> selectAllExtraservices(String masterid, String advertisementcode);


    @Query(value="select * from Extraservicestable WHERE masterid=?1 and advertisementcode=?2",nativeQuery = true)
    Iterable<Extraservicestable> deleteAllExtraServices(String masterid, String advertisementcode);



}

