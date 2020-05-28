import chainOfResponsibility.CEO;
import chainOfResponsibility.Director;
import chainOfResponsibility.Manager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApproveAmountTest {
    private Manager manager;
    private Director director;
    private CEO ceo;

    @BeforeMethod
    public void setup() {
        this.ceo = new CEO(10000000);
        this.director = new Director(5000000, this.ceo);
        this.manager = new Manager(1000000, this.ceo);
    }

    @Test
    public void shouldApproveMaxAllowableAmount() {
        Assert.assertEquals(true, this.manager.approve(50000));
    }

    @Test
    public void shouldApproveBeyondAllowableAmount() {
        Assert.assertEquals(true, this.manager.approve(4000000));
        Assert.assertEquals(true, this.manager.approve(10000000));
    }
}