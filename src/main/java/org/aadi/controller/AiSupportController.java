package org.aadi.controller;

import org.aadi.agents.WorkflowSupportAgent;
import org.aadi.service.MyAIAgent;
import org.aadi.service.OrderSupportAIAgent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai-support")
public class AiSupportController {

    private MyAIAgent agent;

    private OrderSupportAIAgent orderSupportAIAgent;

    private WorkflowSupportAgent workflowSupportAgent;


    public AiSupportController(
            MyAIAgent agent,
            OrderSupportAIAgent orderSupportAIAgent,
            WorkflowSupportAgent workflowSupportAgent) {
        this.agent = agent;
        this.orderSupportAIAgent = orderSupportAIAgent;
        this.workflowSupportAgent = workflowSupportAgent;
    }

    @GetMapping
    public String chat(
            @RequestParam String message) {
        return agent.chat(message);
    }

    @GetMapping("/order")
    public String orderSupport(
            @RequestParam String message) {
        return orderSupportAIAgent.chat(message);
    }

    @GetMapping("/workflow")
    public String workflowSupport(
            @RequestParam String request) {
        return workflowSupportAgent.handle(request);
    }

}
