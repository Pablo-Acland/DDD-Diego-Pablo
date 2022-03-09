package Veterinaria.Atencion;

import Veterinaria.Atencion.Value.Dueño;
import Veterinaria.Atencion.Value.IdAnimal;
import co.com.sofka.domain.generic.Entity;

public class Animal extends Entity<IdAnimal> {


    private final String nombre;
    private final Dueño dueño;
    public Animal(IdAnimal entityId, String nombre, Dueño dueño) {
        super(entityId);
        this.nombre = nombre;
        this.dueño = dueño;

    }

    public Animal getAnimal(IdAnimal ID){
        Animal animal= new Animal(ID, this.nombre, this.dueño );

        return animal;
    }
    public String Nombre() {
        return nombre;
    }

    public Dueño dueño() {
        return dueño;
    }
}
