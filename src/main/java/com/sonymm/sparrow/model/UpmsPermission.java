package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_permission")
public class UpmsPermission {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父级id
     */
    private Integer pid;

    /**
     * 权限编码
     */
    private String code;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限类型（1.目录 2.菜单 3.按钮）
     */
    private Byte type;

    /**
     * 权限值（用于shiro权限管理设置）
     */
    private String value;

    /**
     * 路径
     */
    private String uri;

    /**
     * 图标？
     */
    private String icon;

    /**
     * 状态（0.关闭 1.启用）
     */
    private Byte status;

    /**
     * 排序（同一级别的按照从小到大排序，小的排前面，大的排后面）
     */
    private Integer sort;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 创建者id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "last_time")
    private Date lastTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取父级id
     *
     * @return pid - 父级id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父级id
     *
     * @param pid 父级id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取权限编码
     *
     * @return code - 权限编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置权限编码
     *
     * @param code 权限编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取权限类型（1.目录 2.菜单 3.按钮）
     *
     * @return type - 权限类型（1.目录 2.菜单 3.按钮）
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置权限类型（1.目录 2.菜单 3.按钮）
     *
     * @param type 权限类型（1.目录 2.菜单 3.按钮）
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取权限值（用于shiro权限管理设置）
     *
     * @return value - 权限值（用于shiro权限管理设置）
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置权限值（用于shiro权限管理设置）
     *
     * @param value 权限值（用于shiro权限管理设置）
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取路径
     *
     * @return uri - 路径
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置路径
     *
     * @param uri 路径
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取图标？
     *
     * @return icon - 图标？
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标？
     *
     * @param icon 图标？
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取状态（0.关闭 1.启用）
     *
     * @return status - 状态（0.关闭 1.启用）
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态（0.关闭 1.启用）
     *
     * @param status 状态（0.关闭 1.启用）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取排序（同一级别的按照从小到大排序，小的排前面，大的排后面）
     *
     * @return sort - 排序（同一级别的按照从小到大排序，小的排前面，大的排后面）
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序（同一级别的按照从小到大排序，小的排前面，大的排后面）
     *
     * @param sort 排序（同一级别的按照从小到大排序，小的排前面，大的排后面）
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取描述信息
     *
     * @return description - 描述信息
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述信息
     *
     * @param description 描述信息
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建者id
     *
     * @return create_user_id - 创建者id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建者id
     *
     * @param createUserId 创建者id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return last_time - 修改时间
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 设置修改时间
     *
     * @param lastTime 修改时间
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}