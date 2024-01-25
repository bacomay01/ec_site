package jp.ac.morijyobi.last_kadai.bean.form;

import jakarta.validation.constraints.NotBlank;

public class UserForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
