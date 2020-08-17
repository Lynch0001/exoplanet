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
	
	public Optional<Planet> getPlanet(Long id) {
		return planetRepository.findById(id);
	}
	
	public void editPlanet(Planet planet ) {
		planetRepository.save(planet);
	}	
	
	public void deletePlanet(Long id) {
		planetRepository.deleteById(id);
	}

	public List<Planet> getPlanetsWithin5Parsecs(){
		return planetRepository.getPlanetsWithin5Parsecs();
	}

	public List<Planet> getRockyPlanets(){
		return planetRepository.getRockyPlanets();
	}

	public List<Planet> get12AuPlanets(){
		return planetRepository.get12AuPlanets();
	}

	public List<Planet> getEarthSizePlanets(){
		return planetRepository.getEarthSizePlanets();
	}

	public List<Planet> getMultiPlanetSystems(){
		return planetRepository.getMultiPlanetSystems();
	}

	public List<Planet> getKeplerPlanets(){
		return planetRepository.getKeplerPlanets();
	}

	public List<Planet> getTrappistPlanets(){
		return planetRepository.getTrappistPlanets();
	}

	public List<Planet> getSuperEarthSizePlanets(){
		return planetRepository.getSuperEarthSizePlanets();
	}

	public List<Planet> getNasaInterestingPlanets(){
		return planetRepository.getNasaInterestingPlanets();
	}



}
