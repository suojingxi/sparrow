package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_role")
public class UpmsRole {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色代码
     */
    private String code;

    /**
     * 父级id
     */
    private Integer pid;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色标题
     */
    private String title;

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
     * 获取角色代码
     *
     * @return code - 角色代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置角色代码
     *
     * @param code 角色代码
     */
    public void setCode(String code) {
        this.code = code;
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
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色标题
     *
     * @return title - 角色标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置角色标题
     *
     * @param title 角色标题
     */
    public void setTitle(String title) {
        this.title = title;
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