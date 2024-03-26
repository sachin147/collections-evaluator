import java.util.List;

public class RuleExpression {
    private String operator;
    List<RuleConditions> conditions;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<RuleConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<RuleConditions> conditions) {
        this.conditions = conditions;
    }
}
