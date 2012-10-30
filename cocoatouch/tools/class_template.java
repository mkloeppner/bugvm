/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.foo;

/*<imports>*/
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<library>*/@Library("Foo")/*</library>*/
@NativeClass public class /*<name>*/ TheName /*</name>*/ 
    extends /*<extends>*/ Object /*</extends>*/ 
    /*<implements>*/ implements A, B, C /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ TheName /*</name>*/.class);
    }

    private static final boolean X86 = Bro.IS_X86;
    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ TheName /*</name>*/.class);

    /*<constructors>*/
    /*</constructors>*/
    /*<properties>*/
    /*</properties>*/
    /*<methods>*/
    /*</methods>*/
    /*<callbacks>*/
    /*</callbacks>*/

}
