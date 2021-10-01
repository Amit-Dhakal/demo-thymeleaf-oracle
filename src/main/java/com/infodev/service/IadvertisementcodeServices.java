package com.infodev.service;

import com.infodev.entities.Advertisementcode;

import java.util.List;

public interface IadvertisementcodeServices  {

    List<Advertisementcode> selectAllAdvtcodeByAdvertisementcode(String advertisementcode);

}
