
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/lynch0001/exoplanet">
    <img src="https://user-images.githubusercontent.com/35854692/89293317-b95c6780-d62b-11ea-9943-737a8bb4746a.jpeg" alt="Logo" width="400" height="80">
  </a>

  <h3 align="center">Exoplanet Data Explorer</h3>

  <p align="center">
    App to explore NASA Exoplanet data because I am curious and interested in All-Things-Space
    <br />
    <a href="https://github.com/lynch0001/exoplanet"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/lynch0001/exoplanet">View Demo</a>
    ·
    <a href="https://github.com/lynch0001/exoplanet">Report Bug</a>
    ·
    <a href="https://github.com/lynch0001/exoplanet/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot2]](https://example.com)




### Built With

* []() Java 8
* []() Spring Boot 2.3.0
* []() Angular 8.3.4
* []() PostgreSQL
* []() Maven


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

1. Download and prepare the data 

    * Go to https://exoplanetarchive.ipac.caltech.edu/docs/data.html
    * Select the Planetary Systems Composite Data Table
    * Under the 'Download Table' option: select CSV Format and Download all Columns/all Rows
    * Open the file and remove column description information and rename the 'rowid' column to 'id'
    * Note: you'll have to update the schema.xml file with the path and filename

2. Setup the DB (if you choose something other than PostgreSQL, you will need to tweak the Schema SQL language)

### Installation
 
1. Clone the repo.
    ```sh
    git clone https://github.com/lynch0001/exoplanet.git
    ```
2. Install NPM packages.
    ```sh
    npm install
    ```
3. Run the backend.
    ```sh
    mvn spring-boot:run
    ```
4. Run the frontend.
    ```sh
    ng serve
    ```

<!-- USAGE EXAMPLES -->
## Usage

Current functionality (8/31/2020) allows users to:

* View a paginated list of the 4201 currently reported exoplanets and select characteristics (Note: I derived the characteristics from the underlying data to make it easier for me to consume (some are overly simplified and probably off mark))
* View result lists of selected queries
* View details of each exoplanet and its star highlighting imagery, location, and size comparison data

[product-screenshot1]: https://user-images.githubusercontent.com/35854692/91747909-0da42a00-eb8d-11ea-85da-d850c71fb74f.png

[product-screenshot2]: https://user-images.githubusercontent.com/35854692/91747999-375d5100-eb8d-11ea-804a-840708d35799.PNG

[product-screenshot3]: https://user-images.githubusercontent.com/35854692/91748084-5cea5a80-eb8d-11ea-952a-b4e503e96bcd.PNG

[product-screenshot4]: https://user-images.githubusercontent.com/35854692/91748116-6ecbfd80-eb8d-11ea-9dd8-e75467f5a4dd.PNG




<!-- ROADMAP -->
## Roadmap


See the [open issues](https://github.com/lynch0001/exoplanet/issues) for a list of proposed features (and known issues).


<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Tim Lynch 
* LinkedIn [timothy-j-lynch](https://www.linkedin.com/in/timothy-j-lynch/)
* Medium [@lynch0001](https://medium.com/@lynch0001) 
* Dev [@lynch0001](https://dev.to/lynch0001) 
* Stackoverflow [tim-lynch](https://stackoverflow.com/users/11063468/tim-lynch)
* Email Lynch0001@gmail.com

Project Link: [https://github.com/lynch0001/exoplanet](https://github.com/lynch0001/exoplanet)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements

* []() NASA Exoplanet Data Archive
* []() Aladin Lite from the Université de Strasbourg at https://aladin.u-strasbg.fr/AladinLite/
* []() VirtualSky from Las Cumbres Observatory at https://virtualsky.lco.global/
* []() John Thompson at https://springframework.guru/
* []() Koushik Kothagal at https://javabrains.io/
* []() Angular University at https://angular-university.io/
* []() Jason Watmore at https://jasonwatmore.com/





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/lynch0001/exoplanet.svg?style=flat-square
[contributors-url]: https://github.com/lynch0001/exoplanet/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/lynch0001/exoplanet.svg?style=flat-square
[forks-url]: https://github.com/lynch0001/exoplanet/network/members
[stars-shield]: https://img.shields.io/github/stars/lynch0001/exoplanet.svg?style=flat-square
[stars-url]: https://github.com/lynch0001/exoplanet/stargazers
[issues-shield]: https://img.shields.io/github/issues/lynch0001/exoplanet.svg?style=flat-square
[issues-url]: https://github.com/lynch0001/exoplanet/issues
[license-shield]: https://img.shields.io/github/license/lynch0001/exoplanet.svg?style=flat-square
[license-url]: https://github.com/lynch0001/exoplanet/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/timothy-j-lynch/

[product-screenshot1]: https://user-images.githubusercontent.com/35854692/91747909-0da42a00-eb8d-11ea-85da-d850c71fb74f.png
[product-screenshot2]: https://user-images.githubusercontent.com/35854692/91747999-375d5100-eb8d-11ea-804a-840708d35799.PNG
[product-screenshot3]: https://user-images.githubusercontent.com/35854692/91748084-5cea5a80-eb8d-11ea-952a-b4e503e96bcd.PNG
[product-screenshot4]: https://user-images.githubusercontent.com/35854692/91748116-6ecbfd80-eb8d-11ea-9dd8-e75467f5a4dd.PNG

