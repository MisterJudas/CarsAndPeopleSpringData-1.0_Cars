package com.example.service;

import com.example.domain.Car;
import com.example.domain.Jugador;
import com.example.repository.CarRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    //id nombre fecha canasta asistencia rebote posicion
    public void testJugadores() {

        Jugador jugador1 = new Jugador("Eduardo-Amilcar",    LocalDate.of(1992,10,21),  221, 454, 432,   "Base");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador("Juanito Valderrama", LocalDate.of(1999, 3, 23), 891, 94,  4382, "Alero");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador("Tomate",             LocalDate.of(1934, 5, 13), 781, 254, 32,   "Pivot");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador("Pato Lucas",         LocalDate.of(1934, 9, 18), 89,  44,  4382, "Alero");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador( "Rukawa",            LocalDate.of(2000, 9, 15), 721, 954, 432,  "Pivot");
        jugadorRepository.save(jugador5);


        System.out.println("Buscar jugadores por nombre: ");
        System.out.println(jugadorRepository.findByNombre("Eduardo-Amilcar"));

        System.out.println("Buscar jugadores con canastas mayores que: ");
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(222));

        System.out.println("Buscar jugadores con asistencias entre: ");
        System.out.println(jugadorRepository.findByAsistenciasBetween(200, 500));

/*


        System.out.println("Buscar jugadores con asistencias entre: ");
        System.out.println(carRepository.findByYearOfFabBetween(2014, 2016));

        System.out.println("Buscar jugadores de la posición: ");
        System.out.println(carRepository.findByPriceGreaterThanEqual(25000.00));

        System.out.println("Buscar jugadores nacidos antes de: ");
        System.out.println(carRepository.findByPriceBetween(50000.00, 100000.00));

        System.out.println("Media de canastas asistencias y rebotes de jugadores en la posición: ");
        System.out.println(carRepository.findByPlateNumber("3564GER"));

        System.out.println("Media máximo y mínimo de jugadores en la posición: ");
        System.out.println(carRepository.findByBrandAndModel("Jaguar", "FPACE"));

    */
}}


/*

        código que calcula la media
        List<Car> carList = carRepository.findByBrand("BMW");

        int sum=0;
        int numCars=0;
        for(Car car : carList)
        {
            numCars++;
            sum=sum+car.getPrice();
        }

        int average= sum/numCars;



        System.out.println(carRepository.findByBrandAndPrice("BMW",80000.00));

        System.out.println("Cars of brand Aston Martin, model of James Bond of the movie Spectrum,DB10, that costs more than 3100000 Euros ");
        System.out.println(carRepository.findByBrandAndModelAndPriceGreaterThanEqual("Aston Martin","DB10",3100000.00));

        System.out.println("List of Jaguar brand cars");
        System.out.println(carRepository.findByBrand("Jaguar"));

        System.out.println("The average price all of Lexus cars is: " +carRepository.findAveragePerBrand("Lexus"));


        Querys con JPQL

        System.out.println("All cars which plate number contains 'ENG': " +carRepository.findCarByPlateNumberSubstring("ENG"));

        System.out.println("All cars wich plate number contains letter 'E' " +carRepository.findByPlateNumberContains("E"));

        System.out.println("Statistics");
        showStatistics(carRepository.AvgAndMaxAndMinPricesPerBrand());

        System.out.println("Statistics sorted by AvgPrice descendant");
        showStatistics(carRepository.AvgAndMaxAndMinPricesPerBrandOrderedByAVGPrice());


        System.out.println("Number of cars made each year: ");

        List<Object[]> carList = carRepository.CarsMadeByYear();

        for (Object[] car : carList)
        {
            Integer year = (Integer)car[0];
            System.out.println("Year: "+car[0]);
            System.out.println("Quantity: "+ car[1]);
            System.out.println("List of cars: "+carRepository.findByYearOfFab(year)+System.lineSeparator());
        }


    }

    private void showStatistics(List<Object[]> statisticsList) {
        for ( Object[] statistic: statisticsList)
        {
            System.out.println("Brand: "+statistic[0]);
            System.out.println("AVG = "+statistic[1] +" euros");
            System.out.println("MIN = "+statistic[2]+" euros");
            System.out.println("MAX = "+statistic[3]+" euros"+System.lineSeparator());
        }

        // el objeto es cada una de las líneas de la tabla que muestra al hacer la query. statistic[] son las columnas
    }

    */
