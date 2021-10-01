package com.infodev.service;

import com.infodev.entities.Candidateagainstadvt;

import java.util.List;

public interface ICandidateagainstadvtService   {

   List<Candidateagainstadvt> selectAllCandidateagainstadvt(String masterid, String advtcode);

   Iterable<Candidateagainstadvt> deleteAllCandidateagainstadvt(String masterid, String advtcode);






}
