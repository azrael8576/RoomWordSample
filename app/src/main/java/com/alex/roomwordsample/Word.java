package com.alex.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.Nullable;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @Nullable
    @ColumnInfo(name = "word")
    private String mWord;
    public Word (@Nullable String word){ this.mWord = word; }
    public String getmWord() { return mWord; }
}

