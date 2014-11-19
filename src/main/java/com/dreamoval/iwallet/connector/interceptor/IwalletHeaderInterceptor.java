package com.dreamoval.iwallet.connector.interceptor;

import java.util.LinkedList;
import java.util.List;

import com.i_walletlive.paylive.PaymentHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.SoapPreProtocolOutInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;


import org.springframework.beans.factory.annotation.Value;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;


public class IwalletHeaderInterceptor extends SoapPreProtocolOutInterceptor{

    @Value("${api.iwallet.namespace}")
    String namespace;

    @Value("${api.iwallet.merchantEmail}")
    String merchantEmail;

    @Value("${api.iwallet.merchantKey}")
    String merchantKey;

    @Value("${api.iwallet.serviceType}")
    String serviceType;

    @Value("${api.iwallet.integrationMode}")
    int integrationMode;

    @Value("${api.iwallet.version}")
    String iwalletAPIVersion;

	public IwalletHeaderInterceptor() {

		// TODO Auto-generated constructor stub
	}

	public void handleMessage(SoapMessage message) throws Fault {
//		Map<String, List<PaymentHeader>> iwHeaders = new HashMap<String, List<PaymentHeader>>();
		List<PaymentHeader> iwalletHeaderList = new LinkedList<PaymentHeader>();
		PaymentHeader paymentHeader = new PaymentHeader();
		paymentHeader.setAPIVersion(iwalletAPIVersion);
		paymentHeader.setMerchantEmail(merchantEmail);
		paymentHeader.setMerchantKey(merchantKey);
		paymentHeader.setSvcType(serviceType);
		paymentHeader.setUseIntMode(true);

        try {
            List<Header> soapHeaders = message.getHeaders();
            Header newiwalletHeader = new Header(new QName(namespace,"PaymentHeader"),paymentHeader,new JAXBDataBinding(PaymentHeader.class));
            soapHeaders.add(newiwalletHeader);
            message.put(Header.HEADER_LIST,soapHeaders);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }






	}

}
