package com.jd.emdcenter.domain.task;

/**
 * 邮件发送结果数量统计。
 *
 * @author anning
 * @date 2015/6/26
 * @since V1.0
 */
public class TaskSendResultCount
{
    /**
     * 统计项名称。
     * success: 发送成功项
     * error: 发送失败项（因发送出错）
     * blackList: 发送失败项（因黑名单）
     * notExist: 发送失败项（邮箱不存在）
     */
    private String itemName;

    /**
     * 根据统计项统计的数量。
     */
    private Integer count;

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }
}
