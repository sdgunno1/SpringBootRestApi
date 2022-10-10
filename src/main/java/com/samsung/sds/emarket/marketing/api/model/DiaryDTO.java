package com.samsung.sds.emarket.marketing.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiaryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DiaryDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("date")
  private String date;

  @JsonProperty("content")
  private String content;

  @JsonProperty("emotion")
  private Integer emotion;

  public DiaryDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Diary ID
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, value = "Diary ID")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DiaryDTO date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Diary date
   * @return date
  */
  @ApiModelProperty(example = "2022.10.01", required = true, value = "Diary date")
  @NotNull


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DiaryDTO content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Diary content
   * @return content
  */
  @ApiModelProperty(example = "오늘은 기분이 좋은 날입니다.", value = "Diary content")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public DiaryDTO emotion(Integer emotion) {
    this.emotion = emotion;
    return this;
  }

  /**
   * Diary emotion
   * @return emotion
  */
  @ApiModelProperty(example = "3", value = "Diary emotion")


  public Integer getEmotion() {
    return emotion;
  }

  public void setEmotion(Integer emotion) {
    this.emotion = emotion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiaryDTO diaryDTO = (DiaryDTO) o;
    return Objects.equals(this.id, diaryDTO.id) &&
        Objects.equals(this.date, diaryDTO.date) &&
        Objects.equals(this.content, diaryDTO.content) &&
        Objects.equals(this.emotion, diaryDTO.emotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, content, emotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiaryDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

