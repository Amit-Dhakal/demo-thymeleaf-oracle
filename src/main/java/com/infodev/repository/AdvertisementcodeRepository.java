package com.infodev.repository;

import com.infodev.entities.Advertisementcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertisementcodeRepository extends JpaRepository<Advertisementcode,Long> {

    @Query(value="select * from Advertisementcode where ADVERTISEMENTCODE=?1",nativeQuery = true)
     List<Advertisementcode> selectAllAdvtcodeByAdvertisementcode(String advertisementcode);

}