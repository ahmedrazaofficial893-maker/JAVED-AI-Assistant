package com.javed.assistant.repository

import com.javed.assistant.data.dao.ChallengeDao
import com.javed.assistant.data.models.Challenge
import com.javed.assistant.data.models.ChallengeAttempt
import com.javed.assistant.data.models.UserProgress
import kotlinx.coroutines.flow.Flow

class ChallengeRepository(private val challengeDao: ChallengeDao) {
    suspend fun getChallengeById(id: String): Challenge? = challengeDao.getChallengeById(id)
    suspend fun getDailyChallenge(): Challenge? = challengeDao.getDailyChallenge()
    suspend fun getRandomChallenge(): Challenge? = challengeDao.getRandomChallenge()
    suspend fun insertChallenge(challenge: Challenge) = challengeDao.insertChallenge(challenge)
    suspend fun insertChallenges(challenges: List<Challenge>) = challengeDao.insertChallenges(challenges)
    suspend fun insertAttempt(attempt: ChallengeAttempt) = challengeDao.insertAttempt(attempt)
    fun getAttemptsByChallengeId(challengeId: String): Flow<List<ChallengeAttempt>> = challengeDao.getAttemptsByChallengeId(challengeId)
    suspend fun getUserProgress(): UserProgress? = challengeDao.getUserProgress()
    suspend fun upsertUserProgress(progress: UserProgress) = challengeDao.upsertUserProgress(progress)
}
