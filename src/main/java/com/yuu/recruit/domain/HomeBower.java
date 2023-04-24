package com.yuu.recruit.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "home_bower")
public class HomeBower implements Serializable {
    /**
     * 主页浏览表
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 雇员ID
     */
    @Column(name = "employee_id")
    private Long employeeId;

    /**
     * 雇主ID
     */
    @Column(name = "employer_id")
    private Long employerId;

    /**
     * 浏览时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Long employerId) {
        this.employerId = employerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
