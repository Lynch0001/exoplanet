package com.lynch.exoplanet.planet;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class PlanetService {

	private final PlanetRepository planetRepository;

	private final Logger log = LoggerFactory.getLogger(PlanetService.class);

	@Autowired
	public PlanetService(PlanetRepository planetRepository){
		this.planetRepository = planetRepository;
	}


	public List<Planet> getAllPlanets(){
		log.debug("Received Planet controller request to get all Planets");
		return planetRepository.findAll();
	}

	public Page<Planet> getAllPlanetsByPage(Pageable pageable){
		log.debug("Received Planet controller request to get all Planets");
		return planetRepository.findAll(pageable);
	}

	public void addPlanet(Planet planet) {
		log.debug("Received Planet controller request to add Planet: {}", planet);
		planetRepository.save(planet);
	}
	
	public Optional<Planet> getPlanet(Long id) {
		log.debug("Received Planet controller request for Planet: {}", id);
		return planetRepository.findById(id);
	}
	
	public void editPlanet(Planet planet ) {
		log.debug("Received Planet controller request to edit Planet: {}", planet);
		planetRepository.save(planet);
	}	
	
	public void deletePlanet(Long id) {
		log.debug("Received Planet controller request to delete Planet: {}", id);
		planetRepository.deleteById(id);
	}

	public List<Planet> getPlanetsWithin5Parsecs(){
		log.debug("Received Planet controller request to get nearest Planet");
		return planetRepository.getPlanetsWithin5Parsecs();
	}

	public List<Planet> getRockyPlanets(){
		log.debug("Received Planet controller request to get rocky Planet");
		return planetRepository.getRockyPlanets();
	}

	public List<Planet> get12AuPlanets(){
		log.debug("Received Planet controller request to get Planet between 1-2 AU from their Star");
		return planetRepository.get12AuPlanets();
	}

	public List<Planet> getEarthSizePlanets(){
		log.debug("Received Planet controller request to get Earth-sized Planet");
		return planetRepository.getEarthSizePlanets();
	}

	public List<Planet> getMultiPlanetSystems(){
		log.debug("Received Planet controller request to get known multi-Planet systems");
		return planetRepository.getMultiPlanetSystems();
	}

	public List<Planet> getKeplerPlanets(){
		log.debug("Received Planet controller request to get Kepler Planet");
		return planetRepository.getKeplerPlanets();
	}

	public List<Planet> getTrappistPlanets(){
		log.debug("Received Planet controller request to get TRAPPIST-1 Planet");
		return planetRepository.getTrappistPlanets();
	}

	public List<Planet> getSuperEarthSizePlanets(){
		log.debug("Received Planet controller request to get super Earth-sized Planet");
		return planetRepository.getSuperEarthSizePlanets();
	}

	public List<Planet> getNasaInterestingPlanets(){
		log.debug("Received Planet controller request to get NASA Interesting Planet List");
		return planetRepository.getNasaInterestingPlanets();
	}

	public List<Planet> getPlanetsFoundByImaging(){
		log.debug("Received Planet controller request to get Planets found by imaging");
		return planetRepository.getPlanetsFoundByImaging();
	}

	public List<Planet> getPlanetsInBinarySystems(){
		log.debug("Received Planet controller request to get planets in Binary Star systems");
		return planetRepository.getPlanetsInBinarySystems();
	}

	public List<Planet> getAllPlanetsStartingWith(String nameStarts){
		return planetRepository.findAll().stream().filter(planet -> planet.getPl_name().startsWith(nameStarts)).collect(Collectors.toList());
	}

	public List<Planet> getAllPlanetsContaining(String containsInName){
		return planetRepository.findAll().stream().filter(planet -> planet.getPl_name().contains(containsInName)).collect(Collectors.toList());
	}
}
