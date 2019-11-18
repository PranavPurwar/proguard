/*
 * ProGuard Core -- library to process Java bytecode.
 *
 * Copyright (c) 2002-2019 Guardsquare NV
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
package proguard.classfile.constant;

import proguard.classfile.*;
import proguard.classfile.constant.visitor.ConstantVisitor;

/**
 * This Constant represents a integer constant in the constant pool.
 *
 * @author Eric Lafortune
 */
public class IntegerConstant extends Constant
{
    public int u4value;


    /**
     * Creates an uninitialized IntegerConstant.
     */
    public IntegerConstant()
    {
    }


    /**
     * Creates a new IntegerConstant with the given integer value.
     */
    public IntegerConstant(int value)
    {
        u4value = value;
    }


    /**
     * Returns the integer value of this IntegerConstant.
     */
    public int getValue()
    {
        return u4value;
    }


    /**
     * Sets the integer value of this IntegerConstant.
     */
    public void setValue(int value)
    {
        u4value = value;
    }


    // Implementations for Constant.

    public int getTag()
    {
        return ClassConstants.CONSTANT_Integer;
    }

    public void accept(Clazz clazz, ConstantVisitor constantVisitor)
    {
        constantVisitor.visitIntegerConstant(clazz, this);
    }
}