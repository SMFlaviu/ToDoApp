package com.flaviu.todoapp.data;

import java.lang.System;

@androidx.room.Database(entities = {com.flaviu.todoapp.data.Task.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/flaviu/todoapp/data/TaskDatabase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lcom/flaviu/todoapp/data/TaskDao;", "CallBack", "app_debug"})
public abstract class TaskDatabase extends androidx.room.RoomDatabase {
    
    public TaskDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.flaviu.todoapp.data.TaskDao taskDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/flaviu/todoapp/data/TaskDatabase$CallBack;", "Landroidx/room/RoomDatabase$Callback;", "database", "Ljavax/inject/Provider;", "Lcom/flaviu/todoapp/data/TaskDatabase;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljavax/inject/Provider;Lkotlinx/coroutines/CoroutineScope;)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class CallBack extends androidx.room.RoomDatabase.Callback {
        private final javax.inject.Provider<com.flaviu.todoapp.data.TaskDatabase> database = null;
        private final kotlinx.coroutines.CoroutineScope applicationScope = null;
        
        @javax.inject.Inject()
        public CallBack(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.flaviu.todoapp.data.TaskDatabase> database, @org.jetbrains.annotations.NotNull()
        @com.flaviu.todoapp.di.ApplicationScope()
        kotlinx.coroutines.CoroutineScope applicationScope) {
            super();
        }
        
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
    }
}