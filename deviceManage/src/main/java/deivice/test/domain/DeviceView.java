package deivice.test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeviceView_table")
@Data
public class DeviceView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
