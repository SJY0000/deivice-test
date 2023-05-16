package deivice.test.domain;

import deivice.test.domain.*;
import deivice.test.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeviceAdd extends AbstractEvent {

    private Long id;
    private String 설비코드;
    private String 설비명;
    private String 설비규격;
    private String 모델명;

    public DeviceAdd(Device aggregate) {
        super(aggregate);
    }

    public DeviceAdd() {
        super();
    }
}
