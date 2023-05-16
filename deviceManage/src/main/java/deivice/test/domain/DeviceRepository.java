package deivice.test.domain;

import deivice.test.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "devices", path = "devices")
public interface DeviceRepository
    extends PagingAndSortingRepository<Device, Long> {}
