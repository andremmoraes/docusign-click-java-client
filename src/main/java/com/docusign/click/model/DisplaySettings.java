package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DisplaySettings
 */

public class DisplaySettings {
  @JsonProperty("actionButtonAlignment")
  private String actionButtonAlignment = null;

  @JsonProperty("allowClientOnly")
  private Boolean allowClientOnly = null;

  @JsonProperty("allowedHosts")
  private java.util.List<String> allowedHosts = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("consentButtonText")
  private String consentButtonText = null;

  @JsonProperty("consentText")
  private String consentText = null;

  @JsonProperty("declineButtonText")
  private String declineButtonText = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("documentDisplay")
  private String documentDisplay = null;

  @JsonProperty("downloadable")
  private Boolean downloadable = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("hasDeclineButton")
  private Boolean hasDeclineButton = null;

  @JsonProperty("hostOrigin")
  private String hostOrigin = null;

  @JsonProperty("mustRead")
  private Boolean mustRead = null;

  @JsonProperty("mustView")
  private Boolean mustView = null;

  @JsonProperty("recordDeclineResponses")
  private Boolean recordDeclineResponses = null;

  @JsonProperty("requireAccept")
  private Boolean requireAccept = null;

  @JsonProperty("sendToEmail")
  private Boolean sendToEmail = null;

  public DisplaySettings actionButtonAlignment(String actionButtonAlignment) {
    this.actionButtonAlignment = actionButtonAlignment;
    return this;
  }

   /**
   * 
   * @return actionButtonAlignment
  **/
  @ApiModelProperty(value = "")
  public String getActionButtonAlignment() {
    return actionButtonAlignment;
  }

  public void setActionButtonAlignment(String actionButtonAlignment) {
    this.actionButtonAlignment = actionButtonAlignment;
  }

  public DisplaySettings allowClientOnly(Boolean allowClientOnly) {
    this.allowClientOnly = allowClientOnly;
    return this;
  }

   /**
   * 
   * @return allowClientOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowClientOnly() {
    return allowClientOnly;
  }

  public void setAllowClientOnly(Boolean allowClientOnly) {
    this.allowClientOnly = allowClientOnly;
  }

  public DisplaySettings allowedHosts(java.util.List<String> allowedHosts) {
    this.allowedHosts = allowedHosts;
    return this;
  }

  public DisplaySettings addAllowedHostsItem(String allowedHostsItem) {
    if (this.allowedHosts == null) {
      this.allowedHosts = new java.util.ArrayList<String>();
    }
    this.allowedHosts.add(allowedHostsItem);
    return this;
  }

   /**
   * 
   * @return allowedHosts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getAllowedHosts() {
    return allowedHosts;
  }

  public void setAllowedHosts(java.util.List<String> allowedHosts) {
    this.allowedHosts = allowedHosts;
  }

  public DisplaySettings brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @ApiModelProperty(value = "")
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public DisplaySettings consentButtonText(String consentButtonText) {
    this.consentButtonText = consentButtonText;
    return this;
  }

   /**
   * 
   * @return consentButtonText
  **/
  @ApiModelProperty(value = "")
  public String getConsentButtonText() {
    return consentButtonText;
  }

  public void setConsentButtonText(String consentButtonText) {
    this.consentButtonText = consentButtonText;
  }

  public DisplaySettings consentText(String consentText) {
    this.consentText = consentText;
    return this;
  }

   /**
   * 
   * @return consentText
  **/
  @ApiModelProperty(value = "")
  public String getConsentText() {
    return consentText;
  }

  public void setConsentText(String consentText) {
    this.consentText = consentText;
  }

  public DisplaySettings declineButtonText(String declineButtonText) {
    this.declineButtonText = declineButtonText;
    return this;
  }

   /**
   * 
   * @return declineButtonText
  **/
  @ApiModelProperty(value = "")
  public String getDeclineButtonText() {
    return declineButtonText;
  }

  public void setDeclineButtonText(String declineButtonText) {
    this.declineButtonText = declineButtonText;
  }

  public DisplaySettings displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DisplaySettings documentDisplay(String documentDisplay) {
    this.documentDisplay = documentDisplay;
    return this;
  }

   /**
   * 
   * @return documentDisplay
  **/
  @ApiModelProperty(value = "")
  public String getDocumentDisplay() {
    return documentDisplay;
  }

  public void setDocumentDisplay(String documentDisplay) {
    this.documentDisplay = documentDisplay;
  }

  public DisplaySettings downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

   /**
   * 
   * @return downloadable
  **/
  @ApiModelProperty(value = "")
  public Boolean isDownloadable() {
    return downloadable;
  }

  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

  public DisplaySettings format(String format) {
    this.format = format;
    return this;
  }

   /**
   * 
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public DisplaySettings hasDeclineButton(Boolean hasDeclineButton) {
    this.hasDeclineButton = hasDeclineButton;
    return this;
  }

   /**
   * 
   * @return hasDeclineButton
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasDeclineButton() {
    return hasDeclineButton;
  }

  public void setHasDeclineButton(Boolean hasDeclineButton) {
    this.hasDeclineButton = hasDeclineButton;
  }

  public DisplaySettings hostOrigin(String hostOrigin) {
    this.hostOrigin = hostOrigin;
    return this;
  }

   /**
   * 
   * @return hostOrigin
  **/
  @ApiModelProperty(value = "")
  public String getHostOrigin() {
    return hostOrigin;
  }

