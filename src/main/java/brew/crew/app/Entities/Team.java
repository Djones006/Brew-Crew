package brew.crew.app.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Table(name = "team")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int teamId;

    @Column
    private String teamName;

    @Column
    private Date createDate;

}
