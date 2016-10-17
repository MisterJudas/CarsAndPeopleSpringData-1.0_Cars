package com.example.service;

import com.example.domain.Car;
import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.CarRepository;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    //id nombre fecha canasta asistencia rebote posicion
    public void testJugadores() {

        //Jugador jugador1 = new Jugador("Eduardo-Amilcar", LocalDate.of(1992, 10, 21), 221, 454, 432, "Base");
        //jugadorRepository.save(jugador1);

        Equipo equipo1 = new Equipo("Los Txurruca", "Muchamiel", LocalDate.of(2000,11,13));
       jugadorRepository.save(jugador1);

    }}
