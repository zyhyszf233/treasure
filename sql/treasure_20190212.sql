--
-- ER/Studio 8.0 SQL Code Generation
-- Company :      fox
-- Project :      treasure.DM1
-- Author :       user
--
-- Date Created : Tuesday, February 12, 2019 11:07:37
-- Target DBMS : MySQL 5.x
--

-- 
-- TABLE: t_address 
--
drop table if exists t_address;
CREATE TABLE t_address(
    address_id    BIGINT          NOT NULL AUTO_INCREMENT,
    createTime    DATETIME,
    creator       BIGINT,
    modifyTime    DATETIME,
    modifier      BIGINT,
    remark        VARCHAR(128),
    province      VARCHAR(32) default null  comment '省',
    city          VARCHAR(32) default null  comment '市',
    county        VARCHAR(32) default null  comment '县/区',
    brief         VARCHAR(256) default null  comment '省市县',
    detail        VARCHAR(256) default null  comment '详细地址',
    isdefault     INT default 0  comment '是否默认',
    name          VARCHAR(64) default null  comment '用户姓名',
    telephone     VARCHAR(32) default null  comment '电话号码',
    status        CHAR(1) default '0' comment '帐号状态（0正常 1停用）',
    member_id     BIGINT          NOT NULL,
    PRIMARY KEY (address_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '地址表'
;



-- 
-- TABLE: t_balance_detail 
--
drop table if exists t_balance_detail;
CREATE TABLE t_balance_detail(
    balance_detail_id    BIGINT          NOT NULL AUTO_INCREMENT,
    createTime           DATETIME,
    creator              BIGINT,
    modifyTime           DATETIME,
    modifier             BIGINT,
    remark               VARCHAR(255) ,
    tradeAmount          FLOAT(8, 0) default 0  comment '分润的金额',
    remainder            FLOAT(8, 0) default 0  comment '账户余额',
    type                 VARCHAR(8) default null  comment '收益类型',
    member_id            BIGINT          NOT NULL,
    PRIMARY KEY (balance_detail_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '获取奖励记录'
;

-- 
-- TABLE: t_withdraw_log 
--
drop table if exists t_withdraw_log;
CREATE TABLE t_withdraw_log(
    withdraw_log_id    BIGINT          NOT NULL AUTO_INCREMENT,
    createTime         DATETIME,
    creator            BIGINT,
    money              FLOAT(8, 0) default 0  comment '提现金额',
    remark             VARCHAR(128),
    member_id          BIGINT,
    PRIMARY KEY (withdraw_log_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '提现记录'
;

-- 
-- TABLE: t_channel 
--
drop table if exists t_channel;
CREATE TABLE t_channel(
    channel_id      BIGINT          NOT NULL AUTO_INCREMENT,
    createTime      DATETIME,
    creator         BIGINT,
    modifyTime      DATETIME,
    modifier        BIGINT,
    name            VARCHAR(128) default null comment '名称',
    appId           VARCHAR(128) default null comment 'Appid',
    icon_path       VARCHAR(128) default null comment '缩略图',
    qrcode_path     VARCHAR(128) default null comment '二维码图',
    page_path       VARCHAR(128) default null comment '对方路径',
    me_page_path    VARCHAR(128) default null comment '我方路径',
    descr        VARCHAR(256) default '' comment '描述',
	  status        CHAR(1) default '0' comment '帐号状态（0正常 1停用）',
    PRIMARY KEY (channel_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '渠道管理'
;



-- 
-- TABLE: t_content 
--
drop table if exists t_content;
CREATE TABLE t_content(
    content_id    BIGINT          NOT NULL AUTO_INCREMENT,
    content       VARCHAR(128) default null comment '消息内容',
    title         VARCHAR(128) default null comment '消息标题',
    createTime    DATETIME,
    creator       BIGINT,
    modifyTime    DATETIME,
    modifier      BIGINT,
    type          INT default null comment '消息类型',
    PRIMARY KEY (content_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '内容管理'
;



-- 
-- TABLE: t_goods 
--
drop table if exists t_goods;
CREATE TABLE t_goods(
    goods_id          BIGINT          NOT NULL AUTO_INCREMENT,
    name              VARCHAR(128) default null comment '商品名称',
    title             VARCHAR(64) default null comment '商品描述',
    goods_code        VARCHAR(32) ,
    iconPath          VARCHAR(64) default null comment '图片',
    price             FLOAT(8, 0) default 0 comment '市价',
    exchange_price    FLOAT(8, 0) default 0 comment '兑换价',
    coin              INT default 0 comment '积分',
    limitate_buy      INT default 0 comment '限购',
    stock             INT default 0 comment '库存',
    sold              INT default 0 comment '已售',
    status            CHAR(1) default '0' comment '帐号状态（0正常 1停用）',
    createTime        DATETIME,
    creator           BIGINT,
    modifyTime        DATETIME,
    modifier          BIGINT,
    category_id       BIGINT          NOT NULL comment '类型',
    remark            VARCHAR(128),
    PRIMARY KEY (goods_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '商品管理'
;



-- 
-- TABLE: t_goods_category 
--
drop table if exists t_goods_category;
CREATE TABLE t_goods_category(
    category_id    BIGINT          NOT NULL AUTO_INCREMENT,
    name           VARCHAR(64) default null comment '商品类型',
    pic            VARCHAR(32),
    status         CHAR(1) default '0' comment '帐号状态（0正常 1停用）',
    title          VARCHAR(128),
    pid            BIGINT,
    parent_ids     VARCHAR(64),
    PRIMARY KEY (category_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '商品分类'
;



-- 
-- TABLE: t_key_debris_detail 
--
drop table if exists t_key_debris_detail;
CREATE TABLE t_key_debris_detail(
    key_debris_detail_id    BIGINT          NOT NULL AUTO_INCREMENT,
    createTime              DATETIME,
    creator                 BIGINT,
    modifyTime              DATETIME,
    modifier                BIGINT,
    remark                  VARCHAR(255),
    tradeQuantity           FLOAT(8, 0) default 0  comment '分润的数量',
    remainder               FLOAT(8, 0) default 0  comment '得到的数量',
    type                    VARCHAR(8) comment '奖励类型（碎片0或钥匙1）',
    member_id               BIGINT          NOT NULL,
    PRIMARY KEY (key_debris_detail_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '获取碎片钥匙记录'
;



-- 
-- TABLE: t_level 
--
drop table if exists t_level;
CREATE TABLE t_level(
    level_id           BIGINT          NOT NULL AUTO_INCREMENT,
    status             CHAR(1) default '0' comment '帐号状态（0正常 1停用）',
    levelName          VARCHAR(64) default null comment '等级名称',
    levelGrade         INT default null comment '级别',
    keyAmount          INT comment '钥匙上限数量',
    keyLowAmount       INT comment '钥匙下限数量',
    debrisAmount       INT comment '碎片上限数量',
    debrisLowAmount    INT comment '碎片下限数量',
    awardMoney         FLOAT(8, 0) comment '金额奖励',
    awardGoodsId       BIGINT comment '商品奖励',
    remark             VARCHAR(256),
    PRIMARY KEY (level_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '等级管理'
;



-- 
-- TABLE: t_member 
--
drop table if exists t_member;
CREATE TABLE t_member(
    member_id           BIGINT          NOT NULL AUTO_INCREMENT,
    login_count         INT default 0 comment '登录次数',
    levelGrade          INT default 0 comment '用户级别',
    debrisQuantity      INT default 0 comment '碎片数量',
    keyQuantity         INT default 0 comment '钥匙数量',
    balance             FLOAT(8, 0) default 0 comment '余额',
    createTime          DATETIME,
    creator             BIGINT,
    modifyTime          DATETIME,
    modifier            BIGINT,
    code                VARCHAR(10) default 0 comment '用户代码',
    gender              char(1)	default '0' comment '用户性别（0男 1女 2未知）',
    iconPath            VARCHAR(100) default '' 	comment '头像路径',
    mobile              VARCHAR(64) default '' 	comment '用户手机号',
    nickname            VARCHAR(64) default null  comment '微信昵称',
    parent_member_id    BIGINT,
    status              CHAR(1) default '0' comment '用户状态（0正常 1停用）',
    user_id             BIGINT,
    address             VARCHAR(255),
    weixin              VARCHAR(255) default null  comment '微信号',
	openId				VARCHAR(255),
    PRIMARY KEY (member_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '用户管理'
;



-- 
-- TABLE: t_member_level 
--
drop table if exists t_member_level;
CREATE TABLE t_member_level(
    member_level_id    BIGINT          NOT NULL AUTO_INCREMENT,
    debrisAdd        INT default 0 	comment '碎片数量',
    keyAdd           INT default 0 	comment '钥匙数量',
    member_id        BIGINT          NOT NULL,
    level_id         BIGINT          NOT NULL,
    createTime       DATETIME,
    remark           VARCHAR(128),
    creator          BIGINT,
    PRIMARY KEY (member_level_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '用户等级管理'
;



-- 
-- TABLE: t_order 
--
drop table if exists t_order;
CREATE TABLE t_order(
    order_id            BIGINT          NOT NULL AUTO_INCREMENT,
    createTime          DATETIME,
    creator             BIGINT,
    modifyTime          DATETIME,
    modifier            BIGINT,
    remark              VARCHAR(128),
    state               VARCHAR(32) default null  comment '订单状态',
    address_id          BIGINT          NOT NULL  comment '收货信息',
    buyerRemark         VARCHAR(128) default null  comment '买家留言',
    code                VARCHAR(128) default null  comment '订单编码',
    freeFee             FLOAT(8, 0) ,
    order_type          VARCHAR(16) default null  comment '兑换类型',
    freightFee          FLOAT(8, 0) default 0  comment '运费',
    remindSendRemark    VARCHAR(10) comment '发货提醒',
    goods_id            BIGINT          NOT NULL comment '商品信息',
    orderNo             VARCHAR(128) default null  comment '订单号',
    sendNo              VARCHAR(128) default null  comment '运单号',
    member_id           BIGINT          NOT NULL,
    PRIMARY KEY (order_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '订单'
;



-- 
-- TABLE: t_order_log 
--
drop table if exists t_order_log;
CREATE TABLE t_order_log(
    order_log_id    BIGINT         NOT NULL AUTO_INCREMENT,
    order_id        BIGINT         NOT NULL,
    orderId         BIGINT,
    orderState      VARCHAR(16) default null comment '订单状态',
    changeState     VARCHAR(16),
    stateInfo       VARCHAR(16) default null comment '状态信息',
    createTime      DATETIME,
    operator        BIGINT default null comment '操作者',
    PRIMARY KEY (order_log_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '订单记录'
;



-- 
-- TABLE: t_signin 
--
drop table if exists t_signin;
CREATE TABLE t_signin(
    t_signin_id    BIGINT         NOT NULL AUTO_INCREMENT comment '用户签到ID',
    createTime     DATETIME default null  comment '用户签到时间',
    creator        BIGINT,
    remark         VARCHAR(64)  default null  comment '用户签到标注',
    modifyTime     DATETIME,
    modifier       BIGINT,
    PRIMARY KEY (t_signin_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '签到'
;



-- 
-- TABLE: t_signin_group 
--
drop table if exists t_signin_group;
CREATE TABLE t_signin_group(
    t_signin_group_id    BIGINT         NOT NULL AUTO_INCREMENT,
    createTime           DATETIME default null  comment '用户签到开始时间',
    creator              BIGINT,
    modifier             BIGINT,
    modifyTime           DATETIME,
    remark               VARCHAR(64) ,
    status               CHAR(1),
    continueQuantity    INT default null comment '连续签到次数',
    member_id             BIGINT,
    PRIMARY KEY (t_signin_group_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '连续签到记录'
;



-- 
-- TABLE: t_signin_rewards_fixed 
--
drop table if exists t_signin_rewards_fixed;
CREATE TABLE t_signin_rewards_fixed(
    t_signin_rewards_fixed_id           BIGINT         NOT NULL AUTO_INCREMENT,
    createTime                          DATETIME,
    creator                             BIGINT,
    modifyTime                          DATETIME,
    modifier                            BIGINT,
    remark                              VARCHAR(64),
    t_signin_id                         BIGINT         NOT NULL,
    t_signin_group_id                   BIGINT         NOT NULL,
    t_signin_rewards_fixed_config_id    BIGINT         NOT NULL,
    member_id                           BIGINT         NOT NULL,
    memberId                            BIGINT,
    continuesQuantity                   INT default 0 comment '奖励数量',
    rewardsQuantity                     INT default 0 comment '奖励数量',
    status                              CHAR(10),
    rewardsType                         INT default 0 comment '奖励类型',
    PRIMARY KEY (t_signin_rewards_fixed_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '签到奖励记录'
;



-- 
-- TABLE: t_signin_rewards_fixed_config 
--
drop table if exists t_signin_rewards_fixed_config;
CREATE TABLE t_signin_rewards_fixed_config(
    t_signin_rewards_fixed_config_id    BIGINT         NOT NULL AUTO_INCREMENT,
    createTime                          DATETIME,
    creator                             BIGINT,
    modifyTime                          DATETIME,
    modifier                            BIGINT,
    remark                              VARCHAR(64),
    rewardsQuantity                     INT default 0 comment '奖励数量',
    continuesQuantity                   INT default 0 comment '连续次数',
    rewardsType                         INT default 0 comment '奖励类型',
    status                              CHAR(1) default '0' comment '用户状态（0正常 1停用）',
    PRIMARY KEY (t_signin_rewards_fixed_config_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '连续签到奖励配置'
;



-- 
-- TABLE: t_task 
--
drop table if exists t_task;
CREATE TABLE t_task(
    task_id        BIGINT          NOT NULL AUTO_INCREMENT,
    task_name      VARCHAR(64) default null comment '任务名称',
    icon_path      VARCHAR(128) default null comment '缩略图',
    qrcode_path    VARCHAR(128) default null comment '任务名称',
    appId          VARCHAR(128) default null comment 'Appid',
    jump_mode      CHAR(10) default null comment '跳转方式',
    path           VARCHAR(64) default null comment '路径',
    descr           VARCHAR(128) default null comment '说明',
    reward         FLOAT(8, 0) default 0 comment '奖励',
    limit_count    INT default 0 comment '次数限制',
    createTime     DATETIME,
    creator        BIGINT,
    modifyTime     DATETIME,
    modifier       BIGINT,
    task_time      INT default 0 comment '任务时间',
    PRIMARY KEY (task_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '任务表'
;



-- 
-- TABLE: t_task_log 
--
drop table if exists t_task_log;
CREATE TABLE t_task_log(
    task_log_id    BIGINT      NOT NULL AUTO_INCREMENT,
    member_id      BIGINT,
    task_id        BIGINT,
    createTime     DATETIME,
    creator        BIGINT,
    PRIMARY KEY (task_log_id)
)engine=innodb auto_increment=200 default charset=utf8 comment = '用户任务记录表'
;