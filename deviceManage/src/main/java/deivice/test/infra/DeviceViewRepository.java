package deivice.test.infra;

import deivice.test.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "deviceViews",
    path = "deviceViews"
)
public interface DeviceViewRepository
    extends PagingAndSortingRepository<DeviceView, Long> {}
