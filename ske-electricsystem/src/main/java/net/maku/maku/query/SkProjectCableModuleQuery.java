package net.maku.maku.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
* 电缆模块属性表查询
*
* @author lpd 1@126.com
* @since 1.0.0 2024-05-28
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "电缆模块属性表查询")
public class SkProjectCableModuleQuery extends Query {
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

}