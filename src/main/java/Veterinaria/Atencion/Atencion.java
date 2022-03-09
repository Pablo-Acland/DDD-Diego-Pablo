package Veterinaria.Atencion;

import Veterinaria.Atencion.Value.Agenda;
import Veterinaria.Atencion.Value.Dueño;
import Veterinaria.Atencion.Value.IdAnimal;
import Veterinaria.Atencion.Value.IdAtencion;
import Veterinaria.Atencion.event.AtencionCreada;
import co.com.sofka.domain.generic.AggregateEvent;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class Atencion extends AggregateEvent<IdAtencion> {
     protected Agenda agenda;
     protected IdAnimal idAnimal;
     protected String tipo;
     protected String observacion;




    public Atencion(IdAtencion entityId, Agenda agenda, IdAnimal idAnimal, String tipo, String observacion) {
        super(entityId);
        appendChange(new AtencionCreada(idAnimal)).apply();
    }

    public void agregarAnimal(IdAnimal entityId, String nombre, Dueño dueño){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(dueño);
        Objects.requireNonNull(nombre);
        appendChange(new AnimalAgregado(entityId, nombre, dueño)).apply();
    }
    public void generarObservacion(String observacion){
        appendChange(new ObsrvacionGenerada(observacion)).apply();
    }
    public void agendar(LocalDateTime horayfecha){
        appendChange(new Agendado(horayfecha)).apply();

    }
    public void seleccionarTipo(String tipo){
    appendChange(new  TipoSeleccionado(tipo)).apply();
    }
    public Animal getAnimalId(IdAnimal entityId){
        Animal animal = null;
        animal.getAnimal(entityId);
        return animal;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public IdAnimal getIdAnimal() {
        return idAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getObservacion() {
        return observacion;
    }
}
