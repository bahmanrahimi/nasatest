package com.bahman.nasatest;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NasaRepository extends PagingAndSortingRepository<Nasa,Long> {

}
