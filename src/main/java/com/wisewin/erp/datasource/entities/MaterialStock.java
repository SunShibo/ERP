package com.wisewin.erp.datasource.entities;

import java.math.BigDecimal;

public class MaterialStock {
    private Long id;

    private Long materialId;

    private Long depotId;

    private BigDecimal number;

    private Long tenantId;

    private String deleteFag;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getDepotId() {
        return depotId;
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getDeleteFag() {
        return deleteFag;
    }

    public void setDeleteFag(String deleteFag) {
        this.deleteFag = deleteFag == null ? null : deleteFag.trim();
    }
}