
# CsApiOrgReportTimesheetFileAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**timesheetStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**timesheetEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**timesheetId** | **Integer** |  |  [optional]
**documentS3SignedUrl** | **String** |  |  [optional]
**imageLargeS3SignedUrl** | **String** |  |  [optional]
**imageMediumS3SignedUrl** | **String** |  |  [optional]
**imageSmallS3SignedUrl** | **String** |  |  [optional]
**fileAttachmentId** | **Integer** |  |  [optional]
**userId** | **Integer** |  |  [optional]
**orgId** | **Integer** |  |  [optional]
**mobilePlatform** | [**MobilePlatformEnum**](#MobilePlatformEnum) | 0 &#x3D; Unknown, 1 &#x3D; iOS, 2 &#x3D; Android |  [optional]
**attachmentType** | [**AttachmentTypeEnum**](#AttachmentTypeEnum) | 1 &#x3D; Image, 30 &#x3D; WordDoc, 31 &#x3D; Pdf, 32 &#x3D; MSSpreadSheet, 33 &#x3D; MSPowerPoint, 34 &#x3D; RichTextFormat, 35 &#x3D; ZipFile, 100 &#x3D; Other |  [optional]
**notes** | **String** |  |  [optional]
**nonImageFilePath** | **String** |  |  [optional]
**imageLargeFilePath** | **String** |  |  [optional]
**imageMediumFilePath** | **String** |  |  [optional]
**imageSmallFilePath** | **String** |  |  [optional]
**originalFileName** | **String** |  |  [optional]
**latitude** | **Double** |  |  [optional]
**longitude** | **Double** |  |  [optional]
**dateUploaded** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dateImageCaptured** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**storageAllocationBytes** | **Long** |  |  [optional]


<a name="MobilePlatformEnum"></a>
## Enum: MobilePlatformEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2


<a name="AttachmentTypeEnum"></a>
## Enum: AttachmentTypeEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_30 | 30
NUMBER_31 | 31
NUMBER_32 | 32
NUMBER_33 | 33
NUMBER_34 | 34
NUMBER_35 | 35
NUMBER_100 | 100



