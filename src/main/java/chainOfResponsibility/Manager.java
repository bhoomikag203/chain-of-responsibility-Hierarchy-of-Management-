package chainOfResponsibility;

public class Manager implements Employee {
    private int maxApprovalAmount;
    private Employee supervisor;

    public Manager(int maxApprovalAmount, Employee supervisor) {
        this.maxApprovalAmount = maxApprovalAmount;
        this.supervisor = supervisor;
    }

    @Override
    public boolean approve(int amount) {
        if (amount <= this.maxApprovalAmount) {
            System.out.println("\nManager approved\n");
            return true;

        } else
            return this.supervisor.approve(amount);

    }
}