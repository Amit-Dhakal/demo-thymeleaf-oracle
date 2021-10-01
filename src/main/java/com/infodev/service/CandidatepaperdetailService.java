package com.infodev.service;

import com.infodev.entities.Candidatepaperdetail;
import com.infodev.repository.CandidatepaperdetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatepaperdetailService implements ICandidatePaperdetailService  {
    @Autowired
    CandidatepaperdetailRepository candidatepaperdetailRepository;
    @Override
    public List<Candidatepaperdetail> selectAllPaperdetailsByMasterId(String masterid,String advertisementcode) {

        List<Candidatepaperdetail> listPaperdetailsservices=candidatepaperdetailRepository.selectAllPaperdetailsByMasterId(masterid,advertisementcode);
        return listPaperdetailsservices;
    }

    @Override
    public Iterable<Candidatepaperdetail> deleteAllPaperdetails(String masterid, String advertisementcode) {

        Iterable<Candidatepaperdetail> candidatepaperdetailsList=candidatepaperdetailRepository.deleteAllPaperdetails(masterid,advertisementcode);
        return candidatepaperdetailsList;
    }


}
