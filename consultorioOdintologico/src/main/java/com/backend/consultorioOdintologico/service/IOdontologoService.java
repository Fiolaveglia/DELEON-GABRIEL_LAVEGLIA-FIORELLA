package com.backend.consultorioOdintologico.service;

import com.backend.consultorioOdintologico.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    Odontologo registrarOdontologo(Odontologo odontologo);
    List<Odontologo> listarOdontologo();


}
