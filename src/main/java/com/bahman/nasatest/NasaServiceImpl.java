package com.bahman.nasatest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NasaServiceImpl implements INasaService{

    @Autowired
    NasaRepository nasaRepository;
    @Override
    public String getRoverData(int sol,String camera) {

        String apiKey="1hNsXf9gjerRbQsrC88ZDpVAgCCZPgu7SePIs0Yp";
        String url="https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol="+sol+"&camera="+camera+"&api_key="+apiKey;

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = url;

        long time = System.currentTimeMillis();

        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl , String.class);

        long responseTime = (System.currentTimeMillis() - time);
String methodName=url;


Nasa nasa=new Nasa();
nasa.setResponseTime(responseTime);
nasa.setMethodName(url);
nasa.setData(response.getBody());
Nasa savedNasa=nasaRepository.save(nasa);
        System.out.println(savedNasa.getId());

//make   and save in database

        return response.getBody();
    }

    @Override
    public List<Nasa> getAll() {
        return (List<Nasa>) nasaRepository.findAll();
    }
}
