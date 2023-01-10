package tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
public class Day15_Log4J2 {
    //    Create object
    private static Logger logger = LogManager.getLogger(Day15_Log4J2.class.getName());
    @Test
    public void log4jTest(){
//        Use logger object to log/print information
        logger.fatal("Fatal Log !!!!");// PRINTS BY DEFAULT
        logger.error("Error Log !!!!");//PRINTS BY DEFAULT
        logger.warn("Warning Log !!!!");
        logger.debug("Debug Log !!!!");
        logger.info("Info Log !!!!");
    }
}


/*
1. Add the following 2 dependencies and refresh your project:
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.19.0</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.19.0</version>
</dependency>
2. Create a class : Day_Log4j
3. Create Logger object:
  private static Logger logger = LogManager.getLogger(Demo1.class.getName());
4. User logger object to add info
                 logger.debug("This is debug logger");
        logger.info("This is info logger");
        logger.error("This is error logger");
        logger.fatal("This is fatal logger");
5. Check the console for logs. By default logger logs error or fatal
 */


/*
2. Create a directory in project level  : resources
3. Create a log file under resources : log4j2.xml
4. right click at resources and mark as directory as-->resources root

5. paste this
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="error">   //----> you can change printig level at this line
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
 */