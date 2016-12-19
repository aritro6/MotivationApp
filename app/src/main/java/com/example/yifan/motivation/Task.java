package com.example.yifan.motivation;

import java.util.Date;

/**
 * Created by Yifan on 12/19/2016.
 */

public class Task {
    private Date dueDate;
    private String taskStr;

    public Task(Date dueDate, String taskStr) {
        this.dueDate = dueDate;
        this.taskStr = taskStr;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getTaskStr() {
        return taskStr;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setTaskStr(String taskStr) {
        this.taskStr = taskStr;
    }
}
