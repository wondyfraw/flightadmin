package com.fms.admin.repository;

import com.fms.admin.domain.AirPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirPortRepository extends JpaRepository<AirPort,Integer> {
    public AirPort findByCode(String code);
}
