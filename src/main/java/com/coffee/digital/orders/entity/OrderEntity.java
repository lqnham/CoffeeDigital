package com.coffee.digital.orders.entity;

import com.coffee.digital.entity.AuditEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "OrderEntity")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderEntity extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "id_shop")
    private Long idShop;

    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "queue_position")
    private Integer queuePosition;

    @Column(name = "wait_time")
    private Integer waitTime;

    @Column(name = "order_placed_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date orderPlacedDateTime;

    @Column(name = "order_complete_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderCompleteDateTime;
}
