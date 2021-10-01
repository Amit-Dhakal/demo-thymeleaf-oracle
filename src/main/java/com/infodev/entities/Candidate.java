package com.infodev.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Candidate {
    private long id;
    private String alternateEmailId;
    private String amountPaid;
    private String area;
    private String physicallychallenged;
    private String birthplace;
    private String birthplacedistrict;
    private String cast;
    private String castgroup;
    private String castgroupother;
    private String community;
    private String dateOfBirth;
    private String dateofbirthinad;
    private String dateOfBirthN;
    private String degree;
    private String disabilitydescription;
    private String districtname;
    private String electivesubject;
    private String emailId;
    private String employmentperiodfrom;
    private String employmentperiodto;
    private String employmentstatus;
    private String employmenttype;
    private String empstatusother;
    private String faculty;
    private String fathereductionlevel;
    private String fatherFName;
    private String fatherLName;
    private String fatherMName;
    private String firstName;
    private String fNameNepali;
    private String gender;
    private String geographicalregion;
    private String geographicalregionother;
    private String grandFFName;
    private String grandFLName;
    private String grandFMName;
    private String houseno;
    private String husbandwifeFName;
    private String husbandwifeLName;
    private String husbandwifeMName;
    private String institutename;
    private String institutetype;
    private String issuedDate;
    private String issuedDistrict;
    private String issuedNumber;
    private String lastName;
    private String lNameNepali;
    private String mailingaddress;
    private String mandatorysubject;
    private String maritalStatus;
    private String middleName;
    private String mNameNepali;
    private String mobileno;
    private String mothereductionlevel;
    private String motherFName;
    private String motherlangauage;
    private String motherLName;
    private String motherMName;
    private String nationality;
    private String nocfromtriunv;
    private String parentEduQual;
    private String parentMainOcc;
    private String parentsoccupationother;
    private String paymentStatus;
    private String phoneno;
    private String physicallyChallenged;
    private String pincode;
    private String post;
    private String qualificationtype;
    private String rank;
    private String registrationnumber;
    private String religion;
    private String religionother;
    private String remarks;
    private String resulttype;
    private String rollno;
    private String rollNumber;
    private String citizenshipdoc;
    private String photograph;
    private String qualificationdoc;
    private String rsvcatgdoc;
    private String signature;
    private String score;
    private String scrutinyStatus;
    private String servicetype;
    private String street;
    private String university;
    private String username;
    private String wardno;
    private Timestamp createddate;
    private String imgsign;
    private String pradesh;
    private String sthaniyatahakonaam;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ALTERNATE_EMAIL_ID", nullable = true, length = 255)
    public String getAlternateEmailId() {
        return alternateEmailId;
    }

    public void setAlternateEmailId(String alternateEmailId) {
        this.alternateEmailId = alternateEmailId;
    }

    @Basic
    @Column(name = "AMOUNT_PAID", nullable = true, length = 255)
    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Basic
    @Column(name = "AREA", nullable = true, length = 255)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "PHYSICALLYCHALLENGED", nullable = true, length = 255)
    public String getPhysicallychallenged() {
        return physicallychallenged;
    }

    public void setPhysicallychallenged(String physicallychallenged) {
        this.physicallychallenged = physicallychallenged;
    }

    @Basic
    @Column(name = "BIRTHPLACE", nullable = true, length = 255)
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Basic
    @Column(name = "BIRTHPLACEDISTRICT", nullable = true, length = 255)
    public String getBirthplacedistrict() {
        return birthplacedistrict;
    }

    public void setBirthplacedistrict(String birthplacedistrict) {
        this.birthplacedistrict = birthplacedistrict;
    }

    @Basic
    @Column(name = "CAST", nullable = true, length = 255)
    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Basic
    @Column(name = "CASTGROUP", nullable = true, length = 255)
    public String getCastgroup() {
        return castgroup;
    }

    public void setCastgroup(String castgroup) {
        this.castgroup = castgroup;
    }

    @Basic
    @Column(name = "CASTGROUPOTHER", nullable = true, length = 255)
    public String getCastgroupother() {
        return castgroupother;
    }

    public void setCastgroupother(String castgroupother) {
        this.castgroupother = castgroupother;
    }

    @Basic
    @Column(name = "COMMUNITY", nullable = true, length = 255)
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH", nullable = true, length = 255)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "DATEOFBIRTHINAD", nullable = true, length = 255)
    public String getDateofbirthinad() {
        return dateofbirthinad;
    }

    public void setDateofbirthinad(String dateofbirthinad) {
        this.dateofbirthinad = dateofbirthinad;
    }

    @Basic
    @Column(name = "DATE_OF_BIRTH_N", nullable = true, length = 255)
    public String getDateOfBirthN() {
        return dateOfBirthN;
    }

    public void setDateOfBirthN(String dateOfBirthN) {
        this.dateOfBirthN = dateOfBirthN;
    }

    @Basic
    @Column(name = "DEGREE", nullable = true, length = 255)
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "DISABILITYDESCRIPTION", nullable = true, length = 255)
    public String getDisabilitydescription() {
        return disabilitydescription;
    }

    public void setDisabilitydescription(String disabilitydescription) {
        this.disabilitydescription = disabilitydescription;
    }

    @Basic
    @Column(name = "DISTRICTNAME", nullable = true, length = 255)
    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    @Basic
    @Column(name = "ELECTIVESUBJECT", nullable = true, length = 255)
    public String getElectivesubject() {
        return electivesubject;
    }

    public void setElectivesubject(String electivesubject) {
        this.electivesubject = electivesubject;
    }

    @Basic
    @Column(name = "EMAIL_ID", nullable = true, length = 255)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "EMPLOYMENTPERIODFROM", nullable = true, length = 255)
    public String getEmploymentperiodfrom() {
        return employmentperiodfrom;
    }

    public void setEmploymentperiodfrom(String employmentperiodfrom) {
        this.employmentperiodfrom = employmentperiodfrom;
    }

    @Basic
    @Column(name = "EMPLOYMENTPERIODTO", nullable = true, length = 255)
    public String getEmploymentperiodto() {
        return employmentperiodto;
    }

    public void setEmploymentperiodto(String employmentperiodto) {
        this.employmentperiodto = employmentperiodto;
    }

    @Basic
    @Column(name = "EMPLOYMENTSTATUS", nullable = true, length = 255)
    public String getEmploymentstatus() {
        return employmentstatus;
    }

    public void setEmploymentstatus(String employmentstatus) {
        this.employmentstatus = employmentstatus;
    }

    @Basic
    @Column(name = "EMPLOYMENTTYPE", nullable = true, length = 255)
    public String getEmploymenttype() {
        return employmenttype;
    }

    public void setEmploymenttype(String employmenttype) {
        this.employmenttype = employmenttype;
    }

    @Basic
    @Column(name = "EMPSTATUSOTHER", nullable = true, length = 255)
    public String getEmpstatusother() {
        return empstatusother;
    }

    public void setEmpstatusother(String empstatusother) {
        this.empstatusother = empstatusother;
    }

    @Basic
    @Column(name = "FACULTY", nullable = true, length = 255)
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Basic
    @Column(name = "FATHEREDUCTIONLEVEL", nullable = true, length = 255)
    public String getFathereductionlevel() {
        return fathereductionlevel;
    }

    public void setFathereductionlevel(String fathereductionlevel) {
        this.fathereductionlevel = fathereductionlevel;
    }

    @Basic
    @Column(name = "FATHER_F_NAME", nullable = true, length = 255)
    public String getFatherFName() {
        return fatherFName;
    }

    public void setFatherFName(String fatherFName) {
        this.fatherFName = fatherFName;
    }

    @Basic
    @Column(name = "FATHER_L_NAME", nullable = true, length = 255)
    public String getFatherLName() {
        return fatherLName;
    }

    public void setFatherLName(String fatherLName) {
        this.fatherLName = fatherLName;
    }

    @Basic
    @Column(name = "FATHER_M_NAME", nullable = true, length = 255)
    public String getFatherMName() {
        return fatherMName;
    }

    public void setFatherMName(String fatherMName) {
        this.fatherMName = fatherMName;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "F_NAME_NEPALI", nullable = true, length = 255)
    public String getfNameNepali() {
        return fNameNepali;
    }

    public void setfNameNepali(String fNameNepali) {
        this.fNameNepali = fNameNepali;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, length = 255)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "GEOGRAPHICALREGION", nullable = true, length = 255)
    public String getGeographicalregion() {
        return geographicalregion;
    }

    public void setGeographicalregion(String geographicalregion) {
        this.geographicalregion = geographicalregion;
    }

    @Basic
    @Column(name = "GEOGRAPHICALREGIONOTHER", nullable = true, length = 255)
    public String getGeographicalregionother() {
        return geographicalregionother;
    }

    public void setGeographicalregionother(String geographicalregionother) {
        this.geographicalregionother = geographicalregionother;
    }

    @Basic
    @Column(name = "GRAND_F_F_NAME", nullable = true, length = 255)
    public String getGrandFFName() {
        return grandFFName;
    }

    public void setGrandFFName(String grandFFName) {
        this.grandFFName = grandFFName;
    }

    @Basic
    @Column(name = "GRAND_F_L_NAME", nullable = true, length = 255)
    public String getGrandFLName() {
        return grandFLName;
    }

    public void setGrandFLName(String grandFLName) {
        this.grandFLName = grandFLName;
    }

    @Basic
    @Column(name = "GRAND_F_M_NAME", nullable = true, length = 255)
    public String getGrandFMName() {
        return grandFMName;
    }

    public void setGrandFMName(String grandFMName) {
        this.grandFMName = grandFMName;
    }

    @Basic
    @Column(name = "HOUSENO", nullable = true, length = 255)
    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    @Basic
    @Column(name = "HUSBANDWIFE_F_NAME", nullable = true, length = 255)
    public String getHusbandwifeFName() {
        return husbandwifeFName;
    }

    public void setHusbandwifeFName(String husbandwifeFName) {
        this.husbandwifeFName = husbandwifeFName;
    }

    @Basic
    @Column(name = "HUSBANDWIFE_L_NAME", nullable = true, length = 255)
    public String getHusbandwifeLName() {
        return husbandwifeLName;
    }

    public void setHusbandwifeLName(String husbandwifeLName) {
        this.husbandwifeLName = husbandwifeLName;
    }

    @Basic
    @Column(name = "HUSBANDWIFE_M_NAME", nullable = true, length = 255)
    public String getHusbandwifeMName() {
        return husbandwifeMName;
    }

    public void setHusbandwifeMName(String husbandwifeMName) {
        this.husbandwifeMName = husbandwifeMName;
    }

    @Basic
    @Column(name = "INSTITUTENAME", nullable = true, length = 255)
    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    @Basic
    @Column(name = "INSTITUTETYPE", nullable = true, length = 255)
    public String getInstitutetype() {
        return institutetype;
    }

    public void setInstitutetype(String institutetype) {
        this.institutetype = institutetype;
    }

    @Basic
    @Column(name = "ISSUED_DATE", nullable = true, length = 255)
    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    @Basic
    @Column(name = "ISSUED_DISTRICT", nullable = true, length = 255)
    public String getIssuedDistrict() {
        return issuedDistrict;
    }

    public void setIssuedDistrict(String issuedDistrict) {
        this.issuedDistrict = issuedDistrict;
    }

    @Basic
    @Column(name = "ISSUED_NUMBER", nullable = true, length = 255)
    public String getIssuedNumber() {
        return issuedNumber;
    }

    public void setIssuedNumber(String issuedNumber) {
        this.issuedNumber = issuedNumber;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = true, length = 255)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "L_NAME_NEPALI", nullable = true, length = 255)
    public String getlNameNepali() {
        return lNameNepali;
    }

    public void setlNameNepali(String lNameNepali) {
        this.lNameNepali = lNameNepali;
    }

    @Basic
    @Column(name = "MAILINGADDRESS", nullable = true, length = 255)
    public String getMailingaddress() {
        return mailingaddress;
    }

    public void setMailingaddress(String mailingaddress) {
        this.mailingaddress = mailingaddress;
    }

    @Basic
    @Column(name = "MANDATORYSUBJECT", nullable = true, length = 255)
    public String getMandatorysubject() {
        return mandatorysubject;
    }

    public void setMandatorysubject(String mandatorysubject) {
        this.mandatorysubject = mandatorysubject;
    }

    @Basic
    @Column(name = "MARITAL_STATUS", nullable = true, length = 255)
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "MIDDLE_NAME", nullable = true, length = 255)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "M_NAME_NEPALI", nullable = true, length = 255)
    public String getmNameNepali() {
        return mNameNepali;
    }

    public void setmNameNepali(String mNameNepali) {
        this.mNameNepali = mNameNepali;
    }

    @Basic
    @Column(name = "MOBILENO", nullable = true, length = 255)
    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Basic
    @Column(name = "MOTHEREDUCTIONLEVEL", nullable = true, length = 255)
    public String getMothereductionlevel() {
        return mothereductionlevel;
    }

    public void setMothereductionlevel(String mothereductionlevel) {
        this.mothereductionlevel = mothereductionlevel;
    }

    @Basic
    @Column(name = "MOTHER_F_NAME", nullable = true, length = 255)
    public String getMotherFName() {
        return motherFName;
    }

    public void setMotherFName(String motherFName) {
        this.motherFName = motherFName;
    }

    @Basic
    @Column(name = "MOTHERLANGAUAGE", nullable = true, length = 255)
    public String getMotherlangauage() {
        return motherlangauage;
    }

    public void setMotherlangauage(String motherlangauage) {
        this.motherlangauage = motherlangauage;
    }

    @Basic
    @Column(name = "MOTHER_L_NAME", nullable = true, length = 255)
    public String getMotherLName() {
        return motherLName;
    }

    public void setMotherLName(String motherLName) {
        this.motherLName = motherLName;
    }

    @Basic
    @Column(name = "MOTHER_M_NAME", nullable = true, length = 255)
    public String getMotherMName() {
        return motherMName;
    }

    public void setMotherMName(String motherMName) {
        this.motherMName = motherMName;
    }

    @Basic
    @Column(name = "NATIONALITY", nullable = true, length = 255)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "NOCFROMTRIUNV", nullable = true, length = 255)
    public String getNocfromtriunv() {
        return nocfromtriunv;
    }

    public void setNocfromtriunv(String nocfromtriunv) {
        this.nocfromtriunv = nocfromtriunv;
    }

    @Basic
    @Column(name = "PARENT_EDU_QUAL", nullable = true, length = 255)
    public String getParentEduQual() {
        return parentEduQual;
    }

    public void setParentEduQual(String parentEduQual) {
        this.parentEduQual = parentEduQual;
    }

    @Basic
    @Column(name = "PARENT_MAIN_OCC", nullable = true, length = 255)
    public String getParentMainOcc() {
        return parentMainOcc;
    }

    public void setParentMainOcc(String parentMainOcc) {
        this.parentMainOcc = parentMainOcc;
    }

    @Basic
    @Column(name = "PARENTSOCCUPATIONOTHER", nullable = true, length = 255)
    public String getParentsoccupationother() {
        return parentsoccupationother;
    }

    public void setParentsoccupationother(String parentsoccupationother) {
        this.parentsoccupationother = parentsoccupationother;
    }

    @Basic
    @Column(name = "PAYMENT_STATUS", nullable = true, length = 255)
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Basic
    @Column(name = "PHONENO", nullable = true, length = 255)
    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Basic
    @Column(name = "PHYSICALLY_CHALLENGED", nullable = true, length = 255)
    public String getPhysicallyChallenged() {
        return physicallyChallenged;
    }

    public void setPhysicallyChallenged(String physicallyChallenged) {
        this.physicallyChallenged = physicallyChallenged;
    }

    @Basic
    @Column(name = "PINCODE", nullable = true, length = 255)
    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Basic
    @Column(name = "POST", nullable = true, length = 255)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "QUALIFICATIONTYPE", nullable = true, length = 255)
    public String getQualificationtype() {
        return qualificationtype;
    }

    public void setQualificationtype(String qualificationtype) {
        this.qualificationtype = qualificationtype;
    }

    @Basic
    @Column(name = "RANK", nullable = true, length = 255)
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "REGISTRATIONNUMBER", nullable = true, length = 255)
    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    @Basic
    @Column(name = "RELIGION", nullable = true, length = 255)
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Basic
    @Column(name = "RELIGIONOTHER", nullable = true, length = 255)
    public String getReligionother() {
        return religionother;
    }

    public void setReligionother(String religionother) {
        this.religionother = religionother;
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
    @Column(name = "RESULTTYPE", nullable = true, length = 255)
    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
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
    @Column(name = "ROLL_NUMBER", nullable = true, length = 255)
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Basic
    @Column(name = "CITIZENSHIPDOC", nullable = true, length = 255)
    public String getCitizenshipdoc() {
        return citizenshipdoc;
    }

    public void setCitizenshipdoc(String citizenshipdoc) {
        this.citizenshipdoc = citizenshipdoc;
    }

    @Basic
    @Column(name = "PHOTOGRAPH", nullable = true, length = 255)
    public String getPhotograph() {
        return photograph;
    }

    public void setPhotograph(String photograph) {
        this.photograph = photograph;
    }

    @Basic
    @Column(name = "QUALIFICATIONDOC", nullable = true, length = 255)
    public String getQualificationdoc() {
        return qualificationdoc;
    }

    public void setQualificationdoc(String qualificationdoc) {
        this.qualificationdoc = qualificationdoc;
    }

    @Basic
    @Column(name = "RSVCATGDOC", nullable = true, length = 255)
    public String getRsvcatgdoc() {
        return rsvcatgdoc;
    }

    public void setRsvcatgdoc(String rsvcatgdoc) {
        this.rsvcatgdoc = rsvcatgdoc;
    }

    @Basic
    @Column(name = "SIGNATURE", nullable = true, length = 255)
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Basic
    @Column(name = "SCORE", nullable = true, length = 255)
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Basic
    @Column(name = "SCRUTINY_STATUS", nullable = true, length = 255)
    public String getScrutinyStatus() {
        return scrutinyStatus;
    }

    public void setScrutinyStatus(String scrutinyStatus) {
        this.scrutinyStatus = scrutinyStatus;
    }

    @Basic
    @Column(name = "SERVICETYPE", nullable = true, length = 255)
    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 255)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "UNIVERSITY", nullable = true, length = 255)
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Basic
    @Column(name = "USERNAME", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "WARDNO", nullable = true, length = 255)
    public String getWardno() {
        return wardno;
    }

    public void setWardno(String wardno) {
        this.wardno = wardno;
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
    @Column(name = "IMGSIGN", nullable = true, length = 255)
    public String getImgsign() {
        return imgsign;
    }

    public void setImgsign(String imgsign) {
        this.imgsign = imgsign;
    }

    @Basic
    @Column(name = "PRADESH", nullable = true, length = 255)
    public String getPradesh() {
        return pradesh;
    }

    public void setPradesh(String pradesh) {
        this.pradesh = pradesh;
    }

    @Basic
    @Column(name = "STHANIYATAHAKONAAM", nullable = true, length = 255)
    public String getSthaniyatahakonaam() {
        return sthaniyatahakonaam;
    }

    public void setSthaniyatahakonaam(String sthaniyatahakonaam) {
        this.sthaniyatahakonaam = sthaniyatahakonaam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return id == candidate.id &&
                Objects.equals(alternateEmailId, candidate.alternateEmailId) &&
                Objects.equals(amountPaid, candidate.amountPaid) &&
                Objects.equals(area, candidate.area) &&
                Objects.equals(physicallychallenged, candidate.physicallychallenged) &&
                Objects.equals(birthplace, candidate.birthplace) &&
                Objects.equals(birthplacedistrict, candidate.birthplacedistrict) &&
                Objects.equals(cast, candidate.cast) &&
                Objects.equals(castgroup, candidate.castgroup) &&
                Objects.equals(castgroupother, candidate.castgroupother) &&
                Objects.equals(community, candidate.community) &&
                Objects.equals(dateOfBirth, candidate.dateOfBirth) &&
                Objects.equals(dateofbirthinad, candidate.dateofbirthinad) &&
                Objects.equals(dateOfBirthN, candidate.dateOfBirthN) &&
                Objects.equals(degree, candidate.degree) &&
                Objects.equals(disabilitydescription, candidate.disabilitydescription) &&
                Objects.equals(districtname, candidate.districtname) &&
                Objects.equals(electivesubject, candidate.electivesubject) &&
                Objects.equals(emailId, candidate.emailId) &&
                Objects.equals(employmentperiodfrom, candidate.employmentperiodfrom) &&
                Objects.equals(employmentperiodto, candidate.employmentperiodto) &&
                Objects.equals(employmentstatus, candidate.employmentstatus) &&
                Objects.equals(employmenttype, candidate.employmenttype) &&
                Objects.equals(empstatusother, candidate.empstatusother) &&
                Objects.equals(faculty, candidate.faculty) &&
                Objects.equals(fathereductionlevel, candidate.fathereductionlevel) &&
                Objects.equals(fatherFName, candidate.fatherFName) &&
                Objects.equals(fatherLName, candidate.fatherLName) &&
                Objects.equals(fatherMName, candidate.fatherMName) &&
                Objects.equals(firstName, candidate.firstName) &&
                Objects.equals(fNameNepali, candidate.fNameNepali) &&
                Objects.equals(gender, candidate.gender) &&
                Objects.equals(geographicalregion, candidate.geographicalregion) &&
                Objects.equals(geographicalregionother, candidate.geographicalregionother) &&
                Objects.equals(grandFFName, candidate.grandFFName) &&
                Objects.equals(grandFLName, candidate.grandFLName) &&
                Objects.equals(grandFMName, candidate.grandFMName) &&
                Objects.equals(houseno, candidate.houseno) &&
                Objects.equals(husbandwifeFName, candidate.husbandwifeFName) &&
                Objects.equals(husbandwifeLName, candidate.husbandwifeLName) &&
                Objects.equals(husbandwifeMName, candidate.husbandwifeMName) &&
                Objects.equals(institutename, candidate.institutename) &&
                Objects.equals(institutetype, candidate.institutetype) &&
                Objects.equals(issuedDate, candidate.issuedDate) &&
                Objects.equals(issuedDistrict, candidate.issuedDistrict) &&
                Objects.equals(issuedNumber, candidate.issuedNumber) &&
                Objects.equals(lastName, candidate.lastName) &&
                Objects.equals(lNameNepali, candidate.lNameNepali) &&
                Objects.equals(mailingaddress, candidate.mailingaddress) &&
                Objects.equals(mandatorysubject, candidate.mandatorysubject) &&
                Objects.equals(maritalStatus, candidate.maritalStatus) &&
                Objects.equals(middleName, candidate.middleName) &&
                Objects.equals(mNameNepali, candidate.mNameNepali) &&
                Objects.equals(mobileno, candidate.mobileno) &&
                Objects.equals(mothereductionlevel, candidate.mothereductionlevel) &&
                Objects.equals(motherFName, candidate.motherFName) &&
                Objects.equals(motherlangauage, candidate.motherlangauage) &&
                Objects.equals(motherLName, candidate.motherLName) &&
                Objects.equals(motherMName, candidate.motherMName) &&
                Objects.equals(nationality, candidate.nationality) &&
                Objects.equals(nocfromtriunv, candidate.nocfromtriunv) &&
                Objects.equals(parentEduQual, candidate.parentEduQual) &&
                Objects.equals(parentMainOcc, candidate.parentMainOcc) &&
                Objects.equals(parentsoccupationother, candidate.parentsoccupationother) &&
                Objects.equals(paymentStatus, candidate.paymentStatus) &&
                Objects.equals(phoneno, candidate.phoneno) &&
                Objects.equals(physicallyChallenged, candidate.physicallyChallenged) &&
                Objects.equals(pincode, candidate.pincode) &&
                Objects.equals(post, candidate.post) &&
                Objects.equals(qualificationtype, candidate.qualificationtype) &&
                Objects.equals(rank, candidate.rank) &&
                Objects.equals(registrationnumber, candidate.registrationnumber) &&
                Objects.equals(religion, candidate.religion) &&
                Objects.equals(religionother, candidate.religionother) &&
                Objects.equals(remarks, candidate.remarks) &&
                Objects.equals(resulttype, candidate.resulttype) &&
                Objects.equals(rollno, candidate.rollno) &&
                Objects.equals(rollNumber, candidate.rollNumber) &&
                Objects.equals(citizenshipdoc, candidate.citizenshipdoc) &&
                Objects.equals(photograph, candidate.photograph) &&
                Objects.equals(qualificationdoc, candidate.qualificationdoc) &&
                Objects.equals(rsvcatgdoc, candidate.rsvcatgdoc) &&
                Objects.equals(signature, candidate.signature) &&
                Objects.equals(score, candidate.score) &&
                Objects.equals(scrutinyStatus, candidate.scrutinyStatus) &&
                Objects.equals(servicetype, candidate.servicetype) &&
                Objects.equals(street, candidate.street) &&
                Objects.equals(university, candidate.university) &&
                Objects.equals(username, candidate.username) &&
                Objects.equals(wardno, candidate.wardno) &&
                Objects.equals(createddate, candidate.createddate) &&
                Objects.equals(imgsign, candidate.imgsign) &&
                Objects.equals(pradesh, candidate.pradesh) &&
                Objects.equals(sthaniyatahakonaam, candidate.sthaniyatahakonaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alternateEmailId, amountPaid, area, physicallychallenged, birthplace, birthplacedistrict, cast, castgroup, castgroupother, community, dateOfBirth, dateofbirthinad, dateOfBirthN, degree, disabilitydescription, districtname, electivesubject, emailId, employmentperiodfrom, employmentperiodto, employmentstatus, employmenttype, empstatusother, faculty, fathereductionlevel, fatherFName, fatherLName, fatherMName, firstName, fNameNepali, gender, geographicalregion, geographicalregionother, grandFFName, grandFLName, grandFMName, houseno, husbandwifeFName, husbandwifeLName, husbandwifeMName, institutename, institutetype, issuedDate, issuedDistrict, issuedNumber, lastName, lNameNepali, mailingaddress, mandatorysubject, maritalStatus, middleName, mNameNepali, mobileno, mothereductionlevel, motherFName, motherlangauage, motherLName, motherMName, nationality, nocfromtriunv, parentEduQual, parentMainOcc, parentsoccupationother, paymentStatus, phoneno, physicallyChallenged, pincode, post, qualificationtype, rank, registrationnumber, religion, religionother, remarks, resulttype, rollno, rollNumber, citizenshipdoc, photograph, qualificationdoc, rsvcatgdoc, signature, score, scrutinyStatus, servicetype, street, university, username, wardno, createddate, imgsign, pradesh, sthaniyatahakonaam);
    }
}
