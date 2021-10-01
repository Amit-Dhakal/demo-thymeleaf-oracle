package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Candidateappeartoadvtnumber {
    private long id;
    private String advertisementcode;
    private String advertisementnumber;
    private Double depositedfee;
    private String paymentstatus;
    private String remarks;
    private String resultstatus;
    private String scrutinystatus;
    private String studentmasterid;
    private Double totalfee;
    private Timestamp createddate;
    private Long version;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ADVERTISEMENTCODE", nullable = true, length = 255)
    public String getAdvertisementcode() {
        return advertisementcode;
    }

    public void setAdvertisementcode(String advertisementcode) {
        this.advertisementcode = advertisementcode;
    }

    @Basic
    @Column(name = "ADVERTISEMENTNUMBER", nullable = true, length = 255)
    public String getAdvertisementnumber() {
        return advertisementnumber;
    }

    public void setAdvertisementnumber(String advertisementnumber) {
        this.advertisementnumber = advertisementnumber;
    }

    @Basic
    @Column(name = "DEPOSITEDFEE", nullable = true, precision = 0)
    public Double getDepositedfee() {
        return depositedfee;
    }

    public void setDepositedfee(Double depositedfee) {
        this.depositedfee = depositedfee;
    }

    @Basic
    @Column(name = "PAYMENTSTATUS", nullable = true, length = 255)
    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, length = 255)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "RESULTSTATUS", nullable = true, length = 255)
    public String getResultstatus() {
        return resultstatus;
    }

    public void setResultstatus(String resultstatus) {
        this.resultstatus = resultstatus;
    }

    @Basic
    @Column(name = "SCRUTINYSTATUS", nullable = true, length = 255)
    public String getScrutinystatus() {
        return scrutinystatus;
    }

    public void setScrutinystatus(String scrutinystatus) {
        this.scrutinystatus = scrutinystatus;
    }

    @Basic
    @Column(name = "STUDENTMASTERID", nullable = true, length = 255)
    public String getStudentmasterid() {
        return studentmasterid;
    }

    public void setStudentmasterid(String studentmasterid) {
        this.studentmasterid = studentmasterid;
    }

    @Basic
    @Column(name = "TOTALFEE", nullable = true, precision = 0)
    public Double getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(Double totalfee) {
        this.totalfee = totalfee;
    }

    @Basic
    @Column(name = "CREATEDDATE", nullable = true)
    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    @Basic
    @Column(name = "VERSION", nullable = true, precision = 0)
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidateappeartoadvtnumber that = (Candidateappeartoadvtnumber) o;
        return id == that.id &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(advertisementnumber, that.advertisementnumber) &&
                Objects.equals(depositedfee, that.depositedfee) &&
                Objects.equals(paymentstatus, that.paymentstatus) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(resultstatus, that.resultstatus) &&
                Objects.equals(scrutinystatus, that.scrutinystatus) &&
                Objects.equals(studentmasterid, that.studentmasterid) &&
                Objects.equals(totalfee, that.totalfee) &&
                Objects.equals(createddate, that.createddate) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementcode, advertisementnumber, depositedfee, paymentstatus, remarks, resultstatus, scrutinystatus, studentmasterid, totalfee, createddate, version);
    }
}
