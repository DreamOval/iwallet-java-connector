import com.dreamoval.iwallet.connector.Integrator;
import com.i_walletlive.paylive.ArrayOfOrderItem;
import com.i_walletlive.paylive.OrderItem;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;
import java.util.UUID;



public class IntegratorITCase {

     static Integrator iwalletIntegrator;
    static Properties props = new Properties();

    @BeforeClass
    public static void testSetup(){

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("local.properties");
        try {
            props.load(inputStream);
            iwalletIntegrator = new Integrator(props.getProperty("api.iwallet.merchantKey"),props.getProperty("api.iwallet.merchantEmail"),Boolean.valueOf(props.getProperty("api.iwallet.integrationMode")),props.getProperty("api.iwallet.serviceType"),props.getProperty("api.iwallet.version"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
            Assert.assertTrue("Response is not a valid token", false);
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