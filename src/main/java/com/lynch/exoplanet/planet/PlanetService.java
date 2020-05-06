package com.lynch.exoplanet.planet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlanetService {

	@Autowired
	private PlanetRepository planetRepository;
	
	public List<Planet> getAllPlanets(){
		return planetRepository.findAll();
	}
	
	public void addPlanet(Planet planet) {
		planetRepository.save(planet);
	}
	
	public Optional<Planet> getPlanet(long id) {
		return planetRepository.findById(id);
	}
	
	public void editPlanet(Planet planet ) {
		planetRepository.save(planet);
	}	
	
	public void deletePlanet(long id) {
		planetRepository.deleteById(id);
	}
}
