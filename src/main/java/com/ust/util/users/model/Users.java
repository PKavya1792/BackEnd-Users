package com.ust.util.users.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
        private  int id;
        private String uname;
        private String pw;

        Users(){};

        public Users(@JsonProperty("id") int id, @JsonProperty("uname") String uname, @JsonProperty("pw") String pw) {
            this.id = id;
            this.uname = uname;
            this.pw = pw;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public String getPw() {
            return pw;
        }

        public void setPw(String pw) {
            this.pw = pw;
        }

        @Override
        public String toString() {
            return "Users{" +
                    "id=" + id +
                    ", uname='" + uname + '\'' +
                    ", pw='" + pw + '\'' +
                    '}';
        }
    }


