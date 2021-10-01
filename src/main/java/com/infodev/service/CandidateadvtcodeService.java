package com.infodev.service;

import com.infodev.dto.SearchDto;
import com.infodev.entities.*;
import com.infodev.repository.CandidateadvtcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class CandidateadvtcodeService implements ICandidateadvtcodeService{

    @Autowired
    private CandidateadvtcodeRepository candidateadvtcodeRepository;

    @Override
    public  List<Map<String,Object>> findRollnoByAdvertisementcode(String advertisementcode) {
        List<Map<String,Object>> rollno = candidateadvtcodeRepository.findRollnoByAdvertisementcode(advertisementcode);
        return rollno;
    }
   /* @Override
    public List<String> findAllSubjects() {
        List<String> list=candidateadvtcodeRepository.findAllSubjects();
        return list;
    }
    @Override
    public List<String> findAllPapers() {
        List<String> papersList=candidateadvtcodeRepository.findAllPapers();
        return papersList;
    }*/
    @Override
    public List<Candidateappearagainstadvtcode> selectAllByMasterId(String masterid, String advtcode) {
        List<Candidateappearagainstadvtcode> listcandtadvtcode=candidateadvtcodeRepository.selectAllByMasterId(masterid,advtcode);
        return listcandtadvtcode;
    }


    public Iterable<Candidateappearagainstadvtcode> deleteByMasterId(String masterid,String advtcode) {
        return candidateadvtcodeRepository.deleteByMasterId(masterid,advtcode);
    }


   /* @Override
    public List<Candidateappearagainstadvtcode> findAlladvtcode() {
        List<Candidateappearagainstadvtcode> listall=candidateadvtcodeRepository.findAlladvtcode();
        return listall;
    }*/

  /* @Override
    public List<String> selectAllAdvtNumberByMasterId(String masterid,String advtcode) {
        List<String> listcandtadvtnumber=candidateadvtcodeRepository.selectAllAdvtNumberByMasterId(masterid,advtcode);
        return listcandtadvtnumber;
    }*/

}
