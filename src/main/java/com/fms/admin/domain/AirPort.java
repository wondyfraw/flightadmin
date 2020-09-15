package com.fms.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AirPort  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String code;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
