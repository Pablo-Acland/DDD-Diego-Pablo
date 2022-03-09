package Veterinaria.Atencion;

import Veterinaria.Atencion.Value.Agenda;
import Veterinaria.Atencion.Value.IdAtencion;
import Veterinaria.Procedimiento.Value.IdProcedimiento;
import Veterinaria.VentaInsumos.Value.IdObjetoVario;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Atencion extends AggregateEvent<IdAtencion> {
     protected Agenda agenda;
     


    public Atencion(IdAtencion entityId, Agenda agenda) {
        super(entityId);
    }
}
