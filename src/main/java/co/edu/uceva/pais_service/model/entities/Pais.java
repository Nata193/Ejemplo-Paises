package co.edu.uceva.pais_service.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pais")

public class Pais {
    @Id //para agregar una llave primaria
    //estrategia de generacion es para crear como sera la llave sea por numeros o frases
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //llave primaria
    private String nombre;
}
