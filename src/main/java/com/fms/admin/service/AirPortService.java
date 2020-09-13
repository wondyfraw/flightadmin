package com.fms.admin.service;

import com.fms.admin.domain.AirPort;

import java.util.List;

public interface AirPortService {
    public List<AirPort> getAllAirPort();
    public AirPort saveAirPort(AirPort airPort);
    public void deleteAirPort(Integer id);
    public AirPort updateAirPort(AirPort airPort);
    public AirPort findByCode(String code);
}
