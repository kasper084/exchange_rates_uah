package some.money.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import some.money.pojo.Money;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@Service
public class Parser {

    private static final String PB_API = "https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11";
    private ObjectMapper mapper = new ObjectMapper();
    private RestTemplate restTemplate = new RestTemplate();

    private String getJsonArray(String uri) {
        return restTemplate.getForObject(uri, String.class);
    }

    public List<Money> getRates() throws IOException {
        return Arrays.asList(mapper.readValue(getJsonArray(PB_API), Money[].class));
    }
}
