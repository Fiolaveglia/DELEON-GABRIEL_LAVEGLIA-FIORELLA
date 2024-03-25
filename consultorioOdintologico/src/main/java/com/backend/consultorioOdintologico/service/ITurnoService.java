package com.backend.consultorioOdintologico.service;


import com.backend.consultorioOdintologico.dto.entrada.TurnoEntradaDto;
import com.backend.consultorioOdintologico.dto.salida.TurnoSalidaDto;
import com.backend.consultorioOdintologico.exceptions.BadRequestException;
import com.backend.consultorioOdintologico.exceptions.ResourceNotFoundException;

import java.util.List;

public interface ITurnoService {
    TurnoSalidaDto registrarTurno(TurnoEntradaDto turnoEntradaDto) throws BadRequestException, ResourceNotFoundException;

    List<TurnoSalidaDto> listarTurnos();

    TurnoSalidaDto buscarTurnoPorId(Long id);

    void eliminarTurno(Long id);

    TurnoSalidaDto modificarTurno(TurnoEntradaDto turnoEntradaDto, Long id);
}
