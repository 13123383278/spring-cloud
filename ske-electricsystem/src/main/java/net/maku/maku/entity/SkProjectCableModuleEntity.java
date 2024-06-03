package net.maku.maku.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.util.Date;

/**
 * 电缆模块属性表
 *
 * @author lpd 1@126.com
 * @since 1.0.0 2024-05-28
 */

@Data
@TableName("sk_project_cable_module")
public class SkProjectCableModuleEntity {
	@TableId
	private Long id;

	/**
	* 模块id
	*/
	private String moduleId;

	/**
	* 电压等级
	*/
	private String voltageLevel;

	/**
	* 芯数

	*/
	private String coreNumber;

	/**
	* 截面

	*/
	private String section;

	/**
	* 电缆外径
	*/
	private String cableOuterDiameter;

	/**
	* 最小转弯半径

	*/
	private String minimumTurningRadius;

	/**
	* 电缆盘圈长度

	*/
	private String cableCoilLength;

	/**
	* 电缆盘圈量（m）

	*/
	private String cableReelCoilQuantity;

	/**
	* 版本号
	*/
	private Integer version;

	/**
	* 删除标识  0：正常   1：已删除
	*/
	private Integer deleted;

	/**
	* 创建者
	*/
	private Long creator;

	/**
	* 创建时间
	*/
	private Date createTime;

	/**
	* 更新者
	*/
	private Long updater;

	/**
	* 更新时间
	*/
	private Date updateTime;

}