package Veterinaria.Atencion;

import Veterinaria.Atencion.Value.IdAnimal;
import co.com.sofka.domain.generic.AggregateEvent;

public class Animal extends AggregateEvent <IdAnimal>{
    public Animal(IdAnimal entityId) {
        super(entityId);
    }
}
