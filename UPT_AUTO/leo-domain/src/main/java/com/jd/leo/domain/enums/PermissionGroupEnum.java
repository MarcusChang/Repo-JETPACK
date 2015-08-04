package com.jd.leo.domain.enums;

import java.util.ArrayList;
import java.util.List;



/**
 * Created with IntelliJ IDEA. User: hesonglin Date: 15-1-16 Time: 下午2:28
 */
public enum PermissionGroupEnum {

	EDM_NOR(1, "EDM基础权限包", TaskChannelEnum.Email), 
	EDM_DEP(2, "EDM管理包", TaskChannelEnum.Email), 
	EDM_CHANNEL(3, "EDM超级权限包", TaskChannelEnum.Email),

	PUSH_NOR(4, "PUSH基础权限包", TaskChannelEnum.Push), 
	PUSH_DEP(5, "PUSH管理权限包", TaskChannelEnum.Push), 
	PUSH_CHANNEL(6, "PUSH超级权限包", TaskChannelEnum.Push),

	SMS_NOR(7, "短信基础权限包", TaskChannelEnum.Sms), 
	SMS_DEP(8, "短信管理权限包", TaskChannelEnum.Sms), 
	SMS_CHANNEL(9, "短信超级权限包", TaskChannelEnum.Sms),

	NOTIFY_NOR(10, "通知基础权限包", null) ,
	NOTIFY_DEP(11, "通知管理权限包", null), 
	NOTIFY_CHANNEL(12, "通知超级权限包", null),
	
	COMMON_NOR(13, "公共基础包", null),
	COMMON_DEP(14, "公共管理包", null),
	COMMON_CHANNEL(15, "公共超级包", null);
	
	private Integer id;
	private String desc;
	private TaskChannelEnum channel;

	private PermissionGroupEnum(Integer id, String desc, TaskChannelEnum channel) {
		this.id = id;
		this.desc = desc;
		this.channel = channel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public TaskChannelEnum getChannel() {
		return channel;
	}

	public static PermissionGroupEnum getDepManageByChannel(TaskChannelEnum channel) {
		switch (channel) {
		case Email:
			return EDM_DEP;
		case Sms:
			return SMS_DEP;
		case Push:
			return PUSH_DEP;
		default:
			return null;
		}
	}
	
	public static PermissionGroupEnum getChannelManageByChannel(TaskChannelEnum channel) {
		switch (channel) {
		case Email:
			return EDM_CHANNEL;
		case Sms:
			return SMS_CHANNEL;
		case Push:
			return PUSH_CHANNEL;
		default:
			return null;
		}
	}
	
	public static TaskChannelEnum getChannelByPermission(Integer pgId) {
		for (PermissionGroupEnum e : PermissionGroupEnum.values())
		{
			if (e.getId().equals(pgId))
			{
				return e.getChannel();
			}
		}
		
		return null;
	}
	
	public static List<Integer> getPermissionGroupIdList(RoleEnum role,
			List<Integer> channelIdList) {
		if (role == null || channelIdList == null || channelIdList.isEmpty()) {
			return new ArrayList<Integer>(0);
		}

		List<Integer> list = new ArrayList<Integer>();
		switch (role) {
		case Normal:
			if (channelIdList.contains(TaskChannelEnum.Email.getIndex())) {
				list.add(EDM_NOR.getId());
			}
			if (channelIdList.contains(TaskChannelEnum.Push.getIndex())) {
				list.add(PUSH_NOR.getId());
			}
			if (channelIdList.contains(TaskChannelEnum.Sms.getIndex())) {
				list.add(SMS_NOR.getId());
			}
			list.add(COMMON_NOR.getId());
			break;
		case Department:
			if (channelIdList.contains(TaskChannelEnum.Email.getIndex())) {
				list.add(EDM_NOR.getId());
				list.add(EDM_DEP.getId());
			}
			if (channelIdList.contains(TaskChannelEnum.Push.getIndex())) {
				list.add(PUSH_NOR.getId());
				list.add(PUSH_DEP.getId());
			}
			if (channelIdList.contains(TaskChannelEnum.Sms.getIndex())) {
				list.add(SMS_NOR.getId());
				list.add(SMS_DEP.getId());
			}
			list.add(COMMON_NOR.getId());
			list.add(COMMON_DEP.getId());
			break;
		case CHANNEL:
			if (channelIdList.contains(TaskChannelEnum.Email.getIndex())) {
				list.add(EDM_NOR.getId());
				list.add(EDM_DEP.getId());
				list.add(EDM_CHANNEL.getId());
			}
			if (channelIdList.contains(TaskChannelEnum.Push.getIndex())) {
				list.add(PUSH_NOR.getId());
				list.add(PUSH_DEP.getId());
				list.add(PUSH_CHANNEL.getId());
			}
			if (channelIdList.contains(TaskChannelEnum.Sms.getIndex())) {
				list.add(SMS_NOR.getId());
				list.add(SMS_DEP.getId());
				list.add(SMS_CHANNEL.getId());
			}
			list.add(COMMON_NOR.getId());
			list.add(COMMON_DEP.getId());
			list.add(COMMON_CHANNEL.getId());
			break;
		default:
			break;
		}

		return list;
	}
	
}
