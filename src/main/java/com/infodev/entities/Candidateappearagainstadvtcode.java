package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Candidateappearagainstadvtcode {
    private long id;
    private String advertisementcode;
    private Integer ageonlastdateday;
    private Integer ageonlastdatemonth;
    private Integer ageonlastdateyear;
    private String applicationnumber;
    private String attendancestatus;
    private String candidatefirstname;
    private String dateofbirthinnepali;
    private String documentverificationstatus;
    private String examinationcenterid;
    private String examresultsstatus;
    private String fathername;
    private Long firstcoding;
    private String lastdateofformsubmission;
    private String grandfathername;
    private String interviewdate;
    private String interviewmarksallocationstatus;
    private String interviewscheduledstatus;
    private String mothername;
    private String candidatenameinnepali;
    private Double marksobtained;
    private String optionalpaperid;
    private String panelname;
    private String paymentstatus;
    private String remarks;
    private String resultstatus;
    private Long rollno;
    private String scrutinyoffice;
    private String scrutinystatus;
    private Long secondcode;
    private String sex;
    private String studentmasterid;
    private Double totalmarks;
    private String amountpaid;
    private String challanid;
    private String picurl;
    private String signurl;
    private String qusForQualification;
    private String facMinQualification;
    private String serviceOptionOne;
    private String serviceOptionTwo;
    private String mainSubject;
    private Timestamp createddate;
    private String version;

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
    @Column(name = "AGEONLASTDATEDAY", nullable = true, precision = 0)
    public Integer getAgeonlastdateday() {
        return ageonlastdateday;
    }

    public void setAgeonlastdateday(Integer ageonlastdateday) {
        this.ageonlastdateday = ageonlastdateday;
    }

    @Basic
    @Column(name = "AGEONLASTDATEMONTH", nullable = true, precision = 0)
    public Integer getAgeonlastdatemonth() {
        return ageonlastdatemonth;
    }

    public void setAgeonlastdatemonth(Integer ageonlastdatemonth) {
        this.ageonlastdatemonth = ageonlastdatemonth;
    }

    @Basic
    @Column(name = "AGEONLASTDATEYEAR", nullable = true, precision = 0)
    public Integer getAgeonlastdateyear() {
        return ageonlastdateyear;
    }

    public void setAgeonlastdateyear(Integer ageonlastdateyear) {
        this.ageonlastdateyear = ageonlastdateyear;
    }

    @Basic
    @Column(name = "APPLICATIONNUMBER", nullable = true, length = 255)
    public String getApplicationnumber() {
        return applicationnumber;
    }

    public void setApplicationnumber(String applicationnumber) {
        this.applicationnumber = applicationnumber;
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
    @Column(name = "CANDIDATEFIRSTNAME", nullable = true, length = 255)
    public String getCandidatefirstname() {
        return candidatefirstname;
    }

    public void setCandidatefirstname(String candidatefirstname) {
        this.candidatefirstname = candidatefirstname;
    }

    @Basic
    @Column(name = "DATEOFBIRTHINNEPALI", nullable = true, length = 255)
    public String getDateofbirthinnepali() {
        return dateofbirthinnepali;
    }

    public void setDateofbirthinnepali(String dateofbirthinnepali) {
        this.dateofbirthinnepali = dateofbirthinnepali;
    }

    @Basic
    @Column(name = "DOCUMENTVERIFICATIONSTATUS", nullable = true, length = 255)
    public String getDocumentverificationstatus() {
        return documentverificationstatus;
    }

    public void setDocumentverificationstatus(String documentverificationstatus) {
        this.documentverificationstatus = documentverificationstatus;
    }

    @Basic
    @Column(name = "EXAMINATIONCENTERID", nullable = true, length = 255)
    public String getExaminationcenterid() {
        return examinationcenterid;
    }

    public void setExaminationcenterid(String examinationcenterid) {
        this.examinationcenterid = examinationcenterid;
    }

    @Basic
    @Column(name = "EXAMRESULTSSTATUS", nullable = true, length = 255)
    public String getExamresultsstatus() {
        return examresultsstatus;
    }

    public void setExamresultsstatus(String examresultsstatus) {
        this.examresultsstatus = examresultsstatus;
    }

    @Basic
    @Column(name = "FATHERNAME", nullable = true, length = 255)
    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    @Basic
    @Column(name = "FIRSTCODING", nullable = true, precision = 0)
    public Long getFirstcoding() {
        return firstcoding;
    }

    public void setFirstcoding(Long firstcoding) {
        this.firstcoding = firstcoding;
    }

    @Basic
    @Column(name = "LASTDATEOFFORMSUBMISSION", nullable = true, length = 255)
    public String getLastdateofformsubmission() {
        return lastdateofformsubmission;
    }

    public void setLastdateofformsubmission(String lastdateofformsubmission) {
        this.lastdateofformsubmission = lastdateofformsubmission;
    }

    @Basic
    @Column(name = "GRANDFATHERNAME", nullable = true, length = 255)
    public String getGrandfathername() {
        return grandfathername;
    }

    public void setGrandfathername(String grandfathername) {
        this.grandfathername = grandfathername;
    }

    @Basic
    @Column(name = "INTERVIEWDATE", nullable = true, length = 255)
    public String getInterviewdate() {
        return interviewdate;
    }

    public void setInterviewdate(String interviewdate) {
        this.interviewdate = interviewdate;
    }

    @Basic
    @Column(name = "INTERVIEWMARKSALLOCATIONSTATUS", nullable = true, length = 255)
    public String getInterviewmarksallocationstatus() {
        return interviewmarksallocationstatus;
    }

    public void setInterviewmarksallocationstatus(String interviewmarksallocationstatus) {
        this.interviewmarksallocationstatus = interviewmarksallocationstatus;
    }

    @Basic
    @Column(name = "INTERVIEWSCHEDULEDSTATUS", nullable = true, length = 255)
    public String getInterviewscheduledstatus() {
        return interviewscheduledstatus;
    }

    public void setInterviewscheduledstatus(String interviewscheduledstatus) {
        this.interviewscheduledstatus = interviewscheduledstatus;
    }

    @Basic
    @Column(name = "MOTHERNAME", nullable = true, length = 255)
    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    @Basic
    @Column(name = "CANDIDATENAMEINNEPALI", nullable = true, length = 1025)
    public String getCandidatenameinnepali() {
        return candidatenameinnepali;
    }

    public void setCandidatenameinnepali(String candidatenameinnepali) {
        this.candidatenameinnepali = candidatenameinnepali;
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
    @Column(name = "OPTIONALPAPERID", nullable = true, length = 255)
    public String getOptionalpaperid() {
        return optionalpaperid;
    }

    public void setOptionalpaperid(String optionalpaperid) {
        this.optionalpaperid = optionalpaperid;
    }

    @Basic
    @Column(name = "PANELNAME", nullable = true, length = 255)
    public String getPanelname() {
        return panelname;
    }

    public void setPanelname(String panelname) {
        this.panelname = panelname;
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
    @Column(name = "ROLLNO", nullable = true, precision = 0)
    public Long getRollno() {
        return rollno;
    }

    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }

    @Basic
    @Column(name = "SCRUTINYOFFICE", nullable = true, length = 255)
    public String getScrutinyoffice() {
        return scrutinyoffice;
    }

    public void setScrutinyoffice(String scrutinyoffice) {
        this.scrutinyoffice = scrutinyoffice;
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
    @Column(name = "SECONDCODE", nullable = true, precision = 0)
    public Long getSecondcode() {
        return secondcode;
    }

    public void setSecondcode(Long secondcode) {
        this.secondcode = secondcode;
    }

    @Basic
    @Column(name = "SEX", nullable = true, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
    @Column(name = "TOTALMARKS", nullable = true, precision = 0)
    public Double getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(Double totalmarks) {
        this.totalmarks = totalmarks;
    }

    @Basic
    @Column(name = "AMOUNTPAID", nullable = true, length = 255)
    public String getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(String amountpaid) {
        this.amountpaid = amountpaid;
    }

    @Basic
    @Column(name = "CHALLANID", nullable = true, length = 255)
    public String getChallanid() {
        return challanid;
    }

    public void setChallanid(String challanid) {
        this.challanid = challanid;
    }

    @Basic
    @Column(name = "PICURL", nullable = true, length = 1000)
    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    @Basic
    @Column(name = "SIGNURL", nullable = true, length = 1000)
    public String getSignurl() {
        return signurl;
    }

    public void setSignurl(String signurl) {
        this.signurl = signurl;
    }

    @Basic
    @Column(name = "QUS_FOR_QUALIFICATION", nullable = true, length = 500)
    public String getQusForQualification() {
        return qusForQualification;
    }

    public void setQusForQualification(String qusForQualification) {
        this.qusForQualification = qusForQualification;
    }

    @Basic
    @Column(name = "FAC_MIN_QUALIFICATION", nullable = true, length = 500)
    public String getFacMinQualification() {
        return facMinQualification;
    }

    public void setFacMinQualification(String facMinQualification) {
        this.facMinQualification = facMinQualification;
    }

    @Basic
    @Column(name = "SERVICE_OPTION_ONE", nullable = true, length = 255)
    public String getServiceOptionOne() {
        return serviceOptionOne;
    }

    public void setServiceOptionOne(String serviceOptionOne) {
        this.serviceOptionOne = serviceOptionOne;
    }

    @Basic
    @Column(name = "SERVICE_OPTION_TWO", nullable = true, length = 2000)
    public String getServiceOptionTwo() {
        return serviceOptionTwo;
    }

    public void setServiceOptionTwo(String serviceOptionTwo) {
        this.serviceOptionTwo = serviceOptionTwo;
    }

    @Basic
    @Column(name = "MAIN_SUBJECT", nullable = true, length = 255)
    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
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
    @Column(name = "VERSION", nullable = true, length = 255)
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidateappearagainstadvtcode that = (Candidateappearagainstadvtcode) o;
        return id == that.id &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(ageonlastdateday, that.ageonlastdateday) &&
                Objects.equals(ageonlastdatemonth, that.ageonlastdatemonth) &&
                Objects.equals(ageonlastdateyear, that.ageonlastdateyear) &&
                Objects.equals(applicationnumber, that.applicationnumber) &&
                Objects.equals(attendancestatus, that.attendancestatus) &&
                Objects.equals(candidatefirstname, that.candidatefirstname) &&
                Objects.equals(dateofbirthinnepali, that.dateofbirthinnepali) &&
                Objects.equals(documentverificationstatus, that.documentverificationstatus) &&
                Objects.equals(examinationcenterid, that.examinationcenterid) &&
                Objects.equals(examresultsstatus, that.examresultsstatus) &&
                Objects.equals(fathername, that.fathername) &&
                Objects.equals(firstcoding, that.firstcoding) &&
                Objects.equals(lastdateofformsubmission, that.lastdateofformsubmission) &&
                Objects.equals(grandfathername, that.grandfathername) &&
                Objects.equals(interviewdate, that.interviewdate) &&
                Objects.equals(interviewmarksallocationstatus, that.interviewmarksallocationstatus) &&
                Objects.equals(interviewscheduledstatus, that.interviewscheduledstatus) &&
                Objects.equals(mothername, that.mothername) &&
                Objects.equals(candidatenameinnepali, that.candidatenameinnepali) &&
                Objects.equals(marksobtained, that.marksobtained) &&
                Objects.equals(optionalpaperid, that.optionalpaperid) &&
                Objects.equals(panelname, that.panelname) &&
                Objects.equals(paymentstatus, that.paymentstatus) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(resultstatus, that.resultstatus) &&
                Objects.equals(rollno, that.rollno) &&
                Objects.equals(scrutinyoffice, that.scrutinyoffice) &&
                Objects.equals(scrutinystatus, that.scrutinystatus) &&
                Objects.equals(secondcode, that.secondcode) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(studentmasterid, that.studentmasterid) &&
                Objects.equals(totalmarks, that.totalmarks) &&
                Objects.equals(amountpaid, that.amountpaid) &&
                Objects.equals(challanid, that.challanid) &&
                Objects.equals(picurl, that.picurl) &&
                Objects.equals(signurl, that.signurl) &&
                Objects.equals(qusForQualification, that.qusForQualification) &&
                Objects.equals(facMinQualification, that.facMinQualification) &&
                Objects.equals(serviceOptionOne, that.serviceOptionOne) &&
                Objects.equals(serviceOptionTwo, that.serviceOptionTwo) &&
                Objects.equals(mainSubject, that.mainSubject) &&
                Objects.equals(createddate, that.createddate) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementcode, ageonlastdateday, ageonlastdatemonth, ageonlastdateyear, applicationnumber, attendancestatus, candidatefirstname, dateofbirthinnepali, documentverificationstatus, examinationcenterid, examresultsstatus, fathername, firstcoding, lastdateofformsubmission, grandfathername, interviewdate, interviewmarksallocationstatus, interviewscheduledstatus, mothername, candidatenameinnepali, marksobtained, optionalpaperid, panelname, paymentstatus, remarks, resultstatus, rollno, scrutinyoffice, scrutinystatus, secondcode, sex, studentmasterid, totalmarks, amountpaid, challanid, picurl, signurl, qusForQualification, facMinQualification, serviceOptionOne, serviceOptionTwo, mainSubject, createddate, version);
    }
}
