package hello.springmvc2.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String string = "Spring";

        System.out.println("string = " + string);

        log.trace(" trace log={}", string);
        log.debug(" debug log={}", string);
        log.info(" info log={}", string);
        log.warn(" warn log={}", string);
        log.error(" error log={}", string);

        return "ok";
    }
}
