package com.jd.leo.domain.enums;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-1-16
 * Time: 下午2:28
 */
public enum RoleEnum {

	Normal (3, "普通用户"),
    Department(2, "部门管理员"),
    CHANNEL(1, "渠道管理员");

    private Integer id;
    private String roleName;

    private RoleEnum(Integer id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
    
	public static RoleEnum getRole(int id)
	{
		for (RoleEnum role : RoleEnum.values())
		{
			if (role.id == id)
			{
				return role;
			}
		}
		
		return null;
	}
	
	public static boolean isNormal(Integer id)
	{
		return Normal.getId().equals(id);
	}
	
	public static boolean isDepManager(Integer id)
	{
		return Department.getId().equals(id);
	}
	
	public static boolean isChannelManager(Integer id)
	{
		return CHANNEL.getId().equals(id);
	}
	
}
