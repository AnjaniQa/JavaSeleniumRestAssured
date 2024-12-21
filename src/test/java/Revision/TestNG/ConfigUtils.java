package Revision.TestNG;

import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.builder.fluent.PropertiesBuilderParameters;

public class ConfigUtils {

    private static String GLOBAL_PROPERTIES = System.getProperty("global.properties", "global.properties");
    private static PropertiesConfiguration config = null;
    private static PropertiesConfiguration propertiesConfiguration = null;

    static {
        config = createConfig(GLOBAL_PROPERTIES);
    }

    private static PropertiesConfiguration createConfig(String path) {
        try {
        FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<>(PropertiesConfiguration.class);
        PropertiesBuilderParameters propertiesBuilderParameters = new Parameters().properties();
        propertiesBuilderParameters.setFileName(path);
        propertiesBuilderParameters.setThrowExceptionOnMissing(false);
        builder.configure(propertiesBuilderParameters);
        return builder.getConfiguration();

        } catch(Exception e) {
            System.out.println(e);
        }
        return propertiesConfiguration;
    }

    public static String getValue(String property) {
        return config.getString(property);
    }
}
