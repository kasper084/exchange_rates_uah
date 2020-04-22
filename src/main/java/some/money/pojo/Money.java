package some.money.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Money {
    private String ccy;
    @JsonProperty("base_ccy")
    private String baseCcy;
    private String buy;
    private String sale;
}
