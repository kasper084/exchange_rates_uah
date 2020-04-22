package some.money.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Money {
    private String ccy;
    private String baseCcy;
    private String buy;
    private String sale;
}
