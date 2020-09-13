package com.fms.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger implements Serializable {

    @Id
    @GeneratedValue
    private Integer in;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dob;

    @OneToMany
    private Address address;
}
