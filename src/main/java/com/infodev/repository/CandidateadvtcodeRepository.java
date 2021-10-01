package com.infodev.repository;
import com.infodev.dto.SearchDto;
import com.infodev.entities.Candidateappearagainstadvtcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Map;

public interface CandidateadvtcodeRepository extends JpaRepository<Candidateappearagainstadvtcode,Long> {

    @Query(value = "select advertisementcode, max(rollno) as maxrollno, min(rollno) as minrollno, count(rollno) as countrollno from Candidateappearagainstadvtcode  where advertisementcode=?1 group by advertisementcode", nativeQuery = true)
    List<Map<String, Object>> findRollnoByAdvertisementcode(String advertisementcode);

    @Query(value="select * from Candidateappearagainstadvtcode where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    List<Candidateappearagainstadvtcode> selectAllByMasterId(String masterid,String advtcode);

   //@Query(value="select * from Candidateappeartoadvtnumber where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
  // List<Ca> selectAllAdvtNumberByMasterId(String masterid,String advtcode);

    @Modifying
    @Query(value="select * from Candidateappearagainstadvtcode where STUDENTMASTERID=?1 and ADVERTISEMENTCODE=?2",nativeQuery = true)
    Iterable<Candidateappearagainstadvtcode> deleteByMasterId(String masterid,String advtcode);

// @Query(value="SELECT * from Candidateappearagainstadvtcode",nativeQuery = true)
 //   List<Candidateappearagainstadvtcode> findAlladvtcode();

}