package com.infodev.service;

import com.infodev.entities.Candidateagainstadvt;
import com.infodev.repository.CandidateagainstadvtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateagainstadvtService implements ICandidateagainstadvtService {
    @Autowired
    CandidateagainstadvtRepository candidateagainstadvtRepository;

    @Override
    public List<Candidateagainstadvt> selectAllCandidateagainstadvt(String masterid, String advtcode) {

        List<Candidateagainstadvt> candidateagainstadvtList=candidateagainstadvtRepository.selectAllCandidateagainstadvt(masterid,advtcode);
        return candidateagainstadvtList;
    }

    @Override
    public Iterable<Candidateagainstadvt> deleteAllCandidateagainstadvt(String masterid, String advtcode) {

        Iterable<Candidateagainstadvt> candidateagainstadvtList=candidateagainstadvtRepository.deleteAllCandidateagainstadvt(masterid,advtcode);
        return candidateagainstadvtList;
    }


}
