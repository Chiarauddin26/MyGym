package it.corso.mygym.model;

import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user" )
@Getter
@Setter
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    @NotNull
    private Boolean medicalCertificate;
    private Boolean activated;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;

}
