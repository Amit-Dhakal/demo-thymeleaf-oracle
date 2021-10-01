package com.infodev.service;

import com.infodev.entities.Candidateappeartoadvtnumber;

import java.util.List;

public interface ICandidateadvtnumberService {

    List<Candidateappeartoadvtnumber> findAllByMasterIdadvtnumber(String masterid, String advtcode);
    Iterable<Candidateappeartoadvtnumber> deleteByMasterIdadvtnumber(String masterid,String advtcode);

}
