package com.infodev.service;

import com.infodev.dto.SearchDto;
import com.infodev.entities.*;
import java.util.List;
import java.util.Map;

public interface ICandidateadvtcodeService {
    List<Map<String,Object>> findRollnoByAdvertisementcode(String advertisementcode);
/* By amit
    List<Map<Long,Long>> findMaximumAndMinimumRollnoRange(String advertisementcode);
*/
  //  List<String> findAllSubjects();
   // List<String> findAllPapers();
    List<Candidateappearagainstadvtcode> selectAllByMasterId(String masterid,String advtcode);

    Iterable<Candidateappearagainstadvtcode> deleteByMasterId(String masterid,String advtcode);

    // List<String> selectAllAdvtNumberByMasterId(String masterid,String advtcode);
   // List<Candidateappearagainstadvtcode> findAlladvtcode();

}
