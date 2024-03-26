import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class Application {

    public static void main(String ...args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream resourceAsStream = Application.class.getClassLoader()
                .getResourceAsStream("sample.json");
        RuleExpression ruleExpression = objectMapper.readValue(resourceAsStream, RuleExpression.class);
        System.out.println(ruleExpression);
    }
}
