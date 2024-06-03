package net.maku.maku.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.maku.convert.SkProjectCableModuleConvert;
import net.maku.maku.entity.SkProjectCableModuleEntity;
import net.maku.maku.service.SkProjectCableModuleService;
import net.maku.maku.query.SkProjectCableModuleQuery;
import net.maku.maku.vo.SkProjectCableModuleVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

/**
* 电缆模块属性表
*
* @author lpd 1@126.com
* @since 1.0.0 2024-05-28
*/
@RestController
@RequestMapping("maku/sk_project_cable_module")
@Tag(name="电缆模块属性表")
@AllArgsConstructor
public class SkProjectCableModuleController {
    private final SkProjectCableModuleService skProjectCableModuleService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('maku:sk_project_cable_module:page')")
    public Result<PageResult<SkProjectCableModuleVO>> page(@ParameterObject @Valid SkProjectCableModuleQuery query){
        PageResult<SkProjectCableModuleVO> page = skProjectCableModuleService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    @PreAuthorize("hasAuthority('maku:sk_project_cable_module:info')")
    public Result<SkProjectCableModuleVO> get(@PathVariable("id") Long id){
        SkProjectCableModuleEntity entity = skProjectCableModuleService.getById(id);

        return Result.ok(SkProjectCableModuleConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    @PreAuthorize("hasAuthority('maku:sk_project_cable_module:save')")
    public Result<String> save(@RequestBody SkProjectCableModuleVO vo){
        skProjectCableModuleService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    @PreAuthorize("hasAuthority('maku:sk_project_cable_module:update')")
    public Result<String> update(@RequestBody @Valid SkProjectCableModuleVO vo){
        skProjectCableModuleService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @PreAuthorize("hasAuthority('maku:sk_project_cable_module:delete')")
    public Result<String> delete(@RequestBody List<Long> idList){
        skProjectCableModuleService.delete(idList);

        return Result.ok();
    }
}