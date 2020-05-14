package com.lynch.exoplanet.star;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StarService {

  @Autowired
  private StarRepository starRepository;

  public List<Star> getAllStars(){
    return starRepository.findAll();
  }

  public Optional<Star> getStar(Long id){
    return starRepository.findById(id);
  }

  public void addStar(Star star){
    starRepository.save(star);
  }

  public void editStar(Star star){
    starRepository.save(star);
  }

  public void deleteStar(Long id){
    starRepository.deleteById(id);
  }


  /*

  // TODO Special filter methods (Service)

  public List<Star> getStarsByHasExoPlanets(){
    return starRepository.getStarsByHasExoPlanets();
  }

  public List<Star> getStarsOrderBySDistanceAsc() {
    return starRepository.getStarsOrderBySDistanceAsc();
  }

  public Star getStarByNameContains(String name){
    return starRepository.getStarByNameContains(name);
  }

  public List<Star> getStarsOrderByNumPlanetsDesc(){
    return starRepository.getStarsOrderByNumPlanets();
  }

  public List<Star> getStarsBySRadiusNotNullAndOrderBySRadiusDesc(){
    return starRepository.getStarsBySRadiusNotNullAndOrderBySRadiusDesc();
  }
   */
}
