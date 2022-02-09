package constants;

public class FrameworkConstants {

    private FrameworkConstants() {
    }

    private static final String CONFIGFILEPATH = System.getProperty("user.dir") + "/src/test/java/resources/config/config.properties";

    public static String getConfigFilePath() {
        return CONFIGFILEPATH;
    }
}
