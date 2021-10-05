import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DBUser") //WATCH out  USER is a reserved name!
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String first_name;
}

