package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Rmispaymentlogs {
    private String id;
    private String advertisementcode;
    private String ebpcode;
    private String studentmasterid;
    private String paymentstatus;
    private String amount;
    private Time ebpGenDate;
    private String candidatenameinnepali;
    private String bankcode;
    private String fiscalyear;
    private String tokens;

    @Id
    @Column(name = "ID", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ADVERTISEMENTCODE", nullable = true, length = 50)
    public String getAdvertisementcode() {
        return advertisementcode;
    }

    public void setAdvertisementcode(String advertisementcode) {
        this.advertisementcode = advertisementcode;
    }

    @Basic
    @Column(name = "EBPCODE", nullable = true, length = 20)
    public String getEbpcode() {
        return ebpcode;
    }

    public void setEbpcode(String ebpcode) {
        this.ebpcode = ebpcode;
    }

    @Basic
    @Column(name = "STUDENTMASTERID", nullable = true, length = 20)
    public String getStudentmasterid() {
        return studentmasterid;
    }

    public void setStudentmasterid(String studentmasterid) {
        this.studentmasterid = studentmasterid;
    }

    @Basic
    @Column(name = "PAYMENTSTATUS", nullable = true, length = 20)
    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    @Basic
    @Column(name = "AMOUNT", nullable = true, length = 20)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "EBP_GEN_DATE", nullable = true)
    public Time getEbpGenDate() {
        return ebpGenDate;
    }

    public void setEbpGenDate(Time ebpGenDate) {
        this.ebpGenDate = ebpGenDate;
    }

    @Basic
    @Column(name = "CANDIDATENAMEINNEPALI", nullable = true, length = 400)
    public String getCandidatenameinnepali() {
        return candidatenameinnepali;
    }

    public void setCandidatenameinnepali(String candidatenameinnepali) {
        this.candidatenameinnepali = candidatenameinnepali;
    }

    @Basic
    @Column(name = "BANKCODE", nullable = true, length = 50)
    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Basic
    @Column(name = "FISCALYEAR", nullable = true, length = 100)
    public String getFiscalyear() {
        return fiscalyear;
    }

    public void setFiscalyear(String fiscalyear) {
        this.fiscalyear = fiscalyear;
    }

    @Basic
    @Column(name = "TOKENS", nullable = true, length = 255)
    public String getTokens() {
        return tokens;
    }

    public void setTokens(String tokens) {
        this.tokens = tokens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rmispaymentlogs that = (Rmispaymentlogs) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(ebpcode, that.ebpcode) &&
                Objects.equals(studentmasterid, that.studentmasterid) &&
                Objects.equals(paymentstatus, that.paymentstatus) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(ebpGenDate, that.ebpGenDate) &&
                Objects.equals(candidatenameinnepali, that.candidatenameinnepali) &&
                Objects.equals(bankcode, that.bankcode) &&
                Objects.equals(fiscalyear, that.fiscalyear) &&
                Objects.equals(tokens, that.tokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementcode, ebpcode, studentmasterid, paymentstatus, amount, ebpGenDate, candidatenameinnepali, bankcode, fiscalyear, tokens);
    }
}
