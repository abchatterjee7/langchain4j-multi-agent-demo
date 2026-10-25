package org.aadi.tool;

import org.aadi.model.OrderEntity;
import org.aadi.service.OrderService;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Service;

@Service
public class OrderTools {

    private OrderService orderService;;

    public OrderTools(OrderService orderService) {
        this.orderService = orderService;
    }

    @Tool("Get the current status and delivery information for an order")
    public OrderEntity getOrderStatus(Long orderId) {
        System.out.println("TOOL CALLED -> getOrderStatus(" + orderId + ")");
        return orderService.getOrderStatus(orderId);
    }

    @Tool("Cancel an order")
    public OrderEntity cancelOrder(Long orderId) {
        System.out.println("TOOL CALLED -> cancelOrder(" + orderId + ")");
        return orderService.cancelOrder(orderId);
    }


}
