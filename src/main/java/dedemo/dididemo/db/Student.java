package dedemo.dididemo.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

}