  public void setHostOrigin(String hostOrigin) {
    this.hostOrigin = hostOrigin;
  }

  public DisplaySettings mustRead(Boolean mustRead) {
    this.mustRead = mustRead;
    return this;
  }

   /**
   * 
   * @return mustRead
  **/
  @ApiModelProperty(value = "")
  public Boolean isMustRead() {
    return mustRead;
  }

  public void setMustRead(Boolean mustRead) {
    this.mustRead = mustRead;
  }

  public DisplaySettings mustView(Boolean mustView) {
    this.mustView = mustView;
    return this;
  }

   /**
   * 
   * @return mustView
  **/
  @ApiModelProperty(value = "")
  public Boolean isMustView() {
    return mustView;
  }

  public void setMustView(Boolean mustView) {
    this.mustView = mustView;
  }

  public DisplaySettings recordDeclineResponses(Boolean recordDeclineResponses) {
    this.recordDeclineResponses = recordDeclineResponses;
    return this;
  }

   /**
   * 
   * @return recordDeclineResponses
  **/
  @ApiModelProperty(value = "")
  public Boolean isRecordDeclineResponses() {
    return recordDeclineResponses;
  }

  public void setRecordDeclineResponses(Boolean recordDeclineResponses) {
    this.recordDeclineResponses = recordDeclineResponses;
  }

  public DisplaySettings requireAccept(Boolean requireAccept) {
    this.requireAccept = requireAccept;
    return this;
  }

   /**
   * 
   * @return requireAccept
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireAccept() {
    return requireAccept;
  }

  public void setRequireAccept(Boolean requireAccept) {
    this.requireAccept = requireAccept;
  }

  public DisplaySettings sendToEmail(Boolean sendToEmail) {
    this.sendToEmail = sendToEmail;
    return this;
  }

   /**
   * 
   * @return sendToEmail
  **/
  @ApiModelProperty(value = "")
  public Boolean isSendToEmail() {
    return sendToEmail;
  }

  public void setSendToEmail(Boolean sendToEmail) {
    this.sendToEmail = sendToEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplaySettings displaySettings = (DisplaySettings) o;
    return Objects.equals(this.actionButtonAlignment, displaySettings.actionButtonAlignment) &&
        Objects.equals(this.allowClientOnly, displaySettings.allowClientOnly) &&
        Objects.equals(this.allowedHosts, displaySettings.allowedHosts) &&
        Objects.equals(this.brandId, displaySettings.brandId) &&
        Objects.equals(this.consentButtonText, displaySettings.consentButtonText) &&
        Objects.equals(this.consentText, displaySettings.consentText) &&
        Objects.equals(this.declineButtonText, displaySettings.declineButtonText) &&
        Objects.equals(this.displayName, displaySettings.displayName) &&
        Objects.equals(this.documentDisplay, displaySettings.documentDisplay) &&
        Objects.equals(this.downloadable, displaySettings.downloadable) &&
        Objects.equals(this.format, displaySettings.format) &&
        Objects.equals(this.hasDeclineButton, displaySettings.hasDeclineButton) &&
        Objects.equals(this.hostOrigin, displaySettings.hostOrigin) &&
        Objects.equals(this.mustRead, displaySettings.mustRead) &&
        Objects.equals(this.mustView, displaySettings.mustView) &&
        Objects.equals(this.recordDeclineResponses, displaySettings.recordDeclineResponses) &&
        Objects.equals(this.requireAccept, displaySettings.requireAccept) &&
        Objects.equals(this.sendToEmail, displaySettings.sendToEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionButtonAlignment, allowClientOnly, allowedHosts, brandId, consentButtonText, consentText, declineButtonText, displayName, documentDisplay, downloadable, format, hasDeclineButton, hostOrigin, mustRead, mustView, recordDeclineResponses, requireAccept, sendToEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplaySettings {\n");
    
    sb.append("    actionButtonAlignment: ").append(toIndentedString(actionButtonAlignment)).append("\n");
    sb.append("    allowClientOnly: ").append(toIndentedString(allowClientOnly)).append("\n");
    sb.append("    allowedHosts: ").append(toIndentedString(allowedHosts)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    consentButtonText: ").append(toIndentedString(consentButtonText)).append("\n");
    sb.append("    consentText: ").append(toIndentedString(consentText)).append("\n");
    sb.append("    declineButtonText: ").append(toIndentedString(declineButtonText)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    documentDisplay: ").append(toIndentedString(documentDisplay)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    hasDeclineButton: ").append(toIndentedString(hasDeclineButton)).append("\n");
    sb.append("    hostOrigin: ").append(toIndentedString(hostOrigin)).append("\n");
    sb.append("    mustRead: ").append(toIndentedString(mustRead)).append("\n");
    sb.append("    mustView: ").append(toIndentedString(mustView)).append("\n");
    sb.append("    recordDeclineResponses: ").append(toIndentedString(recordDeclineResponses)).append("\n");
    sb.append("    requireAccept: ").append(toIndentedString(requireAccept)).append("\n");
    sb.append("    sendToEmail: ").append(toIndentedString(sendToEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

