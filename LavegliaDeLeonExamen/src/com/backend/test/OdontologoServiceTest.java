package com.backend.test;

import com.backend.dao.Impl.OdontologoDaoH2;
import com.backend.dao.Impl.OdontologoDaoMemoria;
import com.backend.entity.Odontologo;
import com.backend.service.Impl.OdontologoService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;

public class OdontologoServiceTest {

    private OdontologoService odontologoService;

    @Test
  public void debeHacerUnRegistroDeUnOdontologoNuevoEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo(1234, "Carlos", "Pérez");

        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

       // Assertions.assertTrue(odontologo.getId() != 0);

    }

    @Test
   public void debeHacerUnRegistroDeUnOdontologoNuevoEnMemoria(){
        odontologoService = new OdontologoService(new OdontologoDaoMemoria(new ArrayList<>()));
        Odontologo odontologo = new Odontologo(1234, "Carlos", "Pérez");

        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

        Assertions.assertTrue(odontologoRegistrado.getId() != 0);

    }

    @Test
    public void debeHacerUnaListaDeOdontologosEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());


       odontologoService.listarOdontologo();

        // Assertions.assertTrue(odontologo.getId() != 0);

    }


}
