package com.bahman.nasatest;

import java.util.List;

public interface INasaService {
String getRoverData(int sol,String camera);

List<Nasa> getAll();

}
