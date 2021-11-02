package com.fms.admin.service.Impl;

import com.fms.admin.domain.AirLine;
import com.fms.admin.repository.AirLineRepository;
import com.fms.admin.service.AirLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirLineServiceImpl implements AirLineService {

    @Autowired
    private AirLineRepository airLineRepository;

    @Override
    public List<AirLine> getAllAirLines() {

        return airLineRepository.findAll();
    }

    @Override
    public AirLine saveAirLine(AirLine airLine) {

        return airLineRepository.save(airLine);
    }

    @Override
    public void deleteAirLine(Integer id) {
      if(id ==null)
          throw new IllegalArgumentException();

      airLineRepository.deleteById(id);
    }

    @Override
    public AirLine updateAirLine(AirLine airLine) {
        return airLineRepository.findById(airLine.getId()).orElse(airLineRepository.save(airLine));
    }

    @Override
    public AirLine findByCode(String code) {
        if(code != null  || code.equals(" "))
            throw new NullPointerException();
        if(code.length()>2 || code.length() <2){
            throw new IllegalArgumentException();
        }
        return airLineRepository.findByCode(code);
    }

}
