package com.jd.leo.domain.enums;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-1-16
 * Time: 下午2:28
 */
public enum TaskChannelEnum {

    Email(0, "email", "邮件",QuotaDurationEnum.Month),
    Sms(1, "sms", "短信",QuotaDurationEnum.Year),
    Push(2, "push", "消息",QuotaDurationEnum.Month);

    private Integer index;
    private String channel;
    private String description;
    private QuotaDurationEnum durationEnum;

    public static String channelType="channelType";

    private TaskChannelEnum(Integer index, String channel, String description,QuotaDurationEnum durationEnum) {
        this.index = index;
        this.channel = channel;
        this.description = description;
        this.durationEnum=durationEnum;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getDescription(String channel) {
        for (TaskChannelEnum channelEnum : TaskChannelEnum.values()) {
            if (channelEnum.channel.equals(channel)) {
                return channelEnum.description;
            }
        }
        return null;
    }

    public QuotaDurationEnum getDurationEnum() {
        return durationEnum;
    }

    public void setDurationEnum(QuotaDurationEnum durationEnum) {
        this.durationEnum = durationEnum;
    }
}
