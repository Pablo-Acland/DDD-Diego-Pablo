package Veterinaria.Atencion.event;

import Veterinaria.Atencion.Value.IdAnimal;
import co.com.sofka.domain.generic.DomainEvent;

public class AtencionCreada extends DomainEvent {



    private final IdAnimal idAnimal;

    public AtencionCreada(IdAnimal idAnimal) {
        super("Veterinaria.Atencion.atencioncreada");
        this.idAnimal=idAnimal;
    }

    public IdAnimal getIdAnimal() {
        return idAnimal;
    }

}
