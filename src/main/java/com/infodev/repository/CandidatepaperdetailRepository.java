package com.infodev.repository;

import com.infodev.entities.Candidatepaperdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidatepaperdetailRepository extends JpaRepository<Candidatepaperdetail,Long> {

    @Query(value="select * from Candidatepaperdetail where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    List<Candidatepaperdetail> selectAllPaperdetailsByMasterId(String studentmasterid, String advertisementcode);


    @Query(value="select * from Candidatepaperdetail where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    Iterable<Candidatepaperdetail> deleteAllPaperdetails(String studentmasterid, String advertisementcode);

}
