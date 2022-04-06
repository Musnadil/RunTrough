package com.musnadil.runtrough.repository

import androidx.annotation.WorkerThread
import com.musnadil.runtrough.dao.WordDao
import com.musnadil.runtrough.entity.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
