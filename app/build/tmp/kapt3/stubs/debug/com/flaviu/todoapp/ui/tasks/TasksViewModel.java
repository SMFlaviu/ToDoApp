package com.flaviu.todoapp.ui.tasks;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/flaviu/todoapp/ui/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskDao", "Lcom/flaviu/todoapp/data/TaskDao;", "(Lcom/flaviu/todoapp/data/TaskDao;)V", "tasks", "Landroidx/lifecycle/LiveData;", "", "Lcom/flaviu/todoapp/data/Task;", "getTasks", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final com.flaviu.todoapp.data.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.flaviu.todoapp.data.Task>> tasks = null;
    
    @javax.inject.Inject()
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.flaviu.todoapp.data.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.flaviu.todoapp.data.Task>> getTasks() {
        return null;
    }
}