package org.aadi.tool;

import org.aadi.service.RefundService;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class RefundTool {

    private RefundService refundService;

    public RefundTool(RefundService refundService) {
        this.refundService = refundService;
    }

    @Tool("Check whether an order is eligible for a refund based on order status")
    public String checkRefundEligibility(String orderStatus) {
        System.out.println("\n>>> REFUND TOOL CALLED -> " + orderStatus);
        return refundService.checkEligibility(orderStatus).toString();
    }
}
