package com.infodev.service;

import com.infodev.entities.Candidate;
import com.infodev.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService implements ICandidateService{

@Autowired
private CandidateRepository candidateRepository;

    @Override
    public List<Candidate> selectAllCandidateByMasterId(Long masterid) {
        List<Candidate> candidateList=candidateRepository.selectAllCandidateByMasterId(masterid);
        return candidateList;
    }

}
