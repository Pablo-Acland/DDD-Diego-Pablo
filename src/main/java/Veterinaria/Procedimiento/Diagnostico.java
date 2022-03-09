package Veterinaria.Procedimiento;

import Veterinaria.Generic.Descripcion;
import Veterinaria.Procedimiento.Value.IdDiagnostico;
import co.com.sofka.domain.generic.Entity;

public class Diagnostico extends Entity<IdDiagnostico> {
    protected Descripcion descripcion;

    public Diagnostico(IdDiagnostico entityId) {
        super(entityId);
    }
}
