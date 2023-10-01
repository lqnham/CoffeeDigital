package com.coffee.digital.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditEntity implements Serializable {
    @Column(name = "Created_By", length = 100,  updatable = false)
    private String createdBy;

    @Column(name = "Created_Datetime", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDatetime;

    @Column(name = "Modified_By", length = 100)
    private String modifiedBy;

    @Column(name = "Modified_Datetime")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date modifiedDatetime;
}
