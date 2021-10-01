package com.infodev.dto;

public class SearchDto {
    private String studentmasterid;
    private String advertisementcode;
    private String masterid;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    public String getStudentmasterid() {
        return studentmasterid;
    }

    public void setStudentmasterid(String studentmasterid) {
        this.studentmasterid = studentmasterid;
    }

    public String getAdvertisementcode() {
        return advertisementcode;
    }

    public void setAdvertisementcode(String advertisementcode) {
        this.advertisementcode = advertisementcode;
    }
}
