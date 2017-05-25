package decorator.decoartors;

import decorator.approvers.Approver;

public class GoodApproverDecorator extends ApproverDecorator {
    public GoodApproverDecorator(Approver decoratedApprover) {
        super(decoratedApprover);
    }

    @Override
    public void addFeedback() {
        super.addFeedback();
        System.out.println("Confirm");
    }
}
