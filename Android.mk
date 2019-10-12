LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := \
    $(call all-java-files-under, src) \
    $(call all-logtags-files-under, src)

LOCAL_USE_AAPT2 := true

LOCAL_MODULE := VendorSupportLib

LOCAL_SHARED_ANDROID_LIBRARIES := \
    androidx.core_core \
    androidx.preference_preference \
    androidx.appcompat_appcompat \
    androidx.recyclerview_recyclerview \

LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res

LOCAL_JAR_EXCLUDED_FILES := none

include $(BUILD_STATIC_JAVA_LIBRARY)
