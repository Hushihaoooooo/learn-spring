package se.zust.edu.cn.bean;

/**
 * @author ShiHaoHu
 * @since 2024/3/20 10:22
 * @description
 */
public class Message {
    private int  id;
    private String topic;
    private String content;
    private User from;
    private User to;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", content='" + content + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
