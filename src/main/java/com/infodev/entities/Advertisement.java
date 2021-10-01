package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Advertisement {
    private long id;
    private String advertisementcode;
    private String advertisementnumber;
    private String category;
    private String demandOffice;
    private String financialYear;
    private String requestingoffice;
    private String requisitionNumber;
    private String status;
    private Long vacancy;

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
    @Column(name = "CATEGORY", nullable = true, length = 255)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "DEMAND_OFFICE", nullable = true, length = 255)
    public String getDemandOffice() {
        return demandOffice;
    }

    public void setDemandOffice(String demandOffice) {
        this.demandOffice = demandOffice;
    }

    @Basic
    @Column(name = "FINANCIAL_YEAR", nullable = true, length = 255)
    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
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
    @Column(name = "REQUISITION_NUMBER", nullable = true, length = 255)
    public String getRequisitionNumber() {
        return requisitionNumber;
    }

    public void setRequisitionNumber(String requisitionNumber) {
        this.requisitionNumber = requisitionNumber;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "VACANCY", nullable = true, precision = 0)
    public Long getVacancy() {
        return vacancy;
    }

    public void setVacancy(Long vacancy) {
        this.vacancy = vacancy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Advertisement that = (Advertisement) o;
        return id == that.id &&
                Objects.equals(advertisementcode, that.advertisementcode) &&
                Objects.equals(advertisementnumber, that.advertisementnumber) &&
                Objects.equals(category, that.category) &&
                Objects.equals(demandOffice, that.demandOffice) &&
                Objects.equals(financialYear, that.financialYear) &&
                Objects.equals(requestingoffice, that.requestingoffice) &&
                Objects.equals(requisitionNumber, that.requisitionNumber) &&
                Objects.equals(status, that.status) &&
                Objects.equals(vacancy, that.vacancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, advertisementcode, advertisementnumber, category, demandOffice, financialYear, requestingoffice, requisitionNumber, status, vacancy);
    }
}
