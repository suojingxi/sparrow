package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_organization")
public class UpmsOrganization {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 组织代码
     */
    private String code;

    /**
     * 父级id
     */
    private Integer pid;

    /**
     * 组织名称
     */
    private String name;

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
     * 创建者编码
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
     * 获取组织代码
     *
     * @return code - 组织代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置组织代码
     *
     * @param code 组织代码
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
     * 获取组织名称
     *
     * @return name - 组织名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置组织名称
     *
     * @param name 组织名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取创建者编码
     *
     * @return create_user_id - 创建者编码
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建者编码
     *
     * @param createUserId 创建者编码
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