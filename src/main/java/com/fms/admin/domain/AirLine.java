package com.fms.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SecondaryTable(name="history", pkJoinColumns = {@PrimaryKeyJoinColumn(name = "airline_id", referencedColumnName = "id")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AirLine  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 2)
    private String code;
    @Column(table = "history")
    private String name;
}
