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
package com.bugvm.bindings.AudioUnit;

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
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUConnection/*</name>*/ 
    extends /*<extends>*/Struct<AUConnection>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUConnectionPtr extends Ptr<AUConnection, AUConnectionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUConnection() {}
    public AUConnection(AudioUnit sourceAudioUnit, int sourceOutputNumber, int destInputNumber) {
        this.setSourceAudioUnit(sourceAudioUnit);
        this.setSourceOutputNumber(sourceOutputNumber);
        this.setDestInputNumber(destInputNumber);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native AudioUnit getSourceAudioUnit();
    @StructMember(0) public native AUConnection setSourceAudioUnit(AudioUnit sourceAudioUnit);
    @StructMember(1) public native int getSourceOutputNumber();
    @StructMember(1) public native AUConnection setSourceOutputNumber(int sourceOutputNumber);
    @StructMember(2) public native int getDestInputNumber();
    @StructMember(2) public native AUConnection setDestInputNumber(int destInputNumber);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
