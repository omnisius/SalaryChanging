package decorator;

import decorator.approvers.AbstractApprover;
import decorator.approvers.CheifApprover;
import decorator.approvers.FirstApprover;
import decorator.approvers.SecondApprover;

public class ChainRunner {

    private static AbstractApprover getChainOfApprovers() {
        AbstractApprover firstApprover = new FirstApprover();
        AbstractApprover secondApprover = new SecondApprover();
        AbstractApprover cheifApprover = new CheifApprover();

        firstApprover.setNextApprover(secondApprover);
        secondApprover.setNextApprover(cheifApprover);

        return firstApprover;
    }

    public static void main(String[] args) {
        AbstractApprover approverChain = getChainOfApprovers();

        approverChain.approveMessage("Confirm");
    }
}
