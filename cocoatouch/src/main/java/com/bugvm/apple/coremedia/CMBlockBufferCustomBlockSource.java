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
package com.bugvm.apple.coremedia;

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
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMBlockBufferCustomBlockSource/*</name>*/ 
    extends /*<extends>*/Struct<CMBlockBufferCustomBlockSource>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMBlockBufferCustomBlockSourcePtr extends Ptr<CMBlockBufferCustomBlockSource, CMBlockBufferCustomBlockSourcePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final int Version = 0;
    /*</constants>*/
    /*<constructors>*/
    public CMBlockBufferCustomBlockSource() {}
    public CMBlockBufferCustomBlockSource(int version, FunctionPtr AllocateBlock, FunctionPtr FreeBlock, VoidPtr refCon) {
        this.setVersion(version);
        this.setAllocateBlock(AllocateBlock);
        this.setFreeBlock(FreeBlock);
        this.setRefCon(refCon);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getVersion();
    @StructMember(0) public native CMBlockBufferCustomBlockSource setVersion(int version);
    @StructMember(1) public native FunctionPtr getAllocateBlock();
    @StructMember(1) public native CMBlockBufferCustomBlockSource setAllocateBlock(FunctionPtr AllocateBlock);
    @StructMember(2) public native FunctionPtr getFreeBlock();
    @StructMember(2) public native CMBlockBufferCustomBlockSource setFreeBlock(FunctionPtr FreeBlock);
    @StructMember(3) public native VoidPtr getRefCon();
    @StructMember(3) public native CMBlockBufferCustomBlockSource setRefCon(VoidPtr refCon);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
