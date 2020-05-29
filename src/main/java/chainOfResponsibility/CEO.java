package chainOfResponsibility;

public class CEO implements Employee {
    private int maxApprovalAmount;

    public CEO(int maxApprovalAmount) {
        this.maxApprovalAmount = maxApprovalAmount;
    }

    @Override
    public boolean approve(int amount) {
        if (amount <= this.maxApprovalAmount) {
            System.out.println("\nCEO approved\n");
        } else {
            System.out.println("Can't process more than " + this.maxApprovalAmount + "beyond!!\n");
        }
        return true;
    }

}