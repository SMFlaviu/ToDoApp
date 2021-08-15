package com.flaviu.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.flaviu.todoapp.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider


@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

    class CallBack @Inject constructor(
        private val database: Provider<TaskDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            val dao = database.get().taskDao()

            applicationScope.launch {
                dao.insert(Task("Wash the dishes",completed = true))
                dao.insert(Task("Walk the dog"))
                dao.insert(Task("Do some sport",important = true))
                dao.insert(Task("Repair my bike", important = true))
            }
        }
    }

}