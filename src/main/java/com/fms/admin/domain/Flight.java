package com.fms.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String flightNumber;
    private Integer capacity;
    private Double price;
    @ManyToOne
    @Column(name = "airline_id")
    private AirLine airLine;
    @ManyToOne
    private AirPort origin;
    @ManyToOne
    private AirPort destination;
    @Temporal(TemporalType.DATE)
    private Date arrivalDate;
    @Temporal(TemporalType.TIME)
    private Date arrivalTime;
    @Temporal(TemporalType.DATE)
    private Date departureDate;
    @Temporal(TemporalType.TIME)
    private Date departureTime;
}
