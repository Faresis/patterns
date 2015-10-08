package ua.dp.mign.log;

import org.springframework.stereotype.*;

@Component
public class CustomizedLogManager extends LogManager {

    /*
     * This implementation of LogManager
     * allows a configuration file to define
     * which logger type will be instantiated.
     * By having factory method we need only
     * to override logger creation logic and
     * all business logic can be reused through
     * the base class.
     * If any new requirements specifying logger
     * creation logic will be created a new class
     * overriding this method can be created while
     * all processing logic will leave the same.
     */
    @Override
    protected Logger createLogger() {
        String loggerType = readLoggerTypeFromConfig();
        switch(loggerType) {
            case "EnterpriseLogger":
                return new EnterpriseLogger();
            case "ProductionLogger":
                return new ProductionLogger();
            default:
                return new DefaultLogger();
        }
    }

    private String readLoggerTypeFromConfig() {
        return "Any";
    }
}
