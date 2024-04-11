CREATE TABLE `index_image`
(
    `id`           bigint       NOT NULL COMMENT '主键ID',
    `image_name`   varchar(32)  NOT NULL COMMENT '商品编码',
    `image_path`   varchar(100) NOT NULL COMMENT '商品名称',
    `image_index`  bit(40)     DEFAULT NULL COMMENT '商品大类',
    `date_created` datetime(6) DEFAULT NULL COMMENT '创建者',
    `created_by`   varchar(32) DEFAULT NULL COMMENT '创建时间',
    `updated_by`   varchar(32) DEFAULT NULL COMMENT '修改者',
    `date_updated` datetime(6) DEFAULT NULL COMMENT '修改时间',
    `delete_flag`  bit(1)      DEFAULT NULL COMMENT '删除标志 true/false 删除/未删除',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='首页轮播图';