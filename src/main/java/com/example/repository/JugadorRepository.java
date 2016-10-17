package com.example.repository;

import com.example.domain.Car;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    //Spring Data Queries

    List<Jugador> findByNombre(String nombre);

    List<Jugador> findByCanastasGreaterThanEqual(int canastas);

    List<Jugador> findByAsistenciasBetween(int min, int max);

    List<Jugador> findByPosicionEquals(String posicion);

    List<Jugador> findByFechaNacimientoLessThan(LocalDate fechaNacimiento);

    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes) "+
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgCanastasAsistenciasRebotesPorPosicion();

    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes), MAX(jugador.canastas), MAX(jugador.asistencias), MAX(jugador.rebotes), MIN(jugador.canastas), MIN(jugador.asistencias), MIN(jugador.rebotes) "+
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgCanastasAsistenciasRebotesMinMaxPorPosicion();






/*
    List<Car> findByYearOfFabLessThan(Integer yearOfFab);

    List<Car> findByYearOfFabBetween(Integer min, Integer max);

    List<Car> findByPriceGreaterThanEqual(Double price);

    List<Car> findByPriceBetween(Double min, Double max);

    Car findByPlateNumber(String plateNumber);

    List<Car> findByBrandAndModel(String brand, String model);

    List<Car> findByBrandAndPrice(String brand, Double price);

    List<Car> findByBrandAndModelAndPriceGreaterThanEqual(String brand, String model, Double price);

    List<Car> findByBrand(String brand);

    List<Car> findByYearOfFab(Integer yearOfFab);*/

}

