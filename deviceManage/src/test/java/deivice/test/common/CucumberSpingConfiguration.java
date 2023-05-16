package deivice.test.common;

import deivice.test.DeviceManageApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeviceManageApplication.class })
public class CucumberSpingConfiguration {}
