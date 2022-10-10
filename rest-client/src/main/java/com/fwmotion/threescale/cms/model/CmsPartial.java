package com.fwmotion.threescale.cms.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CmsPartial implements CmsTemplate {

    private Integer id;
    private String systemName;
    private String contentType;
    private String handler;
    private Boolean liquidEnabled;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Boolean getLiquidEnabled() {
        return liquidEnabled;
    }

    public void setLiquidEnabled(Boolean liquidEnabled) {
        this.liquidEnabled = liquidEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CmsPartial)) return false;

        CmsPartial that = (CmsPartial) o;

        return new EqualsBuilder().append(getId(), that.getId()).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getId()).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("id", id)
            .append("systemName", systemName)
            .append("contentType", contentType)
            .append("handler", handler)
            .append("liquidEnabled", liquidEnabled)
            .toString();
    }
}