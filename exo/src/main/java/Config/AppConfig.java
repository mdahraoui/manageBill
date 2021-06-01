package Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ({"domains","hbm","repository","service","test"})
public class AppConfig {

}

