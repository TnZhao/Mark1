package com.starkindustries.common;

import com.google.common.collect.Sets;

import java.util.Set;

public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface ProductListOrderBy {
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "price_asc");
    }

    public interface Role {
        int ROLE_CUSTOMER = 0; // 普通用户
        int ROLE_ADMIN = 1;    // 管理员
    }

    public enum ProductStatusEnum {
        ON_SALE("在线", 1);
        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        ProductStatusEnum(String value, int code) {
            this.value = value;
            this.code = code;
        }
    }

}
