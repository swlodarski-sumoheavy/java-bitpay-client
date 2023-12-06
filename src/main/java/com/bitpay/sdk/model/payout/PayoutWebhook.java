/*
 * Copyright (c) 2019 BitPay.
 * All rights reserved.
 */

package com.bitpay.sdk.model.payout;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Hashtable;
import java.util.List;

/**
 * The type Payout webhook.
 *
 * @see <a href="https://developer.bitpay.com/reference/payouts-1">Payout Webhook</a>
 */
class PayoutWebhook {

    protected String id;
    protected String recipientId;
    protected String shopperId;
    protected Double price;
    protected String currency;
    protected String ledgerCurrency;
    protected Hashtable<String, Hashtable<String, BigDecimal>> exchangeRates;
    protected String email;
    protected String reference;
    protected String label;
    protected String notificationURL;
    protected String notificationEmail;
    protected ZonedDateTime effectiveDate;
    protected ZonedDateTime requestDate;
    protected String status;
    protected List<PayoutTransaction> transactions;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecipientId() {
        return this.recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getShopperId() {
        return this.shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLedgerCurrency() {
        return this.ledgerCurrency;
    }

    public void setLedgerCurrency(String ledgerCurrency) {
        this.ledgerCurrency = ledgerCurrency;
    }

    public Hashtable<String, Hashtable<String, BigDecimal>> getExchangeRates() {
        return this.exchangeRates;
    }

    public void setExchangeRates(
        Hashtable<String, Hashtable<String, BigDecimal>> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getNotificationURL() {
        return this.notificationURL;
    }

    public void setNotificationURL(String notificationURL) {
        this.notificationURL = notificationURL;
    }

    public String getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public ZonedDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(ZonedDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ZonedDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(ZonedDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PayoutTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<PayoutTransaction> transactions) {
        this.transactions = transactions;
    }
}
