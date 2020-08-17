package com.lynch.exoplanet.planet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class PlanetController {

	@Autowired
	private PlanetService planetService;

	@RequestMapping("/")
	public String getLandingPage() {
		return ("<h1>Landing</h1>");
	}

	@RequestMapping("/home")
	public String getHomePage() {
		return ("<h1>Welcome All</h1>");
	}

	@RequestMapping("/user")
	public String getUserPage() {
		return ("<h1>Welcome User</h1>");
	}

	@RequestMapping("/admin")
	public String getAdminPage() {
		return ("<h1>Welcome Admin</h1>");
	}

	@RequestMapping("/planets")
	public List<Planet> getAllPlanets() {
		return planetService.getAllPlanets();
	}

	@RequestMapping("/planets/{id}")
	public Optional<Planet> getPlanet(@PathVariable Long id) { return planetService.getPlanet(id); }

	@RequestMapping(value = "/planets", method = RequestMethod.POST)
	public void addPlanet(@RequestBody Planet planet) {
		planetService.addPlanet(planet);
	}

	@RequestMapping(value = "/planets", method = RequestMethod.PUT)
	public void editPlanet(@RequestBody Planet planet) {
		planetService.editPlanet(planet);
	}

	@RequestMapping(value = "/planets/{id}", method = RequestMethod.DELETE)
	public void deletePlanet(@PathVariable Long id) {
		planetService.deletePlanet(id);
	}

	@RequestMapping(value = "/planets/query/1")
	public List<Planet> getNearestPlanets() { return planetService.getPlanetsWithin5Parsecs(); }

	@GetMapping(value = "/planets/query/2")
	public List<Planet> getRockyPlanets() { return planetService.getRockyPlanets(); }

	@GetMapping(value = "/planets/query/3")
	public List<Planet> get12AuPlanets() { return planetService.get12AuPlanets(); }


	@GetMapping(value = "/planets/query/4")
	public List<Planet> getEarthSizePlanets() { return planetService.getEarthSizePlanets(); }

	@GetMapping(value = "/planets/query/5")
	public List<Planet> getMultiPlanetSystems() { return planetService.getMultiPlanetSystems(); }

	@GetMapping(value = "/planets/query/6")
	public List<Planet> getKeplerPlanets() { return planetService.getKeplerPlanets(); }

	@GetMapping(value = "/planets/query/7")
	public List<Planet> getTrappistPlanets() { return planetService.getTrappistPlanets(); }

	@GetMapping(value = "/planets/query/8")
	public List<Planet> getSuperEarthSizePlanets() { return planetService.getSuperEarthSizePlanets(); }

	@GetMapping(value = "/planets/query/9")
	public List<Planet> getNasaInterestingPlanets() { return planetService.getNasaInterestingPlanets(); }


}
