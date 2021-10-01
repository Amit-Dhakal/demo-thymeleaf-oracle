package com.infodev.service;

import com.infodev.entities.Advertisementcode;
import com.infodev.repository.AdvertisementcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementcodeServices implements IadvertisementcodeServices {

    @Autowired
    AdvertisementcodeRepository advtcodeRepo;

    @Override
    public List<Advertisementcode> selectAllAdvtcodeByAdvertisementcode(String advertisementcode) {
        List<Advertisementcode> advtcodeList=advtcodeRepo.selectAllAdvtcodeByAdvertisementcode(advertisementcode);
        return advtcodeList;
    }
}
