package com.backend.consultorioOdintologico.service.Impl;

import com.backend.consultorioOdintologico.dao.Impl.OdontologoDaoH2;
import com.backend.consultorioOdintologico.entity.Odontologo;
import com.backend.dao.IDao;
import com.backend.consultorioOdintologico.entity.Odontologo;
import com.backend.consultorioOdintologico.service.IOdontologoService;

import java.util.List;

public class OdontologoService implements IOdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(OdontologoDaoH2 odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologo() {
        return odontologoIDao.listarTodos();
    }






}
