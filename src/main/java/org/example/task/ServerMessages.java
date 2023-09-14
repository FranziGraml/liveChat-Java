package org.example.task;

import org.example.entity.ChatMessage;
import org.example.enumeration.MessageType;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ServerMessages {

    private final SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void scheduleFixedDelayTask() {
        ChatMessage chatMessage = new ChatMessage(MessageType.MESSAGE, "Server", "Scheduled Nachricht", null);
        this.template.convertAndSend("/topic/chat", chatMessage);
    }

}