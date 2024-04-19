package home.dev.config.service.server.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    @UtilityClass
    public static final class Mongo {

        @UtilityClass
        public static final class Document {

            public static final String CONFIGS = "configs";
            public static final String PROPERTIES = "properties";
        }
    }
}
