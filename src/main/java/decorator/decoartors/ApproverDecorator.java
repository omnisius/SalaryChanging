package decorator.decoartors;

import decorator.approvers.Approver;

abstract class ApproverDecorator implements Approver{
    private Approver decoratedApprover;

    ApproverDecorator(Approver decoratedApprover) {
        this.decoratedApprover = decoratedApprover;
    }

    public void addFeedback() {
        decoratedApprover.addFeedback();
    }
}
