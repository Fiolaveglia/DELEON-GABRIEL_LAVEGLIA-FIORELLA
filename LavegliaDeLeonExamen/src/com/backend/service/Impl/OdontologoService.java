package com.backend.service.Impl;

import com.backend.dao.IDao;
import com.backend.dao.Impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;

import java.util.List;

public class OdontologoService implements IOdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    }

    @Override
    public List<Odontologo> listarPacientes() {
        return null;
    }

    @Override
    public Odontologo buscarOdontologoPorId(int id) {
        return null;
    }

    @Override
    public List<Odontologo> listarOdontologo() {
        return odontologoIDao.listarTodos();
    }

    public void setOdontologoDao(OdontologoDaoH2 odontologoDaoH2) {
        this.odontologoIDao = odontologoIDao;
    }
}




