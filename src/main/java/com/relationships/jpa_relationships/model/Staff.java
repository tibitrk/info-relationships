package com.relationships.jpa_relationships.model;

import jakarta.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeCode;
    private String employeeTypeId;
    private String employeeName;
    private Long workingDeptId;
    private Long projectDeptId;
    private Long reportsTo;
    private Long employeeRoleId;

    @OneToOne(mappedBy = "staff", cascade = CascadeType.ALL)
    private StaffDetails staffDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeTypeId() {
        return employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getWorkingDeptId() {
        return workingDeptId;
    }

    public void setWorkingDeptId(Long workingDeptId) {
        this.workingDeptId = workingDeptId;
    }

    public Long getProjectDeptId() {
        return projectDeptId;
    }

    public void setProjectDeptId(Long projectDeptId) {
        this.projectDeptId = projectDeptId;
    }

    public Long getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Long reportsTo) {
        this.reportsTo = reportsTo;
    }

    public Long getEmployeeRoleId() {
        return employeeRoleId;
    }

    public void setEmployeeRoleId(Long employeeRoleId) {
        this.employeeRoleId = employeeRoleId;
    }

    public StaffDetails getStaffDetails() {
        return staffDetails;
    }

    public void setStaffDetails(StaffDetails staffDetails) {
        this.staffDetails = staffDetails;
    }
}
