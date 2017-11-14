package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_system")
public class UpmsSystem {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 系统编码
     */
    private String code;

    /**
     * 系统名称
     */
    private String name;

    /**
     * 系统标题
     */
    private String title;

    /**
     * 系统图标
     */
    private String icon;

    /**
     * 系统默认背景图
     */
    private String background;

    /**
     * 主题（颜色值）
     */
    private String theme;

    /**
     * 域名
     */
    @Column(name = "domain_name")
    private String domainName;

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
     * 获取系统编码
     *
     * @return code - 系统编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置系统编码
     *
     * @param code 系统编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取系统名称
     *
     * @return name - 系统名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置系统名称
     *
     * @param name 系统名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取系统标题
     *
     * @return title - 系统标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置系统标题
     *
     * @param title 系统标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取系统图标
     *
     * @return icon - 系统图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置系统图标
     *
     * @param icon 系统图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取系统默认背景图
     *
     * @return background - 系统默认背景图
     */
    public String getBackground() {
        return background;
    }

    /**
     * 设置系统默认背景图
     *
     * @param background 系统默认背景图
     */
    public void setBackground(String background) {
        this.background = background;
    }

    /**
     * 获取主题（颜色值）
     *
     * @return theme - 主题（颜色值）
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置主题（颜色值）
     *
     * @param theme 主题（颜色值）
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 获取域名
     *
     * @return domain_name - 域名
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * 设置域名
     *
     * @param domainName 域名
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
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