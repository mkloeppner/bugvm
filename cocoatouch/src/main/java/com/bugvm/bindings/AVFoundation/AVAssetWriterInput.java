/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.bindings.AVFoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetWriterInput/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetWriterInputPtr extends Ptr<AVAssetWriterInput, AVAssetWriterInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetWriterInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAssetWriterInput() {}
    protected AVAssetWriterInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public AVAssetWriterInput(AVMediaType mediaType, AVAudioSettings outputSettings) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary()));
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public AVAssetWriterInput(AVMediaType mediaType, AVAudioSettings outputSettings, CMFormatDescription sourceFormatHint) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary(), sourceFormatHint));
    }
    public AVAssetWriterInput(AVMediaType mediaType, AVVideoSettings outputSettings) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary()));
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public AVAssetWriterInput(AVMediaType mediaType, AVVideoSettings outputSettings, CMFormatDescription sourceFormatHint) {
        super((SkipInit)null);
        initObject(init(mediaType, outputSettings.getDictionary(), sourceFormatHint));
    }
    
    
    public AVAudioSettings getOutputAudioSettings() {
        return new AVAudioSettings(getOutputSettings());
    }
    public AVVideoSettings getOutputVideoSettings() {
        return new AVVideoSettings(getOutputSettings());
    }
    /*<properties>*/
    @Property(selector = "mediaType")
    public native AVMediaType getMediaType();
    @Property(selector = "outputSettings")
    protected native NSDictionary<?, ?> getOutputSettings();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "sourceFormatHint")
    public native CMFormatDescription getSourceFormatHint();
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    @Property(selector = "isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    @Property(selector = "expectsMediaDataInRealTime")
    public native boolean expectsMediaDataInRealTime();
    @Property(selector = "setExpectsMediaDataInRealTime:")
    public native void setExpectsMediaDataInRealTime(boolean v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setNaturalSize:")
    public native void setNaturalSize(@ByVal CGSize v);
    @Property(selector = "transform")
    public native @ByVal CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal CGAffineTransform v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setPreferredVolume:")
    public native void setPreferredVolume(float v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "marksOutputTrackAsEnabled")
    public native boolean marksOutputTrackAsEnabled();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setMarksOutputTrackAsEnabled:")
    public native void setMarksOutputTrackAsEnabled(boolean v);
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Property(selector = "mediaTimeScale")
    public native int getMediaTimeScale();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @Property(selector = "setMediaTimeScale:")
    public native void setMediaTimeScale(int v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "preferredMediaChunkDuration")
    public native @ByVal CMTime getPreferredMediaChunkDuration();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByVal CMTime v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "preferredMediaChunkAlignment")
    public native @MachineSizedSInt long getPreferredMediaChunkAlignment();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "sampleReferenceBaseURL")
    public native NSURL getSampleReferenceBaseURL();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "performsMultiPassEncodingIfSupported")
    public native boolean performsMultiPassEncodingIfSupported();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPerformsMultiPassEncodingIfSupported:")
    public native void setPerformsMultiPassEncodingIfSupported(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "canPerformMultiplePasses")
    public native boolean canPerformMultiplePasses();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "currentPassDescription")
    public native AVAssetWriterInputPassDescription getCurrentPassDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMediaType:outputSettings:")
    protected native @Pointer long init(AVMediaType mediaType, NSDictionary<?, ?> outputSettings);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "initWithMediaType:outputSettings:sourceFormatHint:")
    protected native @Pointer long init(AVMediaType mediaType, NSDictionary<?, ?> outputSettings, CMFormatDescription sourceFormatHint);
    @WeaklyLinked
    @Method(selector = "requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReady(DispatchQueue queue, @Block Runnable block);
    @Method(selector = "appendSampleBuffer:")
    public native boolean appendSampleBuffer(CMSampleBuffer sampleBuffer);
    @Method(selector = "markAsFinished")
    public native void markAsFinished();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "canAddTrackAssociationWithTrackOfInput:type:")
    public native boolean canAddTrackAssociation(AVAssetWriterInput input, AVTrackAssociationType trackAssociationType);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "addTrackAssociationWithTrackOfInput:type:")
    public native void addTrackAssociation(AVAssetWriterInput input, AVTrackAssociationType trackAssociationType);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "respondToEachPassDescriptionOnQueue:usingBlock:")
    public native void respondToEachPassDescriptionOnQueue(DispatchQueue queue, @Block Runnable block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "markCurrentPassAsFinished")
    public native void markCurrentPassAsFinished();
    /*</methods>*/
}
