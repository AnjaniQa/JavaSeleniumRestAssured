package Utils;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.builder.fluent.PropertiesBuilderParameters;

public class ConfigUtils {

    private static String GLOBAL_PROPERTIES = System.getProperty("global.properties", "global.properties");

    private static PropertiesConfiguration globalConfig = null;

    static {
        globalConfig = createConfig(GLOBAL_PROPERTIES);
    }

    private static PropertiesConfiguration createConfig(String pathName) {
        try {
            FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<PropertiesConfiguration>(
                    PropertiesConfiguration.class);
            PropertiesBuilderParameters propertiesBuilderParameters = new Parameters().properties();
            propertiesBuilderParameters.setFileName(pathName);
            propertiesBuilderParameters.setThrowExceptionOnMissing(false);
            builder.configure(propertiesBuilderParameters);
            PropertiesConfiguration propertiesConfiguration = builder.getConfiguration();
            return propertiesConfiguration;
        } catch(Exception e) {
            System.err.println("Unable to read properties file : " + pathName + " : " + e);
        }
        return new PropertiesConfiguration();
    }

    public static String getValue(String propertyName, String defaultValue) {
        String value = globalConfig.getString(propertyName);
        return value;
    }

    private static PropertiesConfiguration createConfig1(String pathName) {
        try {
            FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new
                    FileBasedConfigurationBuilder<>(PropertiesConfiguration.class);
            PropertiesBuilderParameters propertiesBuilderParameters = new Parameters().properties();
            propertiesBuilderParameters.setFileName(pathName);
            propertiesBuilderParameters.setThrowExceptionOnMissing(false);
            builder.configure(propertiesBuilderParameters);
            PropertiesConfiguration propertiesConfiguration = builder.getConfiguration();
            return  propertiesConfiguration;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new PropertiesConfiguration();
    }
}
