package com.example.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Exam04Form {
    @NotBlank(message = "名前は必須です！")
    private String name;
    @NotBlank(message = "年齢は必須です！")
    private String age;
    @Size(min = 1, max = 127, message = "1文字以上、127文字以内で書いてください！！")
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    public int getIntAge(){
        return Integer.parseInt(age);
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
