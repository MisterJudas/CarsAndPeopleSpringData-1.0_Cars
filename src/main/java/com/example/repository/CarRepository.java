package com.example.repository;

import com.example.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CarRepository extends JpaRepository<Car, Long> {

    //Spring Data Queries

    List<Car> findByYearOfFabGreaterThanEqual(Integer yearOfFab);

    List<Car> findByYearOfFabLessThan(Integer yearOfFab);

    List<Car> findByYearOfFabBetween(Integer min, Integer max);

    List<Car> findByPriceGreaterThanEqual(Double price);

    List<Car> findByPriceBetween(Double min, Double max);

    Car findByPlateNumber(String plateNumber);

    List<Car> findByBrandAndModel(String brand, String model);

    List<Car> findByBrandAndPrice(String brand, Double price);

    List<Car> findByBrandAndModelAndPriceGreaterThanEqual(String brand, String model, Double price);

    List<Car> findByBrand(String brand);

    List<Car> findByYearOfFab(Integer yearOfFab);


    //JPQL Queries

    @Query("SELECT AVG(car.price) from Car car WHERE car.brand = :brand ")
    Double findAveragePerBrand(@Param("brand") String brand);

    @Query("SELECT car FROM Car car WHERE car.plateNumber LIKE CONCAT('%',:plateNumberPart,'%')")
    List<Car> findCarByPlateNumberSubstring(@Param("plateNumberPart") String plateNumberPart);

    //Forma2. Con Spring Data Query

    List<Car> findByPlateNumberContains(String plateNumberPart);

    @Query("SELECT car.brand, AVG(car.price), MIN(car.price), MAX(car.price) " +
            "FROM Car car " +
            "GROUP BY car.brand")
    List<Object[]> AvgAndMaxAndMinPricesPerBrand();

    //Si no especificamos es asc por defecto
    @Query("SELECT car.brand, AVG(car.price), MIN(car.price), MAX(car.price) " +
            "FROM Car car " +
            "GROUP BY car.brand " +
            "ORDER BY AVG(car.price) DESC ")
    List<Object[]> AvgAndMaxAndMinPricesPerBrandOrderedByAVGPrice();


    @Query("SELECT car.yearOfFab, COUNT(car) " +
            "FROM Car car " +
            "GROUP BY car.yearOfFab")
    List<Object[]> CarsMadeByYear();

}


