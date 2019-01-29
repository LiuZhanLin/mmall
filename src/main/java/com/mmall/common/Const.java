package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

public class Const {
    public  static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface ProductListOrderBy {
        Set<String> PRICE_ASE_DESC = Sets.newHashSet("price_asc","price_desc");
    }

    public interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;  //管理员
    }

    public enum ProductStatusEnum{
        ON_SALE("在线",1);
        private String status;
        private int code;

        ProductStatusEnum(String status, int code) {
            this.status = status;
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public int getCode() {
            return code;
        }
    }
}
