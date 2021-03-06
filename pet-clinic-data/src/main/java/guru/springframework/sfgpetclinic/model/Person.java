package guru.springframework.sfgpetclinic.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "fist_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
