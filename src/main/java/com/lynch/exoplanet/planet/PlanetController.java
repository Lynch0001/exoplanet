package com.lynch.exoplanet.planet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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

	@RequestMapping(value = "/planetswithin100parsecs")
	public List<Planet> getNearestPlanets() { return planetService.getPlanetsWithin100Parsecs(); }

}
