package com.javed.assistant.core

import java.util.Locale
import com.javed.assistant.utils.Constants

class ConversationManager {
    private val messages = mutableListOf<Pair<String, String>>()
    private var conversationContext = ""

    fun addMessage(userMessage: String, assistantResponse: String) {
        messages.add(userMessage to assistantResponse)
        updateContext(userMessage)
    }

    fun getConversationHistory(): List<String> {
        return messages.map { "User: ${it.first}\nJAVED: ${it.second}" }
    }

    fun getContext(): String = conversationContext

    private fun updateContext(message: String) {
        val lower = message.lowercase(Locale.getDefault())
        conversationContext = when {
            lower.contains("python") || lower.contains("پائتھن") -> "Python Learning"
            lower.contains("android") || lower.contains("اینڈرائیڈ") -> "Android Development"
            lower.contains("task") || lower.contains("کام") -> "Task Management"
            else -> conversationContext
        }
    }

    fun clear() {
        messages.clear()
        conversationContext = ""
    }
}
