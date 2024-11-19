package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedicamento {

    //1.Llamar al repositorio repectivo
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    //2.Se programan las funciones para las distintas operaciones en la BD

    //Funcion para guardar datos
    public Medicamento guardarMedicamento(Medicamento datosMedicamento)throws Exception{
        try{
            return iRepositorioMedicamento.save(datosMedicamento);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
