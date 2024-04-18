package aldrin.displaynamegenerators;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class CamelCaseGenerator extends DisplayNameGenerator.Simple {

    @Override
    public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
        return formatCamelCaseName(method.getName());
    }

    private String formatCamelCaseName(String camelCaseString) {
        return StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(camelCaseString), " ");
    }

}


