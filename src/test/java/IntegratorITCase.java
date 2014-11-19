import com.dreamoval.iwallet.connector.Integrator;
import com.i_walletlive.paylive.ArrayOfOrderItem;
import com.i_walletlive.paylive.OrderItem;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.UUID;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:TestApplicationContext.xml"})
public class IntegratorITCase {

    @Autowired
    Integrator iwalletIntegrator;

    public void testCancelTransaction()  {

    }

    public void testMobilePaymentOrder() {

    }

    @Test
    public void testProcessPaymentOrder() throws Exception {

        OrderItem testItem = new OrderItem();
        testItem.setItemCode("hardcoded1234");
        testItem.setItemName("Test Item");
        testItem.setQuantity(1);
        testItem.setUnitPrice(BigDecimal.valueOf(10));
        //One liner multiplication between quantity (converted from int to Bigdecimal) and unit price using Bigdecimal.multiply() method
        testItem.setSubTotal(testItem.getUnitPrice().multiply(BigDecimal.valueOf(testItem.getQuantity())));

        //Adding testOrder to the ArrayOfOrderItem which in turn returns a list for new Items to be added to
        ArrayOfOrderItem allOrders = new ArrayOfOrderItem();
        allOrders.getOrderItem().add(testItem);

        String orderId = UUID.randomUUID().toString();
       String response = iwalletIntegrator.processPaymentOrder(orderId,testItem.getSubTotal(),null,null,testItem.getSubTotal(),"","",allOrders);

        Assert.assertNotNull(response);
        try {
            UUID.fromString(response);
            Assert.assertTrue("Response is a valid token", true);
        } catch (Exception ex) {
            Assert.assertTrue("Response is a valid token", false);
        }





    }

    public void testProcessPaymentJSON() throws Exception {

    }

    public void testConfirmTransaction() throws Exception {

    }

    public void testVerifyMobilePayment() throws Exception {

    }

    public void testCancelTransaction1() throws Exception {

    }

    public void testCheckPaymentStatus() throws Exception {

    }
}