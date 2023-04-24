package org.dong.order.domain.order.event;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DomainEvent {
    /**
     * 领域事件ID
     */
    private String id ;
    /**
     * 事件发送的时间戳
     */
    LocalDateTime timestamp ;
    /**
     * 事件源
     */
    String source ;
    /**
     * 事件相关业务数据
     */
    String data ;
}
