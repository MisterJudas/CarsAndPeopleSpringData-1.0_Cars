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

