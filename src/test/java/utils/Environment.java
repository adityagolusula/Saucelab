package utils;

import java.io.IOException;

public class Environment {

    String environment = System.getProperty("environment");
    String runEnvironment;


    public String specifiedEnvironment() throws IOException {
        if(!(environment == null))
        {
            switch (environment)
            {
                case "prodUrl" :
                    runEnvironment = new Configuration().getPropertiesParameter("prodUrl");
                    break;
                case "testUrl":
                    runEnvironment = new Configuration().getPropertiesParameter("testUrl");
                    break;
                case "stagingUrl":
                    runEnvironment = new Configuration().getPropertiesParameter("stagingUrl");
                    break;
            }
        }

        return runEnvironment;
    }
}