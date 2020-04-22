package some.money.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import some.money.pojo.Money;
import some.money.util.Parser;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Parser parser;

    @RequestMapping("/money")
    public List<Money> getRates() throws IOException {
        return parser.getRates();
    }
}
