package com.backend.consultorioOdintologico.controller;

import com.backend.consultorioOdintologico.dto.entrada.TurnoEntradaDto;
import com.backend.consultorioOdintologico.dto.salida.TurnoSalidaDto;
import com.backend.consultorioOdintologico.exceptions.BadRequestException;
import com.backend.consultorioOdintologico.exceptions.ResourceNotFoundException;
import com.backend.consultorioOdintologico.service.ITurnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private ITurnoService turnoService;

    public TurnoController(ITurnoService turnoService) {
        this.turnoService = turnoService;
    }

    //POST
    @PostMapping("/registrar")
    public ResponseEntity<TurnoSalidaDto> registrarPaciente(@RequestBody @Valid TurnoEntradaDto turnoEntradaDto) throws BadRequestException, ResourceNotFoundException {
        return new ResponseEntity<>(turnoService.registrarTurno(turnoEntradaDto), HttpStatus.CREATED);
    }

}
