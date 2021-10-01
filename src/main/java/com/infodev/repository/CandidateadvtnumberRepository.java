package com.infodev.repository;

import com.infodev.entities.Candidateappeartoadvtnumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CandidateadvtnumberRepository extends JpaRepository<Candidateappeartoadvtnumber,Long> {

    @Query(value="select * from Candidateappeartoadvtnumber where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    List<Candidateappeartoadvtnumber> findAllByMasterIdadvtnumber(String masterid,String advtcode);


    @Query(value="select * from Candidateappeartoadvtnumber where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    Iterable<Candidateappeartoadvtnumber> deleteByMasterIdadvtnumber(String masterid,String advtcode);



}
