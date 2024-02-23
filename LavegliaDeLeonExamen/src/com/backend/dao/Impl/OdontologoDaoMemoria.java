package com.backend.dao.Impl;
import com.backend.dao.IDao;

import com.backend.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OdontologoDaoMemoria implements IDao<Odontologo> {
    private final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);
    private List<Odontologo> odontologoRepository;


    public OdontologoDaoMemoria(List<Odontologo> odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        int id = odontologoRepository.size() + 1;
        Odontologo odontologoRegistrado = odontologo;
        odontologoRegistrado.setId(id);
        odontologoRegistrado = new Odontologo(id, odontologo.getNumeroMatricula(), odontologo.getNombre(), odontologo.getApellido());

        odontologoRepository.add(odontologo);
        LOGGER.info("Odontólogo guardado: " + odontologoRegistrado);
        return odontologoRegistrado;
    }



    @Override
    public List<Odontologo> listarTodos() {
        return null;
    }

}
