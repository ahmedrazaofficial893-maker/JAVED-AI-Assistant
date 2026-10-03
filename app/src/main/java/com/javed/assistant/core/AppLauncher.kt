package com.javed.assistant.core

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import java.util.Locale

class AppLauncher(private val context: Context) {

    fun launchApp(appName: String): Boolean {
        return try {
            when (appName.lowercase(Locale.getDefault())) {
                "youtube", "یوٹیوب" -> launchYouTube()
                "chrome", "کروم" -> launchChrome()
                "whatsapp", "واٹس ایپ" -> launchWhatsApp()
                "settings", "ترتیبات" -> launchSettings()
                else -> {
                    Toast.makeText(context, "App نہیں ملا", Toast.LENGTH_SHORT).show()
                    false
                }
            }
        } catch (e: Exception) {
            Toast.makeText(context, "خرابی: ${e.message}", Toast.LENGTH_SHORT).show()
            false
        }
    }

    fun searchOnYouTube(query: String): Boolean {
        return try {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/results?search_query=${Uri.encode(query)}")
            )
            context.startActivity(intent)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun searchOnGoogle(query: String): Boolean {
        return try {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/search?q=${Uri.encode(query)}")
            )
            context.startActivity(intent)
            true
        } catch (e: Exception) {
            false
        }
    }

    private fun launchYouTube(): Boolean {
        return try {
            val intent = context.packageManager.getLaunchIntentForPackage("com.google.android.youtube")
            if (intent != null) {
                context.startActivity(intent)
                true
            } else {
                searchOnYouTube("home")
            }
        } catch (e: Exception) {
            false
        }
    }

    private fun launchChrome(): Boolean {
        return try {
            val intent = context.packageManager.getLaunchIntentForPackage("com.android.chrome")
            if (intent != null) {
                context.startActivity(intent)
                true
            } else {
                context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")))
                true
            }
        } catch (e: Exception) {
            false
        }
    }

    private fun launchWhatsApp(): Boolean {
        return try {
            val intent = context.packageManager.getLaunchIntentForPackage("com.whatsapp")
            if (intent != null) {
                context.startActivity(intent)
                true
            } else {
                Toast.makeText(context, "WhatsApp انسٹال نہیں ہے", Toast.LENGTH_SHORT).show()
                false
            }
        } catch (e: Exception) {
            false
        }
    }

    private fun launchSettings(): Boolean {
        return try {
            context.startActivity(Intent(android.provider.Settings.ACTION_SETTINGS))
            true
        } catch (e: Exception) {
            false
        }
    }
}
