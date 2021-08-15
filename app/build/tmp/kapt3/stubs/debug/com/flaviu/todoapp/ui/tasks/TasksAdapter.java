package com.flaviu.todoapp.ui.tasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/flaviu/todoapp/ui/tasks/TasksAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/flaviu/todoapp/data/Task;", "Lcom/flaviu/todoapp/ui/tasks/TasksAdapter$TasksViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "TasksViewHolder", "app_debug"})
public final class TasksAdapter extends androidx.recyclerview.widget.ListAdapter<com.flaviu.todoapp.data.Task, com.flaviu.todoapp.ui.tasks.TasksAdapter.TasksViewHolder> {
    
    public TasksAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.flaviu.todoapp.ui.tasks.TasksAdapter.TasksViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.flaviu.todoapp.ui.tasks.TasksAdapter.TasksViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/flaviu/todoapp/ui/tasks/TasksAdapter$TasksViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/flaviu/todoapp/databinding/ItemTaskBinding;", "(Lcom/flaviu/todoapp/databinding/ItemTaskBinding;)V", "bind", "", "task", "Lcom/flaviu/todoapp/data/Task;", "app_debug"})
    public static final class TasksViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.flaviu.todoapp.databinding.ItemTaskBinding binding = null;
        
        public TasksViewHolder(@org.jetbrains.annotations.NotNull()
        com.flaviu.todoapp.databinding.ItemTaskBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.flaviu.todoapp.data.Task task) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/flaviu/todoapp/ui/tasks/TasksAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/flaviu/todoapp/data/Task;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.flaviu.todoapp.data.Task> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.flaviu.todoapp.data.Task oldItem, @org.jetbrains.annotations.NotNull()
        com.flaviu.todoapp.data.Task newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.flaviu.todoapp.data.Task oldItem, @org.jetbrains.annotations.NotNull()
        com.flaviu.todoapp.data.Task newItem) {
            return false;
        }
    }
}