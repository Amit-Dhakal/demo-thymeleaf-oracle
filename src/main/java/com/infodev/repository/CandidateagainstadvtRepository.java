package com.infodev.repository;

import com.infodev.entities.Candidateagainstadvt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateagainstadvtRepository extends JpaRepository<Candidateagainstadvt,Long> {

    @Query(value="select * from Candidateagainstadvt where candidatemasterid=?1 and advtcode=?2",nativeQuery = true)
    List<Candidateagainstadvt> selectAllCandidateagainstadvt(String masterid, String advtcode);

    @Query(value="select * from Candidateagainstadvt where candidatemasterid=?1 and advtcode=?2",nativeQuery = true)
    Iterable<Candidateagainstadvt> deleteAllCandidateagainstadvt(String masterid, String advtcode);


}
