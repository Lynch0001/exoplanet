package com.lynch.exoplanet.star;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StarController {
  
  @Autowired
  private StarService starService;

  @RequestMapping("/stars")
  public List<Star> getAllStars() {
    return starService.getAllStars();
  }

  @RequestMapping("/stars/{id}")
  public Optional<Star> getStar(@PathVariable Long id){
    return starService.getStar(id);
  }

  @RequestMapping(value="/stars", method= RequestMethod.POST)
  public void addStar(@RequestBody Star star) {
    starService.addStar(star);
  }

  @RequestMapping(value="/stars", method=RequestMethod.PUT)
  public void editStar(@RequestBody Star star) {
    starService.editStar(star);
  }

  @RequestMapping(value="/stars/{id}", method=RequestMethod.DELETE)
  public void deleteStar(@PathVariable Long id) {
    starService.deleteStar(id);
  }

  /*
  public List<Star> getStarsByHasExoPlanets(){
    starService.getStarsByHasExoPlanets();
  }

  public List<Star> getStarsOrderBySDistanceAsc() {
    starService.getStarsOrderBySDistanceAsc();
  }

  public Star getStarByNameContains(String name){
    starService.getStarByNameContains(name);
  }

  public List<Star> getStarsOrderByNumPlanetsDesc(){
    starService.getStarsOrderByNumPlanetsDesc();
  }

  public List<Star> getStarsBySRadiusNotNullAndOrderBySRadiusDesc(){
    starService.getStarsBySRadiusNotNullAndOrderBySRadiusDesc();
  }

   */
}

