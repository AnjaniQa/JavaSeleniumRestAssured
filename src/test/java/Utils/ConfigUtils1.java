package Utils;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.builder.fluent.PropertiesBuilderParameters;

public class ConfigUtils1 {

    private static String GLOBAL_PROPERTIES = System.getProperty("global.properties", "global.properties");
    private static PropertiesConfiguration config = null;
    private static PropertiesConfiguration propertiesConfiguration = null;

    static {
        config = createConfig(GLOBAL_PROPERTIES);
    }

    private static PropertiesConfiguration createConfig(String pathname) {
        try {
            FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<>(PropertiesConfiguration.class);
            PropertiesBuilderParameters propertiesBuilderParameters = new Parameters().properties();
            propertiesBuilderParameters.setFileName(pathname);
            propertiesBuilderParameters.setThrowExceptionOnMissing(false);
            builder.configure(propertiesBuilderParameters);
            return builder.getConfiguration();
            } catch (Exception e) {
            System.out.println(e);
        }
        return propertiesConfiguration;
    }


}
