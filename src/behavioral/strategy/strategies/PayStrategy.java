package behavioral.strategy.strategies;

/**
 * Common interface for all strategies.
 */

// 2. strategy interface
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}