package com.lynch.exoplanet.planet;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class PlanetController {

	private final Logger log = LoggerFactory.getLogger(PlanetController.class);

	@Autowired
	private PlanetService planetService;

	@GetMapping(value ="/planets")
	public List<Planet> getAllPlanets() {
		log.debug("Received REST request for All Planets");
		return planetService.getAllPlanets();
	}

	@GetMapping(value ="/planets/{id}")
	public Optional<Planet> getPlanet(@PathVariable Long id) {
		log.debug("Received REST request for Planet: {}", id);
		return planetService.getPlanet(id); }

	@PostMapping(value = "/planets")
	public void addPlanet(@RequestBody Planet planet) {
		log.debug("Received REST request to add Planet: {}", planet);
		planetService.addPlanet(planet);
	}

	@PutMapping(value = "/planets")
	public void editPlanet(@RequestBody Planet planet) {
		log.debug("Received REST request to edit Planet: {}", planet);
		planetService.editPlanet(planet);
	}

	@DeleteMapping(value = "/planets/{id}")
	public void deletePlanet(@PathVariable Long id) {
		log.debug("Received REST request to delete Planet: {}", id);
		planetService.deletePlanet(id);
	}

	@GetMapping(value = "/planets/query/1")
	public List<Planet> getNearestPlanets() {
		log.debug("Received REST SQL Query request to get nearest Planet");
		return planetService.getPlanetsWithin5Parsecs(); }

	@GetMapping(value = "/planets/query/2")
	public List<Planet> getRockyPlanets() {
		log.debug("Received REST SQL Query request to get rocky Planet");
		return planetService.getRockyPlanets(); }

	@GetMapping(value = "/planets/query/3")
	public List<Planet> get12AuPlanets() {
		log.debug("Received REST SQL Query request to get Planet between 1-2 AU from their Star");
		return planetService.get12AuPlanets(); }


	@GetMapping(value = "/planets/query/4")
	public List<Planet> getEarthSizePlanets() {
		log.debug("Received REST SQL Query request to get Earth-sized Planet");
		return planetService.getEarthSizePlanets(); }

	@GetMapping(value = "/planets/query/5")
	public List<Planet> getMultiPlanetSystems() {
		log.debug("Received REST SQL Query request to get known multi-Planet systems");
		return planetService.getMultiPlanetSystems(); }

	@GetMapping(value = "/planets/query/6")
	public List<Planet> getKeplerPlanets() {
		log.debug("Received REST SQL Query request to get Kepler Planet");
		return planetService.getKeplerPlanets(); }

	@GetMapping(value = "/planets/query/7")
	public List<Planet> getTrappistPlanets() {
		log.debug("Received REST SQL Query request to get TRAPPIST-1 Planet");
		return planetService.getTrappistPlanets(); }

	@GetMapping(value = "/planets/query/8")
	public List<Planet> getSuperEarthSizePlanets() {
		log.debug("Received REST SQL Query request to get super Earth-sized Planet");
		return planetService.getSuperEarthSizePlanets(); }

	@GetMapping(value = "/planets/query/9")
	public List<Planet> getNasaInterestingPlanets() {
		log.debug("Received REST SQL Query request to get NASA Interesting Planet List");
		return planetService.getNasaInterestingPlanets(); }

	@GetMapping(value = "/planets/query/10")
	public List<Planet> getPlanetsFoundByImaging() {
		log.debug("Received REST SQL Query request to get planets found by imaging");
		return planetService.getPlanetsFoundByImaging(); }

	@GetMapping(value = "/planets/query/11")
	public List<Planet> getPlanetsInBinarySystems() {
		log.debug("Received REST SQL Query request to get planets in Binary Star systems");
		return planetService.getPlanetsInBinarySystems(); }
}
