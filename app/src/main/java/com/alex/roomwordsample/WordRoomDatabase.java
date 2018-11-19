package com.alex.roomwordsample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Word.class},version = 1)
public abstract class WordRoomDatabase extends RoomDatabase {
    public abstract WordDao wordDao();
    private static volatile WordRoomDatabase INSTANCE;
    static WordRoomDatabase getDatabase(final Context context){
        synchronized (WordRoomDatabase.class){
            if (INSTANCE == null) {
                // Create database here
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        WordRoomDatabase.class, "word_database")
                        .build();
            }
        }
        return INSTANCE;
    }
}

