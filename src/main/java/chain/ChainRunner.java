package chain;

import chain.approvers.AbstractApprover;
import chain.approvers.CheifApprover;
import chain.approvers.FirstApprover;
import chain.approvers.SecondApprover;

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
