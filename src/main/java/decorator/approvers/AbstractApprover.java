package decorator.approvers;

public abstract class AbstractApprover {

    protected AbstractApprover nextApprover;

    public void setNextApprover(AbstractApprover nextApprover){
        this.nextApprover = nextApprover;
    }

    public void approveMessage(String message){
        write(message);

        if (nextApprover != null){
            nextApprover.approveMessage( message);
        }
    }

    abstract protected void write(String message);
}
