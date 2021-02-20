package com.baomidou.mybatisplus.samples.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 品牌信息表
 * </p>
 *
 * @author hhzh
 * @since 2021-02-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_brand_info")
public class BrandInfo extends Model<BrandInfo> {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 品牌商名称
     */
    private String brandName;

    /**
     * 品牌商logo链接
     */
    private String logoUrl;

    /**
     * 品牌商负责人
     */
    private String managerName;

    /**
     * 品牌商负责人电话
     */
    private String managerPhone;

    /**
     * 核销率，json存储
     */
    private String usedRate;

    /**
     * 逻辑删除标志，1是0否，默认0
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 废弃
     */
    private Long groupBrandId;

    /**
     * 废弃
     */
    private String groupBrandName;

    /**
     * 集团品牌ID
     */
    private Long taobaoBrandId;

    /**
     * 集团品牌名称
     */
    private String taobaoBrandName;

    /**
     * 1 医药  2  快消
     */
    private Integer brandType;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * astore初始化状态,0未初始化，1已初始化
     */
    private Integer astoreInitStatus;

    /**
     * 企业支付宝pid
     */
    private String brandAlipayPid;

    /**
     * 企业支付宝企业名称
     */
    private String brandAlipayUserName;

    /**
     * 绑定标记 0未绑定 1绑定
     */
    private Integer brandAlipayBindingFlag;

    /**
     * 淘宝id
     */
    private Long brandTaobaoUserId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
