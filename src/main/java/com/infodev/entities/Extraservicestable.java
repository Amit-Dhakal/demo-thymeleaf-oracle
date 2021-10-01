package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Extraservicestable {
    private long id;
    private String masterid;
    private String advertisementcode;
    private String service1;
    private String service2;
    private String service3;
    private String service4;
    private String service5;
    private String fee;
    private String service6;
    private String service7;
    private String service8;
    private String service9;
    private String service10;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MASTERID", nullable = true, length = 100)
    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    @Basic
    @Column(name = "ADVERTISEMENTCODE", nullable = true, length = 100)
    public String getAdvertisementcode() {
        return advertisementcode;
    }

    public void setAdvertisementcode(String advertisementcode) {
        this.advertisementcode = advertisementcode;
    }

    @Basic
    @Column(name = "SERVICE1", nullable = true, length = 100)
    public String getService1() {
        return service1;
    }

    public void setService1(String service1) {
        this.service1 = service1;
    }

    @Basic
    @Column(name = "SERVICE2", nullable = true, length = 100)
    public String getService2() {
        return service2;
    }

    public void setService2(String service2) {
        this.service2 = service2;
    }

    @Basic
    @Column(name = "SERVICE3", nullable = true, length = 100)
    public String getService3() {
        return service3;
    }

    public void setService3(String service3) {
        this.service3 = service3;
    }

    @Basic
    @Column(name = "SERVICE4", nullable = true, length = 100)
    public String getService4() {
        return service4;
    }

    public void setService4(String service4) {
        this.service4 = service4;
    }

    @Basic
    @Column(name = "SERVICE5", nullable = true, length = 100)
    public String getService5() {
        return service5;
    }

    public void setService5(String service5) {
        this.service5 = service5;
    }

    @Basic
    @Column(name = "FEE", nullable = true, length = 100)
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "SERVICE6", nullable = true, length = 100)
    public String getService6() {
        return service6;
    }

    public void setService6(String service6) {
        this.service6 = service6;
    }

    @Basic
    @Column(name = "SERVICE7", nullable = true, length = 100)
    public String getService7() {
        return service7;
    }

    public void setService7(String service7) {
        this.service7 = service7;
    }

    @Basic
    @Column(name = "SERVICE8", nullable = true, length = 100)
    public String getService8() {
        return service8;
    }

    public void setService8(String service8) {
        this.service8 = service8;
    }

    @Basic
    @Column(name = "SERVICE9", nullable = true, length = 100)
    public String getService9() {
        return service9;
    }

    public void setService9(String service9) {
        this.service9 = service9;
    }

    @Basic
    @Column(name = "SERVICE10", nullable = true, length = 100)
    public String getService10() {
        return service10;
    }

    public void setService10(String service10) {
        this.service10 = service10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extraservicestable that = (Extraservicestable) o;
        return id == that.id &&
                Objects.equals(masterid, that.masterid) &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(service1, that.service1) &&
                Objects.equals(service2, that.service2) &&
                Objects.equals(service3, that.service3) &&
                Objects.equals(service4, that.service4) &&
                Objects.equals(service5, that.service5) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(service6, that.service6) &&
                Objects.equals(service7, that.service7) &&
                Objects.equals(service8, that.service8) &&
                Objects.equals(service9, that.service9) &&
                Objects.equals(service10, that.service10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, masterid, advertisementcode, service1, service2, service3, service4, service5, fee, service6, service7, service8, service9, service10);
    }
}

