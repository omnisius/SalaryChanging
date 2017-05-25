package chain.approvers;

public class SecondApprover extends AbstractApprover {
    protected void write(String message) {
        System.out.println("Second approver feedback: " + message);
    }
}
