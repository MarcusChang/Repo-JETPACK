package com.jd.leo.domain.user;

/**
 * 权限分组关系表
 * @author cdsudan
 *
 */
public class PermissionGroup {
	
    private Integer id;

    private String group;

    private Integer permissionId;
    
    /**扩展字段  权限路径**/
    private String uri;
    
    /**扩展字段 权限备注**/
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
    
    
}