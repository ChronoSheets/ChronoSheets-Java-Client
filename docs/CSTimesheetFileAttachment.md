
# CSTimesheetFileAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timesheetId** | **Integer** |  |  [optional]
**documentS3SignedUrl** | **String** |  |  [optional]
**imageLargeS3SignedUrl** | **String** |  |  [optional]
**imageMediumS3SignedUrl** | **String** |  |  [optional]
**imageSmallS3SignedUrl** | **String** |  |  [optional]
**timesheetStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**timesheetEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**fileAttachmentId** | **Integer** |  |  [optional]
**userId** | **Integer** |  |  [optional]
**orgId** | **Integer** |  |  [optional]
**mobilePlatform** | [**MobilePlatformEnum**](#MobilePlatformEnum) |  |  [optional]
**attachmentType** | [**AttachmentTypeEnum**](#AttachmentTypeEnum) |  |  [optional]
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
UNKNOWN | &quot;Unknown&quot;
IOS | &quot;iOS&quot;
ANDROID | &quot;Android&quot;


<a name="AttachmentTypeEnum"></a>
## Enum: AttachmentTypeEnum
Name | Value
---- | -----
IMAGE | &quot;Image&quot;
WORDDOC | &quot;WordDoc&quot;
PDF | &quot;Pdf&quot;
MSSPREADSHEET | &quot;MSSpreadSheet&quot;
MSPOWERPOINT | &quot;MSPowerPoint&quot;
RICHTEXTFORMAT | &quot;RichTextFormat&quot;
ZIPFILE | &quot;ZipFile&quot;
OTHER | &quot;Other&quot;
AUDIO | &quot;Audio&quot;



