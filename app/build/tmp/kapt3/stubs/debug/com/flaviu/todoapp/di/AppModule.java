package com.flaviu.todoapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/flaviu/todoapp/di/AppModule;", "", "()V", "provideApplicationScope", "Lkotlinx/coroutines/CoroutineScope;", "provideDatabase", "Lcom/flaviu/todoapp/data/TaskDatabase;", "app", "Landroid/app/Application;", "callback", "Lcom/flaviu/todoapp/data/TaskDatabase$CallBack;", "provideTaskDao", "Lcom/flaviu/todoapp/data/TaskDao;", "db", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.flaviu.todoapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.flaviu.todoapp.data.TaskDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.flaviu.todoapp.data.TaskDatabase.CallBack callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.flaviu.todoapp.data.TaskDao provideTaskDao(@org.jetbrains.annotations.NotNull()
    com.flaviu.todoapp.data.TaskDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    @ApplicationScope()
    public final kotlinx.coroutines.CoroutineScope provideApplicationScope() {
        return null;
    }
}