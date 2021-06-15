package com.bahman.nasatest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class Application  implements CommandLineRunner {

@Autowired
INasaService nasaService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
       /* int sol=1000;
        String camera="fhaz";
   //   String url ="https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&camera=fhaz&api_key=1hNsXf9gjerRbQsrC88ZDpVAgCCZPgu7SePIs0Yp";
    String data=    nasaService.getRoverData(sol,camera);
        System.out.println(data);*/

    }
}


