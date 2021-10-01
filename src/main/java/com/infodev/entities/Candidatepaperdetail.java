package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Candidatepaperdetail {
    private long id;
    private String advertisementcode;
    private String attendancestatus;
    private String ispaperquestionwise;
    private String ispapersectionwise;
    private Double marksobtained;
    private String paperoption;
    private String remarks;
    private String rollno;
    private String studentmasterid;
    private String subjectid;
    private Double totalmarks;

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
    @Column(name = "ATTENDANCESTATUS", nullable = true, length = 255)
    public String getAttendancestatus() {
        return attendancestatus;
    }

    public void setAttendancestatus(String attendancestatus) {
        this.attendancestatus = attendancestatus;
    }

    @Basic
    @Column(name = "ISPAPERQUESTIONWISE", nullable = true, length = 255)
    public String getIspaperquestionwise() {
        return ispaperquestionwise;
    }

    public void setIspaperquestionwise(String ispaperquestionwise) {
        this.ispaperquestionwise = ispaperquestionwise;
    }

    @Basic
    @Column(name = "ISPAPERSECTIONWISE", nullable = true, length = 255)
    public String getIspapersectionwise() {
        return ispapersectionwise;
    }

    public void setIspapersectionwise(String ispapersectionwise) {
        this.ispapersectionwise = ispapersectionwise;
    }

    @Basic
    @Column(name = "MARKSOBTAINED", nullable = true, precision = 0)
    public Double getMarksobtained() {
        return marksobtained;
    }

    public void setMarksobtained(Double marksobtained) {
        this.marksobtained = marksobtained;
    }

    @Basic
    @Column(name = "PAPEROPTION", nullable = true, length = 255)
    public String getPaperoption() {
        return paperoption;
    }

    public void setPaperoption(String paperoption) {
        this.paperoption = paperoption;
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
    @Column(name = "ROLLNO", nullable = true, length = 255)
    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
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
    @Column(name = "SUBJECTID", nullable = true, length = 255)
    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    @Basic
    @Column(name = "TOTALMARKS", nullable = true, precision = 0)
    public Double getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(Double totalmarks) {
        this.totalmarks = totalmarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidatepaperdetail that = (Candidatepaperdetail) o;
        return id == that.id &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(attendancestatus, that.attendancestatus) &&
                Objects.equals(ispaperquestionwise, that.ispaperquestionwise) &&
                Objects.equals(ispapersectionwise, that.ispapersectionwise) &&
                Objects.equals(marksobtained, that.marksobtained) &&
                Objects.equals(paperoption, that.paperoption) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(rollno, that.rollno) &&
                Objects.equals(studentmasterid, that.studentmasterid) &&
                Objects.equals(subjectid, that.subjectid) &&
                Objects.equals(totalmarks, that.totalmarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementcode, attendancestatus, ispaperquestionwise, ispapersectionwise, marksobtained, paperoption, remarks, rollno, studentmasterid, subjectid, totalmarks);
    }
}
