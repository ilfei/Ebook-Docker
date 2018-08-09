
package org.folio.rest.jaxrs.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "datetime",
    "genre",
    "author",
    "link"
})
public class Bookdata {

    /**
     * Unique ID (UUID) of this record
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
    /**
     * Title of the e-book
     * (Required)
     * 
     */
    @JsonProperty("title")
    @NotNull
    private String title;
    /**
     * Description of the content and the usage limitations of the e-book
     * (Required)
     * 
     */
    @JsonProperty("description")
    @NotNull
    private Object description;
    /**
     * The last time this record has been changed
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    @NotNull
    private Integer datetime;
    /**
     * Genre of the e-book
     * (Required)
     * 
     */
    @JsonProperty("genre")
    @NotNull
    private String genre;
    /**
     * Author of the e-book. Several authors are separated by comma.
     * (Required)
     * 
     */
    @JsonProperty("author")
    @NotNull
    private String author;
    /**
     * URL to access the e-book.
     * (Required)
     * 
     */
    @JsonProperty("link")
    @NotNull
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unique ID (UUID) of this record
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Unique ID (UUID) of this record
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Bookdata withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title of the e-book
     * (Required)
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title of the e-book
     * (Required)
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Bookdata withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description of the content and the usage limitations of the e-book
     * (Required)
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    /**
     * Description of the content and the usage limitations of the e-book
     * (Required)
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    public Bookdata withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * The last time this record has been changed
     * (Required)
     * 
     * @return
     *     The datetime
     */
    @JsonProperty("datetime")
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * The last time this record has been changed
     * (Required)
     * 
     * @param datetime
     *     The datetime
     */
    @JsonProperty("datetime")
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public Bookdata withDatetime(Integer datetime) {
        this.datetime = datetime;
        return this;
    }

    /**
     * Genre of the e-book
     * (Required)
     * 
     * @return
     *     The genre
     */
    @JsonProperty("genre")
    public String getGenre() {
        return genre;
    }

    /**
     * Genre of the e-book
     * (Required)
     * 
     * @param genre
     *     The genre
     */
    @JsonProperty("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Bookdata withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    /**
     * Author of the e-book. Several authors are separated by comma.
     * (Required)
     * 
     * @return
     *     The author
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     * Author of the e-book. Several authors are separated by comma.
     * (Required)
     * 
     * @param author
     *     The author
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public Bookdata withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * URL to access the e-book.
     * (Required)
     * 
     * @return
     *     The link
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     * URL to access the e-book.
     * (Required)
     * 
     * @param link
     *     The link
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    public Bookdata withLink(String link) {
        this.link = link;
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

    public Bookdata withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
