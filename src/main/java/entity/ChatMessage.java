package entity;

import enumeration.MessageType;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChatMesage {

        private MessageType type;

        private String user;

        private String content;

        private Date date = new Date();

    }
}
