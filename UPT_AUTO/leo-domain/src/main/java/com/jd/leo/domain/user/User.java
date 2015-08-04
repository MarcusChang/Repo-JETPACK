package com.jd.leo.domain.user;

/**
 * 用户基础信息表
 */
import java.util.Date;
import java.util.List;
import java.util.Set;

public class User  {

	private Integer id;

	private String erp;

	private String name;
	/**部门ID**/
	private Integer depId;
	/**部门名称**/
	private String depName;

	private String mobile;

	private String email;
	/**角色**/
	private Integer roleId;
	
	private String role;
	
	private List<Integer> permissionGroupList;
	
	private Set<String> permissionList;
	
	private List<Integer> channelIdList;
	
	/**最后登录时间**/
	private Date gmtLastLogin;
	/**是否删除**/
	private Boolean hasDel;

	private Date gmtCreate;

	private String creator;

	private Date gmtModified;

	private String modifier;
	
	private String gmtCreateStr;

    private String gmtModifiedStr;
    
    private String item_first_cate_cd_str;
    
    private String item_second_cate_cd_str;
    
    private String item_third_cate_cd_str;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getErp() {
		return erp;
	}

	public void setErp(String erp) {
		this.erp = erp == null ? null : erp.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName == null ? null : depName.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Integer> getPermissionGroupList() {
		return permissionGroupList;
	}

	public void setPermissionGroupList(List<Integer> permissionGroupList) {
		this.permissionGroupList = permissionGroupList;
	}

	public Set<String> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(Set<String> permissionList) {
		this.permissionList = permissionList;
	}

	public List<Integer> getChannelIdList() {
		return channelIdList;
	}

	public void setChannelIdList(List<Integer> channelIdList) {
		this.channelIdList = channelIdList;
	}

	public Boolean getHasDel() {
		return hasDel;
	}

	public void setHasDel(Boolean hasDel) {
		this.hasDel = hasDel;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator == null ? null : creator.trim();
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier == null ? null : modifier.trim();
	}

	public Date getGmtLastLogin() {
		return gmtLastLogin;
	}

	public void setGmtLastLogin(Date gmtLastLogin) {
		this.gmtLastLogin = gmtLastLogin;
	}

	public String getGmtCreateStr() {
		return gmtCreateStr;
	}

	public void setGmtCreateStr(String gmtCreateStr) {
		this.gmtCreateStr = gmtCreateStr;
	}

	public String getGmtModifiedStr() {
		return gmtModifiedStr;
	}

	public void setGmtModifiedStr(String gmtModifiedStr) {
		this.gmtModifiedStr = gmtModifiedStr;
	}
	
	public String getItem_first_cate_cd_str() {
		return item_first_cate_cd_str;
	}

	public void setItem_first_cate_cd_str(String item_first_cate_cd_str) {
		this.item_first_cate_cd_str = item_first_cate_cd_str;
	}

	public String getItem_second_cate_cd_str() {
		return item_second_cate_cd_str;
	}

	public void setItem_second_cate_cd_str(String item_second_cate_cd_str) {
		this.item_second_cate_cd_str = item_second_cate_cd_str;
	}

	public String getItem_third_cate_cd_str() {
		return item_third_cate_cd_str;
	}

	public void setItem_third_cate_cd_str(String item_third_cate_cd_str) {
		this.item_third_cate_cd_str = item_third_cate_cd_str;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", erp=" + erp + ", name=" + name
				+ ", depId=" + depId + ", depName=" + depName + ", roleId="
				+ roleId + ", role=" + role + "]";
	}
}