package com.fms.admin.repository;

import com.fms.admin.domain.AirLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirLineRepository extends JpaRepository<AirLine,Integer> {
    public AirLine findByCode(String code);
}
