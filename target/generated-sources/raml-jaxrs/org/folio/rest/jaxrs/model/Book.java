package org.folio.rest.jaxrs.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Record of an e-book
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "bookdata", "success", "status" })
public class Book {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bookdata")
    @Valid
    @NotNull
    private Bookdata bookdata;

    /**
     * False if there was some error during the request, true otherwise. An empty result can also have success=true.
     * (Required)
     * 
     */
    @JsonProperty("success")
    @NotNull
    private Boolean success;

    /**
     * HTTP status code returned from the knowledge base.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @NotNull
    private Integer status;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bookdata
     */
    @JsonProperty("bookdata")
    public Bookdata getBookdata() {
        return bookdata;
    }

    /**
     * 
     * (Required)
     * 
     * @param bookdata
     *     The bookdata
     */
    @JsonProperty("bookdata")
    public void setBookdata(Bookdata bookdata) {
        this.bookdata = bookdata;
    }

    public Book withBookdata(Bookdata bookdata) {
        this.bookdata = bookdata;
        return this;
    }

    /**
     * False if there was some error during the request, true otherwise. An empty result can also have success=true.
     * (Required)
     * 
     * @return
     *     The success
     */
    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    /**
     * False if there was some error during the request, true otherwise. An empty result can also have success=true.
     * (Required)
     * 
     * @param success
     *     The success
     */
    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Book withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * HTTP status code returned from the knowledge base.
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * HTTP status code returned from the knowledge base.
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Book withStatus(Integer status) {
        this.status = status;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Book withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
