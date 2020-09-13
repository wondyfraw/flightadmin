package com.fms.admin.service;

import com.fms.admin.domain.AirLine;

import java.util.List;

public interface AirLineService {
    public List<AirLine> getAllAirLines();
    public AirLine saveAirLine(AirLine airLine);
    public void deleteAirLine(Integer id);
    public AirLine updateAirLine(AirLine airLine);
    public AirLine findByCode(String code);
}
