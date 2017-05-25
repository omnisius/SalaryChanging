package decorator.approvers;

public class FirstApprover implements Approver {
    public void addFeedback() {
        System.out.println("First approver feedback: ");
    }
}
