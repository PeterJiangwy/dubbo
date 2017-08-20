/*
 * Copyright 1999-2011 Alibaba Group.
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
package com.alibaba.dubbo.common.utils;

/**
 * MyEnum
 * 
 * @author william.liangf
 */
public enum MyEnum {

    // add by Peter, 20161227.
    ACCESS("ACCESS", "准入审核"),

    REAL_NAME("REAL_NAME", "实名审核"),

    BLACK_LIST("BLACK_LIST", "黑名单审核"),

    POLICY("POLICY", "策略审核"),

    MANUAL("MANUAL", "人工审核"),

    // 暂时没有的, 后期会增加.
    GREY_LIST("GREY_LIST", "灰名单审核"),

    CREDIT("CREDIT", "征信审核"),

    ASSET("ASSET", "资产审核"),

    PORTRAYAL("PORTRAYAL", "画像审核"),

    EDUCATION("EDUCATION", "教育审核"),

    TRIP("TRIP", "出行审核"),

    LOCATION("LOCATION", "位置信息审核"),

    // 虚拟审核，并没有实质进行审核，也不会生成审核记录
    VIRTUAL("VIRTUAL", "虚拟审核"),
    ;

    /**
     * 根据编码获取枚举.
     *
     * @param code 枚举定义的编码
     * @return 查找到的枚举
     */
    public static MyEnum getEnum(String code) {
        for(MyEnum a : MyEnum.values()) {
            if (a.code.equals(code)) {
                return a;
            }
        }
        throw new IllegalArgumentException("No enum code '" + code + "'. " + MyEnum.class);
    }

    /** The code. */
    private String code;

    /** The desc. */
    private String desc;

    private MyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return code;
    }
}