package deivice.test.domain;

import deivice.test.DeviceManageApplication;
import deivice.test.domain.DeviceAdd;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Device_table")
@Data
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String 설비코드;

    private String 설비명;

    private String 설비규격;

    private String 모델명;

    @PostPersist
    public void onPostPersist() {
        DeviceAdd deviceAdd = new DeviceAdd(this);
        deviceAdd.publishAfterCommit();
    }

    public static DeviceRepository repository() {
        DeviceRepository deviceRepository = DeviceManageApplication.applicationContext.getBean(
            DeviceRepository.class
        );
        return deviceRepository;
    }
}
