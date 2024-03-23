package com.backend.service.Impl;

import com.backend.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    Odontologo registrarOdontologo(Odontologo paciente);
    List<Odontologo> listarPacientes();
    Odontologo buscarOdontologoPorId(int id);

    List<Odontologo> listarOdontologo();
}
