package cn.knightzz.design.watcher.chapter02.event;

import cn.knightzz.design.watcher.chapter02.entity.LotteryResult;
import cn.knightzz.design.watcher.chapter02.event.annotation.EventType;
import cn.knightzz.design.watcher.chapter02.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 王天赐
 * @title: EventManager
 * @description:
 * @create: 2023-10-11 21:54
 */
public class EventManager {

    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅通知
     *
     * @param eventType 事件类型
     * @param listener 监听器
     */
    public void subscribe(Enum<EventType> eventType, EventListener
            listener) {
        List<EventListener> listenerList = listeners.get(eventType);
        listenerList.add(listener);
    }

    public void unsubscribe(Enum<EventType> eventType, EventListener
            listener) {
        List<EventListener> listenerList = listeners.get(eventType);
        listenerList.remove(listener);
    }

    /**
     * 通知
     * @param eventType 事件类型
     * @param result 结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> listenerList = listeners.get(eventType);
        for (EventListener listener : listenerList) {
            listener.doEvent(result);
        }
    }
}
