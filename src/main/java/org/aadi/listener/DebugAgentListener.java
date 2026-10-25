package org.aadi.listener;

import dev.langchain4j.agentic.observability.AgentListener;
import dev.langchain4j.agentic.observability.AgentRequest;
import dev.langchain4j.agentic.observability.AgentResponse;
import dev.langchain4j.agentic.scope.AgenticScope;

public class DebugAgentListener implements AgentListener {

    @Override
    public void afterAgenticScopeCreated(AgenticScope scope) {
        System.out.println("=== SCOPE CREATED ===");
        System.out.println(scope);
    }

    @Override
    public void beforeAgentInvocation(AgentRequest request) {
        System.out.println("\n=== AGENT START ===");
        System.out.println(request);
    }

    @Override
    public void afterAgentInvocation(AgentResponse response) {
        System.out.println("\n=== AGENT END ===");
        System.out.println(response);
        System.out.println("Scope: " + response.agenticScope());
    }

    @Override
    public void beforeAgenticScopeDestroyed(AgenticScope scope) {
        System.out.println("\n=== FINAL AGENTIC SCOPE ===");
        System.out.println(scope);
    }

    @Override
    public boolean inheritedBySubagents() {
        return true;
    }
}