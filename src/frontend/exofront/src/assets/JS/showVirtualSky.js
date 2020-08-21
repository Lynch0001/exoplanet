function showVirtualSky(ra, dec, name)
{
  console.log("This is showSkyView Function running");
  console.log("Input RA: ", ra);
  console.log("Input RA type undefined: ", typeof ra);
  console.log("Input DEC: ", dec);
  let planetarium;
  S(document).ready(function() {

    planetarium = S.virtualsky({
      id: 'starmap',
      projection: 'planechart',
      longitude: 38.958630,
      latitude: -77.357002,
      ground: false,
      constellations: true,
      constellationlabels: true,
      gridlines_eq: true,
      showstars: true,
      showplanets: true,
      fov: 15,
      lang: 'en',
    });
    planetarium.addPointer({
      ra: ra,
      dec: dec,
      label: name,
      colour:'rgb(255,0,0)'
    })
  });
}
