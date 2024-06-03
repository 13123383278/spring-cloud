package net.maku.maku.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import net.maku.framework.common.utils.DateUtils;
import java.util.Date;

/**
* 电缆模块属性表
*
* @author lpd 1@126.com
* @since 1.0.0 2024-05-28
*/
@Data
@Schema(description = "电缆模块属性表")
public class SkProjectCableModuleVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Schema(description = "模块id")
	private String moduleId;

	@Schema(description = "电压等级")
	private String voltageLevel;

	@Schema(description = "芯数")
	private String coreNumber;

	@Schema(description = "截面")
	private String section;

	@Schema(description = "电缆外径")
	private String cableOuterDiameter;

	@Schema(description = "最小转弯半径")
	private String minimumTurningRadius;

	@Schema(description = "电缆盘圈长度")
	private String cableCoilLength;

	@Schema(description = "电缆盘圈量（m）")
	private String cableReelCoilQuantity;

	@Schema(description = "版本号")
	private Integer version;

	@Schema(description = "删除标识  0：正常   1：已删除")
	private Integer deleted;

	@Schema(description = "创建者")
	private Long creator;

	@Schema(description = "创建时间")
	@JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
	private Date createTime;

	@Schema(description = "更新者")
	private Long updater;

	@Schema(description = "更新时间")
	@JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
	private Date updateTime;


}