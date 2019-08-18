package hr.ivlahek.showcase.zerocode.uat;

import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("my_load_config.properties")
public class UatTest {

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void should_get_google_com() {
        ResponseEntity<String> responseDtoResponse = restTemplate.getForEntity("http://www.google.com", String.class);

        assertThat(responseDtoResponse.getStatusCode().value()).isEqualTo(200);
    }
}
