package com.infodev.service;

import com.infodev.entities.Candidateappeartoadvtnumber;
import com.infodev.repository.CandidateadvtnumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateadvtnumberService implements ICandidateadvtnumberService {

@Autowired
private CandidateadvtnumberRepository candidateadvtnumberRepository;

    @Override
    public List<Candidateappeartoadvtnumber> findAllByMasterIdadvtnumber(String masterid, String advtcode) {

        List<Candidateappeartoadvtnumber> listcandiadteadvtnumber=candidateadvtnumberRepository.findAllByMasterIdadvtnumber(masterid,advtcode);
        return listcandiadteadvtnumber;

    }

    @Override
    public Iterable<Candidateappeartoadvtnumber> deleteByMasterIdadvtnumber(String masterid, String advtcode) {

        Iterable<Candidateappeartoadvtnumber> listcandiadteadvtnumber=candidateadvtnumberRepository.deleteByMasterIdadvtnumber(masterid,advtcode);
        return listcandiadteadvtnumber;
    }
}
