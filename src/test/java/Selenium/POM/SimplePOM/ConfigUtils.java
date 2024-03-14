package Selenium.POM.SimplePOM;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.builder.fluent.PropertiesBuilderParameters;

public class ConfigUtils {

    private static String GLOBAL_PROPERTIES = System.getProperty("global.properties", "src/test/java/Selenium/POM/SimplePOM/global.properties");

    private static PropertiesConfiguration globalConfig = null;

    static {
        globalConfig = createConfig(GLOBAL_PROPERTIES);
    }

    private static PropertiesConfiguration createConfig(String path) {
        try {
            FileBasedConfigurationBuilder<PropertiesConfiguration> builder =
                    new FileBasedConfigurationBuilder<>(PropertiesConfiguration.class);
            PropertiesBuilderParameters propertiesBuilderParameters = new Parameters().properties();
            propertiesBuilderParameters.setFileName(path);
            builder.configure(propertiesBuilderParameters);
            PropertiesConfiguration propertiesConfiguration = builder.getConfiguration();
            return propertiesConfiguration;
        } catch(Exception e) {
            System.out.println(e);
        }
        return new PropertiesConfiguration();
    }

    public static String getValue(String property) {
        return globalConfig.getString(property);
    }
}
