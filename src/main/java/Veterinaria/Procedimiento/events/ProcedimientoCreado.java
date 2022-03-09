package Veterinaria.Procedimiento.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class ProcedimientoCreado extends DomainEvent {

    public ProcedimientoCreado(String type) {
        super(type);
    }
}
