package com.animeflix.animeflix.service;

import com.animeflix.animeflix.model.Serie;
import com.animeflix.animeflix.repository.ISerieRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SerieService {

    private final ISerieRepository serieRepository;

    public SerieService(ISerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public Serie createSerie(Serie serie){
        return  serieRepository.save(serie);
    }

    public List<Serie> listSeries(){
        return serieRepository.findAll();
    }

    public Optional<Serie> findSerieById(Long id){
       return  serieRepository.findById(id);
    }

    public Serie updateSerie(Serie serie, Long id){
        return serieRepository.findById(id).map(newSerie ->{
            newSerie.setName(serie.getName());
            newSerie.setCategorySerie(serie.getCategorySerie());
            newSerie.setDescription(serie.getDescription());
            return serieRepository.save(newSerie);
        }).orElseThrow(()-> new RuntimeException("Serie not found: " + id));
    }

    public void deleteSerie(Long id){
        if(serieRepository.findById(id).isPresent()){
            serieRepository.deleteById(id);
        } else throw new IllegalArgumentException("Serie not found with ID: " + id);
    }
}
