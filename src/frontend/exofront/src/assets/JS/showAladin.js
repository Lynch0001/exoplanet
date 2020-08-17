function showAladin(starName)
{
  console.log("This is ShowAladin Function running");
  var aladin = A.aladin("#aladin-lite-div", {
    survey: 'P/allWISE/color', // set initial image survey
    fov: 1.5, // initial field of view in degrees
    target: starName, // initial target
    cooFrame: 'galactic', // set galactic frame
    reticleColor: '#ff89ff', // change reticle color
    reticleSize: 16 // change reticle size


});}

