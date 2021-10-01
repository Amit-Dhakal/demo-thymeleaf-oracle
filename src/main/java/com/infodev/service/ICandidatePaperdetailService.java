package com.infodev.service;

import com.infodev.entities.Candidatepaperdetail;

import java.util.List;

public interface ICandidatePaperdetailService {

 List<Candidatepaperdetail> selectAllPaperdetailsByMasterId(String masterid, String advertisementcode);

 Iterable<Candidatepaperdetail> deleteAllPaperdetails(String masterid, String advertisementcode);

}
