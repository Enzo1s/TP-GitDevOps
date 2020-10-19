package Entities;

import lombok.Data;

import java.util.Date;

@Data
    public class Alumno {

        private String nombre;
        private String apellido;
        private String email;
        private Date createAI;
}
