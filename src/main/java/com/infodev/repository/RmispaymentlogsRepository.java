package com.infodev.repository;

import com.infodev.entities.Rmispaymentlogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RmispaymentlogsRepository extends JpaRepository<Rmispaymentlogs,Long>{

    @Query(value="select * from Rmispaymentlogs where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
     List<Rmispaymentlogs> selectAllRmisPaymentservices(String studentmasterid, String advertisementcode);



    @Query(value="select * from Rmispaymentlogs where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    Iterable<Rmispaymentlogs> deleteAllRmispaymentlogs(String studentmasterid, String advertisementcode);
}
