package com.example.test.addinn.Models;
import lombok.*;

import javax.persistence.*;
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id_user;

    @NonNull
    private String Nom;
    @NonNull
    private String Prenom;
    @NonNull
    private String Email;
    @NonNull
    private String Password;
}
