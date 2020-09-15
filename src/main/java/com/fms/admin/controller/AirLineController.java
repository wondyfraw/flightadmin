package com.fms.admin.controller;

import com.fms.admin.domain.AirLine;
import com.fms.admin.service.AirLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airlines")
public class AirLineController {

    @Autowired
    private AirLineService airLineService;

    @PostMapping("/saveAirLine")
    public AirLine registerAirLine(@RequestBody AirLine airLine){
        return airLineService.saveAirLine(airLine);
    }

    @GetMapping
    public List<AirLine> getAllAirLines(){
        return airLineService.getAllAirLines();
    }

    @PutMapping("/updateAirLine")
    public AirLine updateAirLine(@RequestBody AirLine airLine){
        return airLineService.updateAirLine(airLine);
    }

    @DeleteMapping("/deleteAirLine/{id}")
    public void deleteAirLine(@PathVariable Integer id){
        airLineService.deleteAirLine(id);
    }

    @GetMapping("/{code}")
    public AirLine findAirLineByCode(@PathVariable String code){
      return airLineService.findByCode(code);
    }
}
