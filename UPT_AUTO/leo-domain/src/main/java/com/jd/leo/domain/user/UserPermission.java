package com.jd.leo.domain.user;

/**
 * 用户权限包关系表
 * @author cdsudan
 *
 */
public class UserPermission {
	
    private int id;

    private int userId;

    private int groupId;
    
    /**扩展为分组名**/
    private String group;
    
    /**扩展为关联查询的权限id**/
    private int permissionId; 
    
    /**扩展为关联查询的权限路径**/
    private String uri;
    
    /**扩展为权限的描述**/
    private String memo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}