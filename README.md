iwallet-java-connector
======================
iWallet is an online payment service platform for merchants and individuals to securely make and receive payments. iWallet
works like a aggregator which has integration with various channel of payments including some mobile money channels.


Introduction
------------
This is jar purpose is to reduce the boilerplate when it comes to integrate a custom built application based on any JVM family language.
The class library exposes via a single class all the useful consumable web methods according to iWallet wdsl contract. All


Overview
--------

Currently the this class library exposes one class with the following methods:

 * mobilePaymentOrder : *Method to make payment with extra features like QR code relevant for iwallet cruize app to complete payment*
 * processPaymentOrder : *Method to make payment to iWallet*
 * confirmTransaction : *Method to confirm the payment process after all operations have succeeded on both sides*
 * verifyMobilePayment: *Method meant for mobile payment to call iWallet in order to check on the status of a transaction*
 * cancelTransaction : *Method to cancel payment if your side of operation did not succeed. This initiates a refund proceed if iwallet was the payment channel*
 * checkPaymentStatus : *Method to check status of payment made with third party payment channel line MTN etc.*
 * cancelAndConfirmTransactionResponseParser : *Helper method for parsing returned error code during cancel of confirm transaction call.*
 * getPaymentService : *Helper method for getting properly configured payment service Object with required header as per specification*
 * getHeaderList : *Helper method for building list of PaymentHeader required by iWallet wdsl specification*
