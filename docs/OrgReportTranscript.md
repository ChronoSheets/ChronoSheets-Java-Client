

# OrgReportTranscript

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finishedJob** | **Boolean** |  |  [optional]
**completedProcessing** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**startedProcessing** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**transcriptionId** | **Integer** |  |  [optional]
**jobName** | **String** |  |  [optional]
**contents** | **String** |  |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional]
**transcriptionStatus** | [**TranscriptionStatusEnum**](#TranscriptionStatusEnum) |  |  [optional]
**username** | **String** |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
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
**audioDurationSeconds** | **Integer** |  |  [optional]



## Enum: MediaTypeEnum

Name | Value
---- | -----
OTHER | &quot;Other&quot;
MP3 | &quot;Mp3&quot;
MP4 | &quot;Mp4&quot;
WAV | &quot;Wav&quot;
FLAC | &quot;Flac&quot;



## Enum: TranscriptionStatusEnum

Name | Value
---- | -----
SAVED | &quot;Saved&quot;
PROCESSING | &quot;Processing&quot;
COMPLETED | &quot;Completed&quot;
FAILEDWITHERROR | &quot;FailedWithError&quot;



## Enum: MobilePlatformEnum

Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
IOS | &quot;iOS&quot;
ANDROID | &quot;Android&quot;



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



