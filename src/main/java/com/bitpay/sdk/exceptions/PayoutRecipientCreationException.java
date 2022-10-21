/*
 * Copyright (c) 2019 BitPay
 */

package com.bitpay.sdk.exceptions;

/**
 * <p>
 * Exception thrown for a POST when the Payout Recipient cannot be created.
 * </p>
 * <ul>
 *   <li>First two digits: HTTP method</li>
 *   <li>Second two digits: Resource</li>
 *   <li>Final two digits: Error</li>
 * </ul>
 * <p>
 * <p>HTTP method digits for this class: 01</p>
 * <p>Resource digits for the this class: 00</p>
 * <p>Error digits for this class:</p>
 * <ul>
 *     <li>00 - Generic server error</li>
 *     <li>01 - Resource not found</li>
 *     <li>02 - Invalid parameters</li>
 *     <li>03 - Missing parameters</li>
 * </ul>
 * </p>
 * <pre>
 * eg 010001
 * </pre>
 *
 * @link https://bitpay.com/api/#rest-api-error-codes
 */
public class PayoutRecipientCreationException extends PayoutRecipientException {
    /**
     * Construct the PayoutRecipientCreationException.
     *
     * @param status  String [optional] The Exception code to throw.
     * @param message String [optional] The Exception message to throw.
     */
    public PayoutRecipientCreationException(String status, String message) {
        super(status, BuildMessage(message));
    }

    private static String BuildMessage(String message) {
        String BitPayMessage = "Failed to submit payout recipient.";
        String BitPayCode = "BITPAY-PAYOUT-RECIPIENT-CREATE";

        message = BitPayCode + ": " + BitPayMessage + " -> " + message;

        return message;
    }
}
