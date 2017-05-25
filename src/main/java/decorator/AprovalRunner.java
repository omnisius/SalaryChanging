package decorator;

import decorator.approvers.Approver;
import decorator.approvers.CheifApprover;
import decorator.approvers.FirstApprover;
import decorator.approvers.SecondApprover;
import decorator.decoartors.GoodApproverDecorator;

public class AprovalRunner {

    public static void main(String[] args) {
        Approver firstApprover = new FirstApprover();
        Approver secondApprover = new SecondApprover();
        Approver cheifApprover = new CheifApprover();

        Approver goodFirstApprover = new GoodApproverDecorator(firstApprover);
        goodFirstApprover.addFeedback();

        Approver goodSecondApprover = new GoodApproverDecorator(secondApprover);
        goodSecondApprover.addFeedback();

        Approver goodCheifApprover = new GoodApproverDecorator(cheifApprover);
        goodCheifApprover.addFeedback();
    }
}
