package com.backend.consultorioOdintologico.service;


import com.backend.consultorioOdintologico.dto.entrada.PacienteEntradaDto;
import com.backend.consultorioOdintologico.dto.salida.PacienteSalidaDto;
import com.backend.consultorioOdintologico.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IPacienteService {
    PacienteSalidaDto registrarPaciente(PacienteEntradaDto paciente);

    List<PacienteSalidaDto> listarPacientes();

    PacienteSalidaDto buscarPacientePorId(Long id);

    void eliminarPaciente(Long id) throws ResourceNotFoundException;

    PacienteSalidaDto modificarPaciente(PacienteEntradaDto pacienteEntradaDto, Long id) throws ResourceNotFoundException;
}
