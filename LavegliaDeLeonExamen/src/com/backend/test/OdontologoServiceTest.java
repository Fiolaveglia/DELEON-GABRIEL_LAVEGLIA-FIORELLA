package com.backend.test;

import com.backend.dao.Impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import com.backend.service.Impl.OdontologoService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class OdontologoServiceTest {

    private OdontologoService odontologoService;

   @Test
  public void debeRegistrarOdontologoEnH2(){
        //odontologoService = new OdontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo(1234, "Carlos", "Pérez");
        Odontologo odontologoRegistrado  = odontologoService.registrarOdontologo(odontologo);

        Assertions.assertNotNull(odontologoRegistrado);
        Assertions.assertTrue(odontologoRegistrado.getId() !=0, "El Id del Odontólogo debe ser distinto a 0");

    }

    @Test
   public void debeRegistrarOdontologoEnMemoria(){
        Odontologo odontologo = new Odontologo(1234, "Carlos", "Pérez");
        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

        List<Odontologo> odontologos = odontologoService.listarOdontologo();
        Assertions.assertTrue(odontologos.contains(odontologoRegistrado), "El Odontólogo debe estar en la lista");
    }

    @Test
    public void debeListarOdontologosEnH2(){
        odontologoService.setOdontologoDao(new OdontologoDaoH2());
        List<Odontologo> listaOdontologos = odontologoService.listarOdontologo();

        Assertions.assertFalse(listaOdontologos.isEmpty(), "La lista de odontólogos no debe estar vacía");
    }


}
