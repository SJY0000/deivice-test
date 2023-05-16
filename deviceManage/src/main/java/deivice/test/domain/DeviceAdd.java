package deivice.test.domain;

import deivice.test.domain.*;
import deivice.test.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeviceAdd extends AbstractEvent {

    private Long id;

    public DeviceAdd(Device aggregate) {
        super(aggregate);
    }

    public DeviceAdd() {
        super();
    }
}
