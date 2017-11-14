package com.sonymm.sparrow.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upms_user")
public class UpmsUser {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 账户名称
     */
    private String username;

    /**
     * 密码（MD5（密码+salt））
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像（url路径）
     */
    private String avatar;

    /**
     * 性别（0.保密 1.男 2.女 3.男妖 4.女妖）
     */
    private Byte sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证号
     */
    @Column(name = "id_card_no")
    private String idCardNo;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 状态（0.使用中；1.锁定中；2.已删除）
     */
    private Integer state;

    /**
     * 创建者id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 注册IP地址
     */
    @Column(name = "create_ip")
    private String createIp;

    /**
     * 用户注册时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 最后登录IP
     */
    @Column(name = "last_login_ip")
    private String lastLoginIp;

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
     * 获取账户名称
     *
     * @return username - 账户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置账户名称
     *
     * @param username 账户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码（MD5（密码+salt））
     *
     * @return password - 密码（MD5（密码+salt））
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码（MD5（密码+salt））
     *
     * @param password 密码（MD5（密码+salt））
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐值
     *
     * @return salt - 盐值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐值
     *
     * @param salt 盐值
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取头像（url路径）
     *
     * @return avatar - 头像（url路径）
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像（url路径）
     *
     * @param avatar 头像（url路径）
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取性别（0.保密 1.男 2.女 3.男妖 4.女妖）
     *
     * @return sex - 性别（0.保密 1.男 2.女 3.男妖 4.女妖）
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别（0.保密 1.男 2.女 3.男妖 4.女妖）
     *
     * @param sex 性别（0.保密 1.男 2.女 3.男妖 4.女妖）
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证号
     *
     * @return id_card_no - 身份证号
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * 设置身份证号
     *
     * @param idCardNo 身份证号
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取状态（0.使用中；1.锁定中；2.已删除）
     *
     * @return state - 状态（0.使用中；1.锁定中；2.已删除）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（0.使用中；1.锁定中；2.已删除）
     *
     * @param state 状态（0.使用中；1.锁定中；2.已删除）
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取注册IP地址
     *
     * @return create_ip - 注册IP地址
     */
    public String getCreateIp() {
        return createIp;
    }

    /**
     * 设置注册IP地址
     *
     * @param createIp 注册IP地址
     */
    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    /**
     * 获取用户注册时间
     *
     * @return create_time - 用户注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户注册时间
     *
     * @param createTime 用户注册时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取最后登录IP
     *
     * @return last_login_ip - 最后登录IP
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param lastLoginIp 最后登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
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