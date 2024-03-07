public class Patient extends Person {
    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Condition: " + condition);
    }
}
