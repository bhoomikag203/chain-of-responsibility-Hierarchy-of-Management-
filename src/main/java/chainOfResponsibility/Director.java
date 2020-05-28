package chainOfResponsibility;

public class Director implements Employee {
    private int maxApprovalAmount;
    private Employee supervisor;

    public Director(int maxApprovalAmount, Employee supervisor) {
        this.maxApprovalAmount = maxApprovalAmount;
        this.supervisor = supervisor;
    }

    @Override
    public boolean approve(int amount) {
        if (amount <= this.maxApprovalAmount){
            System.out.println("\nDirector approved\n");
            return true;
        }

        else
            return this.supervisor.approve(amount);
    }

}