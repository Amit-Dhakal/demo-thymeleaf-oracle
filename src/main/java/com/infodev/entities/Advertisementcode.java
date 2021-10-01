package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Advertisementcode {
    private long id;
    private String scrutinystatus;
    private String advertisementcode;
    private String advertisementpublisheddate;
    private String advertisementpublisheddaten;
    private String approvaldate;
    private String approvalstatus;
    private Integer blockrangefirstcode;
    private Integer blockrangesecoundcode;
    private String classname;
    private String groupname;
    private String lastdateforformsubmission;
    private String lastdateformsubmissionn;
    private String lifecyclestatus;
    private String memorandumnumber;
    private String paymentlastdate;
    private String paymentlastdaten;
    private String pendingat;
    private String postexamstatus;
    private String postname;
    private String questionpaperselectionstatus;
    private String requestingoffice;
    private String servicename;
    private String statusoflastdateformsubmission;
    private String subgroupname;
    private String examConduction;
    private String writtenResults;
    private String examSchedulingStatus;
    private String ramarks;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "ADVERTISEMENTCODE", nullable = true, length = 255)
    public String getAdvertisementcode() {
        return advertisementcode;
    }

    public void setAdvertisementcode(String advertisementcode) {
        this.advertisementcode = advertisementcode;
    }

    @Basic
    @Column(name = "ADVERTISEMENTPUBLISHEDDATE", nullable = true, length = 255)
    public String getAdvertisementpublisheddate() {
        return advertisementpublisheddate;
    }

    public void setAdvertisementpublisheddate(String advertisementpublisheddate) {
        this.advertisementpublisheddate = advertisementpublisheddate;
    }

    @Basic
    @Column(name = "ADVERTISEMENTPUBLISHEDDATEN", nullable = true, length = 255)
    public String getAdvertisementpublisheddaten() {
        return advertisementpublisheddaten;
    }

    public void setAdvertisementpublisheddaten(String advertisementpublisheddaten) {
        this.advertisementpublisheddaten = advertisementpublisheddaten;
    }

    @Basic
    @Column(name = "APPROVALDATE", nullable = true, length = 255)
    public String getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(String approvaldate) {
        this.approvaldate = approvaldate;
    }

    @Basic
    @Column(name = "APPROVALSTATUS", nullable = true, length = 255)
    public String getApprovalstatus() {
        return approvalstatus;
    }

    public void setApprovalstatus(String approvalstatus) {
        this.approvalstatus = approvalstatus;
    }

    @Basic
    @Column(name = "BLOCKRANGEFIRSTCODE", nullable = true, precision = 0)
    public Integer getBlockrangefirstcode() {
        return blockrangefirstcode;
    }

    public void setBlockrangefirstcode(Integer blockrangefirstcode) {
        this.blockrangefirstcode = blockrangefirstcode;
    }

    @Basic
    @Column(name = "BLOCKRANGESECOUNDCODE", nullable = true, precision = 0)
    public Integer getBlockrangesecoundcode() {
        return blockrangesecoundcode;
    }

    public void setBlockrangesecoundcode(Integer blockrangesecoundcode) {
        this.blockrangesecoundcode = blockrangesecoundcode;
    }

    @Basic
    @Column(name = "CLASSNAME", nullable = true, length = 255)
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Basic
    @Column(name = "GROUPNAME", nullable = true, length = 255)
    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Basic
    @Column(name = "LASTDATEFORFORMSUBMISSION", nullable = true, length = 255)
    public String getLastdateforformsubmission() {
        return lastdateforformsubmission;
    }

    public void setLastdateforformsubmission(String lastdateforformsubmission) {
        this.lastdateforformsubmission = lastdateforformsubmission;
    }

    @Basic
    @Column(name = "LASTDATEFORMSUBMISSIONN", nullable = true, length = 255)
    public String getLastdateformsubmissionn() {
        return lastdateformsubmissionn;
    }

    public void setLastdateformsubmissionn(String lastdateformsubmissionn) {
        this.lastdateformsubmissionn = lastdateformsubmissionn;
    }

    @Basic
    @Column(name = "LIFECYCLESTATUS", nullable = true, length = 255)
    public String getLifecyclestatus() {
        return lifecyclestatus;
    }

    public void setLifecyclestatus(String lifecyclestatus) {
        this.lifecyclestatus = lifecyclestatus;
    }

    @Basic
    @Column(name = "MEMORANDUMNUMBER", nullable = true, length = 255)
    public String getMemorandumnumber() {
        return memorandumnumber;
    }

    public void setMemorandumnumber(String memorandumnumber) {
        this.memorandumnumber = memorandumnumber;
    }

    @Basic
    @Column(name = "PAYMENTLASTDATE", nullable = true, length = 255)
    public String getPaymentlastdate() {
        return paymentlastdate;
    }

    public void setPaymentlastdate(String paymentlastdate) {
        this.paymentlastdate = paymentlastdate;
    }

    @Basic
    @Column(name = "PAYMENTLASTDATEN", nullable = true, length = 255)
    public String getPaymentlastdaten() {
        return paymentlastdaten;
    }

    public void setPaymentlastdaten(String paymentlastdaten) {
        this.paymentlastdaten = paymentlastdaten;
    }

    @Basic
    @Column(name = "PENDINGAT", nullable = true, length = 255)
    public String getPendingat() {
        return pendingat;
    }

    public void setPendingat(String pendingat) {
        this.pendingat = pendingat;
    }

    @Basic
    @Column(name = "POSTEXAMSTATUS", nullable = true, length = 255)
    public String getPostexamstatus() {
        return postexamstatus;
    }

    public void setPostexamstatus(String postexamstatus) {
        this.postexamstatus = postexamstatus;
    }

    @Basic
    @Column(name = "POSTNAME", nullable = true, length = 255)
    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    @Basic
    @Column(name = "QUESTIONPAPERSELECTIONSTATUS", nullable = true, length = 255)
    public String getQuestionpaperselectionstatus() {
        return questionpaperselectionstatus;
    }

    public void setQuestionpaperselectionstatus(String questionpaperselectionstatus) {
        this.questionpaperselectionstatus = questionpaperselectionstatus;
    }

    @Basic
    @Column(name = "REQUESTINGOFFICE", nullable = true, length = 255)
    public String getRequestingoffice() {
        return requestingoffice;
    }

    public void setRequestingoffice(String requestingoffice) {
        this.requestingoffice = requestingoffice;
    }

    @Basic
    @Column(name = "SERVICENAME", nullable = true, length = 255)
    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    @Basic
    @Column(name = "STATUSOFLASTDATEFORMSUBMISSION", nullable = true, length = 255)
    public String getStatusoflastdateformsubmission() {
        return statusoflastdateformsubmission;
    }

    public void setStatusoflastdateformsubmission(String statusoflastdateformsubmission) {
        this.statusoflastdateformsubmission = statusoflastdateformsubmission;
    }

    @Basic
    @Column(name = "SUBGROUPNAME", nullable = true, length = 255)
    public String getSubgroupname() {
        return subgroupname;
    }

    public void setSubgroupname(String subgroupname) {
        this.subgroupname = subgroupname;
    }

    @Basic
    @Column(name = "EXAM_CONDUCTION", nullable = true, length = 500)
    public String getExamConduction() {
        return examConduction;
    }

    public void setExamConduction(String examConduction) {
        this.examConduction = examConduction;
    }

    @Basic
    @Column(name = "WRITTEN_RESULTS", nullable = true, length = 500)
    public String getWrittenResults() {
        return writtenResults;
    }

    public void setWrittenResults(String writtenResults) {
        this.writtenResults = writtenResults;
    }

    @Basic
    @Column(name = "EXAM_SCHEDULING_STATUS", nullable = true, length = 500)
    public String getExamSchedulingStatus() {
        return examSchedulingStatus;
    }

    public void setExamSchedulingStatus(String examSchedulingStatus) {
        this.examSchedulingStatus = examSchedulingStatus;
    }

    @Basic
    @Column(name = "RAMARKS", nullable = true, length = 500)
    public String getRamarks() {
        return ramarks;
    }

    public void setRamarks(String ramarks) {
        this.ramarks = ramarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisementcode that = (Advertisementcode) o;
        return id == that.id &&
                Objects.equals(scrutinystatus, that.scrutinystatus) &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(advertisementpublisheddate, that.advertisementpublisheddate) &&
                Objects.equals(advertisementpublisheddaten, that.advertisementpublisheddaten) &&
                Objects.equals(approvaldate, that.approvaldate) &&
                Objects.equals(approvalstatus, that.approvalstatus) &&
                Objects.equals(blockrangefirstcode, that.blockrangefirstcode) &&
                Objects.equals(blockrangesecoundcode, that.blockrangesecoundcode) &&
                Objects.equals(classname, that.classname) &&
                Objects.equals(groupname, that.groupname) &&
                Objects.equals(lastdateforformsubmission, that.lastdateforformsubmission) &&
                Objects.equals(lastdateformsubmissionn, that.lastdateformsubmissionn) &&
                Objects.equals(lifecyclestatus, that.lifecyclestatus) &&
                Objects.equals(memorandumnumber, that.memorandumnumber) &&
                Objects.equals(paymentlastdate, that.paymentlastdate) &&
                Objects.equals(paymentlastdaten, that.paymentlastdaten) &&
                Objects.equals(pendingat, that.pendingat) &&
                Objects.equals(postexamstatus, that.postexamstatus) &&
                Objects.equals(postname, that.postname) &&
                Objects.equals(questionpaperselectionstatus, that.questionpaperselectionstatus) &&
                Objects.equals(requestingoffice, that.requestingoffice) &&
                Objects.equals(servicename, that.servicename) &&
                Objects.equals(statusoflastdateformsubmission, that.statusoflastdateformsubmission) &&
                Objects.equals(subgroupname, that.subgroupname) &&
                Objects.equals(examConduction, that.examConduction) &&
                Objects.equals(writtenResults, that.writtenResults) &&
                Objects.equals(examSchedulingStatus, that.examSchedulingStatus) &&
                Objects.equals(ramarks, that.ramarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, scrutinystatus, advertisementcode, advertisementpublisheddate, advertisementpublisheddaten, approvaldate, approvalstatus, blockrangefirstcode, blockrangesecoundcode, classname, groupname, lastdateforformsubmission, lastdateformsubmissionn, lifecyclestatus, memorandumnumber, paymentlastdate, paymentlastdaten, pendingat, postexamstatus, postname, questionpaperselectionstatus, requestingoffice, servicename, statusoflastdateformsubmission, subgroupname, examConduction, writtenResults, examSchedulingStatus, ramarks);
    }
}
