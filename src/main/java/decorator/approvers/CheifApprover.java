package decorator.approvers;

public class CheifApprover extends AbstractApprover {
    protected void write(String message) {
        System.out.println("Cheif approver feedback: " + message);
    }
}
