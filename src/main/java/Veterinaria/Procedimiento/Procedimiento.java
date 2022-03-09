package Veterinaria.Procedimiento;

import Veterinaria.Atencion.Value.IdAnimal;
import Veterinaria.Atencion.Value.IdAtencion;
import Veterinaria.Generic.Descripcion;
import Veterinaria.Procedimiento.Value.IdDiagnostico;
import Veterinaria.Procedimiento.Value.IdProcedimiento;
import Veterinaria.Procedimiento.events.ProcedimientoCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

public class Procedimiento extends AggregateEvent<IdProcedimiento> {

    protected IdAtencion idAtencion;
    protected IdAnimal idAnimal;
    protected IdDiagnostico idDiagnostico;
    protected Descripcion accion;

    public Procedimiento(IdProcedimiento entityId, Descripcion accion) {
        super(entityId);

    }


    /***
     * CREACIÓN DE PROCEDIMIENTOS DEL AGREGADO
     */

    public void setAnimal(IdAnimal idAnimal){
        this.idAnimal = idAnimal;
    }

    public void generarDiagnostico(IdAnimal idAnimal, IdAtencion idAtencion, IdDiagnostico idDiagnostico, Descripcion accion){

    }

    public void accion(){

    }

    public void generarHistoria(){

    }

    public void listaHistorias(){

    }

}
