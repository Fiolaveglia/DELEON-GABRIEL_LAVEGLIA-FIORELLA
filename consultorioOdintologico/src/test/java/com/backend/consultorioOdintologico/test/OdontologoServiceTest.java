package com.backend.consultorioOdintologico.test;

import com.backend.consultorioOdintologico.dao.Impl.OdontologoDaoH2;

import com.backend.consultorioOdintologico.entity.Odontologo;
import com.backend.consultorioOdintologico.service.Impl.OdontologoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OdontologoServiceTest {

    private OdontologoService odontologoService;

    @Test
  public void debeHacerUnRegistroDeUnOdontologoNuevoEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo(1234, "Carlos", "Pérez");

        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

       // Assertions.assertTrue(odontologo.getId() != 0);
        assertNotNull(odontologoRegistrado);
        assertNotEquals(0, odontologoRegistrado.getId());

    }



    @Test
    public void debeHacerUnaListaDeOdontologosEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());


       odontologoService.listarOdontologo();

        // Assertions.assertTrue(odontologo.getId() != 0);
        List<Odontologo> odontologos = odontologoService.listarOdontologo();

        assertNotNull(odontologos);
        assertFalse(odontologos.isEmpty());

    }


}
