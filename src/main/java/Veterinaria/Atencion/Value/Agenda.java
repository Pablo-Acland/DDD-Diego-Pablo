package Veterinaria.Atencion.Value;

import co.com.sofka.domain.generic.ValueObject;

<<<<<<< HEAD
import javax.xml.crypto.Data;
import java.util.Date;

public class Agenda implements ValueObject <Date>{
    @Override
    public Date value() {
=======
import java.time.LocalDateTime;



public class Agenda implements ValueObject <LocalDateTime>{
    @Override
    public LocalDateTime value() {
>>>>>>> 364a8d5c19889664aaeaddabe58953b9d1c6fcd1
        return null;
    }
}
