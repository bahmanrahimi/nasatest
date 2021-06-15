package com.bahman.nasatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    INasaService nasaService;

    @GetMapping("/v1/river")
    public ResponseEntity<String> callNasaApi(@RequestParam(name = "sol") int sol,@RequestParam(name = "camera") String camera ) {


String result=nasaService.getRoverData(sol,camera);

        return ResponseEntity.ok(result);

    }
    @GetMapping("/v1/getAll")
    public ResponseEntity<List<Nasa>> getAll( ) {


List<Nasa> nasaList=nasaService.getAll();

        return ResponseEntity.ok(nasaList);

    }
}
