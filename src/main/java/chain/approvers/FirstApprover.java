package chain.approvers;

public class FirstApprover extends AbstractApprover {
    protected void write(String message) {
        System.out.println("First approver feedback: " + message);
    }
}
