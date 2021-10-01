package com.infodev.service;

import com.infodev.entities.Candidate;

import java.util.List;

public interface ICandidateService {

    List<Candidate> selectAllCandidateByMasterId(Long masterid);


}
