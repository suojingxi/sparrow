package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_operation_log")
public class UpmsOperationLog {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 操作描述
     */
    private String description;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 消耗时长（暂定毫秒级）
     */
    @Column(name = "consumption_time")
    private Integer consumptionTime;

    /**
     * 权限值
     */
    @Column(name = "permission_value")
    private String permissionValue;

    /**
     * 状态（0.显示 1.隐藏）
     */
    private Integer state;

    /**
     * 操作用户id
     */
    @Column(name = "operation_user_id")
    private Integer operationUserId;

    /**
     * 操作者IP地址
     */
    @Column(name = "operation_ip")
    private String operationIp;

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
     * 请求参数
     */
    private String parameter;

    /**
     * 请求返回结果
     */
    private String result;

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
     * 获取操作描述
     *
     * @return description - 操作描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置操作描述
     *
     * @param description 操作描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取URI
     *
     * @return uri - URI
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置URI
     *
     * @param uri URI
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取URL
     *
     * @return url - URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置URL
     *
     * @param url URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取请求类型
     *
     * @return method - 请求类型
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置请求类型
     *
     * @param method 请求类型
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取消耗时长（暂定毫秒级）
     *
     * @return consumption_time - 消耗时长（暂定毫秒级）
     */
    public Integer getConsumptionTime() {
        return consumptionTime;
    }

    /**
     * 设置消耗时长（暂定毫秒级）
     *
     * @param consumptionTime 消耗时长（暂定毫秒级）
     */
    public void setConsumptionTime(Integer consumptionTime) {
        this.consumptionTime = consumptionTime;
    }

    /**
     * 获取权限值
     *
     * @return permission_value - 权限值
     */
    public String getPermissionValue() {
        return permissionValue;
    }

    /**
     * 设置权限值
     *
     * @param permissionValue 权限值
     */
    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue;
    }

    /**
     * 获取状态（0.显示 1.隐藏）
     *
     * @return state - 状态（0.显示 1.隐藏）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（0.显示 1.隐藏）
     *
     * @param state 状态（0.显示 1.隐藏）
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取操作用户id
     *
     * @return operation_user_id - 操作用户id
     */
    public Integer getOperationUserId() {
        return operationUserId;
    }

    /**
     * 设置操作用户id
     *
     * @param operationUserId 操作用户id
     */
    public void setOperationUserId(Integer operationUserId) {
        this.operationUserId = operationUserId;
    }

    /**
     * 获取操作者IP地址
     *
     * @return operation_ip - 操作者IP地址
     */
    public String getOperationIp() {
        return operationIp;
    }

    /**
     * 设置操作者IP地址
     *
     * @param operationIp 操作者IP地址
     */
    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp;
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

    /**
     * 获取请求参数
     *
     * @return parameter - 请求参数
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * 设置请求参数
     *
     * @param parameter 请求参数
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * 获取请求返回结果
     *
     * @return result - 请求返回结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置请求返回结果
     *
     * @param result 请求返回结果
     */
    public void setResult(String result) {
        this.result = result;
    }
}