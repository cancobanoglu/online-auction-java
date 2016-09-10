package com.example.auction.bidding.api;

/**
 * The status of the result of placing a bid.
 */
public enum BidResultStatus {
    /**
     * The bid was accepted, and is the current highest bid.
     */
    ACCEPTED,
    /**
     * The bid was accepted, but was outbidded by the maximum bid of the current highest bidder.
     */
    ACCEPTED_OUTBID,
    /**
     * The bid was accepted, but was not at least the auction increment above the maximum bid.
     */
    ACCEPTED_BELOW_INCREMENT,
    /**
     * The bid was accepted, but is below the reserve.
     */
    ACCEPTED_BELOW_RESERVE,
    /**
     * The bid was not at least the current bid plus the increment.
     */
    TOO_LOW,
    /**
     * The auction hasn't started.
     */
    NOT_STARTED,
    /**
     * The auction has already finished.
     */
    FINISHED,
    /**
     * The auction has been cancelled.
     */
    CANCELLED
}