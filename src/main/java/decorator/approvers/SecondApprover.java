package decorator.approvers;

public class SecondApprover implements Approver {
    public void addFeedback() {
        System.out.println("Second approver feedback: " );
    }
}
