package com.wisewin.erp.controller;

import com.alibaba.fastjson.JSONObject;
import com.wisewin.erp.constants.ExceptionConstants;
import com.wisewin.erp.exception.BusinessRunTimeException;
import com.wisewin.erp.service.materialProperty.MaterialPropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/materialProperty")
public class MaterialPropertyController {
    private Logger logger = LoggerFactory.getLogger(MaterialPropertyController.class);
    @Resource
    private MaterialPropertyService materialPropertyService;
    /**
     *  批量删除商品扩展信息
     * @Param: ids
     * @return java.lang.Object
     */
    @RequestMapping(value = "/batchDeleteMaterialPropertyByIds")
    public Object batchDeleteMaterialPropertyByIds(@RequestParam("ids") String ids) throws Exception {
        JSONObject result = ExceptionConstants.standardSuccess();
        int i= materialPropertyService.batchDeleteMaterialPropertyByIds(ids);
        if(i<1){
            logger.error("异常码[{}],异常提示[{}],参数,ids[{}]",
                    ExceptionConstants.MATERIAL_PROPERTY_DELETE_FAILED_CODE,ExceptionConstants.MATERIAL_PROPERTY_DELETE_FAILED_MSG,ids);
            throw new BusinessRunTimeException(ExceptionConstants.MATERIAL_PROPERTY_DELETE_FAILED_CODE,
                    ExceptionConstants.MATERIAL_PROPERTY_DELETE_FAILED_MSG);
        }
        return result;
    }
}
