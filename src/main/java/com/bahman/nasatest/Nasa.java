package com.bahman.nasatest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Nasa" )
public class Nasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nasa",unique = true)
    private Long id;

    @NotNull
    @Column(name = "method_name")
    private  String methodName;

    @Column(name = "data",columnDefinition = "text")
    private  String data;




    @NotNull
    @Column(name = "responseTime")
    private Long responseTime;

    @Column(name = "CREATE_AT",nullable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;




    @PrePersist
    public void setCreationDate() {
        this.createdAt=new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Nasa{" +
                "id=" + id +
                ", methodName='" + methodName + '\'' +
                ", responseTime=" + responseTime +
                ", createdAt=" + createdAt +
                '}';
    }
}
