package com.fms.admin.service.Impl;

import com.fms.admin.domain.AirLine;
import com.fms.admin.domain.AirPort;
import com.fms.admin.repository.AirPortRepository;
import com.fms.admin.service.AirPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirPortServiceImpl implements AirPortService {

    @Autowired
    private AirPortRepository airPortRepository;

    @Override
    public List<AirPort> getAllAirPort() {
        return airPortRepository.findAll();
    }

    @Override
    public AirPort saveAirPort(AirPort airPort) {
        return airPortRepository.save(airPort);
    }

    @Override
    public void deleteAirPort(Integer id) {
      airPortRepository.deleteById(id);
    }

    @Override
    public AirPort updateAirPort(AirPort airPort) {
         return airPortRepository.findById(airPort.getId()).orElse(airPortRepository.save(airPort));
    }

    @Override
    public AirPort findByCode(String code) {
            if(code != null  || code.equals(" "))
                throw new NullPointerException();
            if(code.length()>3 || code.length() <3){
                throw new IllegalArgumentException();
            }
        return airPortRepository.findByCode(code);
        }
    }
