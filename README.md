# 🤖 JAVED - Personal AI Assistant

ایک مکمل اردو language AI assistant Android app جو JARVIS جیسی functionality فراہم کرتا ہے۔

## 📋 خصوصیات (Features)

### 1. 🎤 اردو Voice Assistant
- Urdu/Roman Urdu/English voice commands
- Real-time speech-to-text conversion
- Natural language intent detection
- Text-to-speech response in Urdu

### 2. 📱 Android App Control
- YouTube, Chrome, Settings, WhatsApp launch
- App intent-based automation
- No security bypass (authentic Android intents)
- Permission-aware execution

### 3. 📝 Personal Manager
- Tasks: Create, complete, delete, list (with priority & due dates)
- Reminders: Set, list, notifications
- Notes: Voice-based notes, search, edit/delete
- Calendar: View events, create reminders (with permission)

### 4. 🧠 AI Engine
- Natural language understanding
- Intent detection (app_launch, task_create, reminder_set, etc.)
- Context awareness
- Multi-step task execution
- Conversation history

### 5. 🎯 JAVED Modes
- 🧠 JAVED AI - General conversation
- 👨‍💼 JAVED Manager - Task & productivity
- 👨‍💻 JAVED Developer - Code & debugging help
- 🔎 JAVED Researcher - Web research
- ⚙️ JAVED Automation - Automated workflows
- 🎓 JAVED Teacher - Learning & tutorials

### 6. 🎨 Modern JARVIS UI
- Animated AI orb/waveform
- Listening → Thinking → Speaking states
- Quick action buttons
- Urdu-first headings
- Dark futuristic theme

### 7. ✅ Smart Confirmation System
- Low-risk actions (app launch, search): Direct execution
- Sensitive actions (delete, send): User confirmation required
- Transaction-safe workflow

### 8. 🔒 Security-First
- No password/OTP bypass
- No unauthorized access
- Permission-aware execution
- Secure data storage
- Clear error messages

---

## 🏗️ Architecture

```text
JAVED/
├── app/
│   ├── src/main/
│   │   ├── AndroidManifest.xml
│   │   ├── java/com/javed/
│   │   │   ├── MainActivity.kt
│   │   │   ├── JavedAssistant.kt
│   │   │   ├── VoiceManager.kt
│   │   │   ├── IntentEngine.kt
│   │   │   ├── ActionEngine.kt
│   │   │   ├── AppLauncher.kt
│   │   │   ├── PermissionManager.kt
│   │   │   ├── database/
│   │   │   │   ├── TaskDao.kt
│   │   │   │   ├── ReminderDao.kt
│   │   │   │   ├── NoteDao.kt
│   │   │   │   └── JavedDatabase.kt
│   │   │   ├── models/
│   │   │   │   ├── Task.kt
│   │   │   │   ├── Reminder.kt
│   │   │   │   ├── Note.kt
│   │   │   │   └── Intent.kt
│   │   │   ├── ui/
│   │   │   │   ├── screens/
│   │   │   │   │   ├── HomeScreen.kt
│   │   │   │   │   ├── TasksScreen.kt
│   │   │   │   │   ├── RemindersScreen.kt
│   │   │   │   │   └── NotesScreen.kt
│   │   │   │   └── components/
│   │   │   │       ├── AIOrb.kt
│   │   │   │       └── QuickActions.kt
│   │   │   └── utils/
│   │   │       ├── UrduProcessor.kt
│   │   │       ├── Constants.kt
│   │   │       └── Extensions.kt
│   │   └── res/
│   │       ├── layout/
│   │       ├── values/
│   │       └── drawable/
│   └── build.gradle.kts
├── gradle/
└── settings.gradle.kts
```

---

## 🚀 Quick Start

### Prerequisites
- Android Studio Giraffe+
- Android SDK 28+
- Kotlin 1.9+
- Google Play Services for ML Kit (speech-to-text)

### Setup

```bash
git clone https://github.com/ahmedrazaofficial893-maker/JAVED-AI-Assistant.git
cd JAVED-AI-Assistant
# Open in Android Studio
# Build & Run on emulator or device
```

### First Run
1. Open JAVED app
2. Grant permissions: Microphone, Storage, Calendar (if needed)
3. Say: "السلام علیکم" or "Hello Javed"
4. JAVED will respond with greeting

---

## 📖 Usage Examples

### Voice Commands

```text
"Javed, YouTube کھولو"
→ YouTube app launches

"Javed, Chrome کھولو"
→ Chrome browser opens

"Javed, میری آج کی tasks بتاؤ"
→ Lists today's tasks

"Javed, ایک reminder لگا دو 2 گھنٹے میں"
→ Creates 2-hour reminder

"Javed, Python tutorial YouTube پر ڈھونڈو"
→ Searches YouTube for Python tutorials

"Javed, اردو میں نوٹ بناؤ میرے نئے ایڈیاز کے بارے میں"
→ Creates voice note

"Javed, میرا ایک email تیار کرو"
→ Drafts email (user confirms before sending)
```

---

## 🔧 Modes Configuration

```xml
<modes>
  <mode id="ai" label="JAVED AI" icon="@drawable/ic_ai" />
  <mode id="manager" label="JAVED Manager" icon="@drawable/ic_manager" />
  <mode id="developer" label="JAVED Developer" icon="@drawable/ic_dev" />
  <mode id="researcher" label="JAVED Researcher" icon="@drawable/ic_search" />
  <mode id="automation" label="JAVED Automation" icon="@drawable/ic_automation" />
  <mode id="teacher" label="JAVED Teacher" icon="@drawable/ic_teacher" />
</modes>
```

---

## 📊 Database Schema

### Tasks Table
```sql
CREATE TABLE tasks (
  id INTEGER PRIMARY KEY,
  title TEXT,
  description TEXT,
  priority INTEGER,
  due_date LONG,
  completed BOOLEAN,
  created_at LONG
);
```

### Reminders Table
```sql
CREATE TABLE reminders (
  id INTEGER PRIMARY KEY,
  title TEXT,
  time LONG,
  recurring TEXT,
  notified BOOLEAN
);
```

### Notes Table
```sql
CREATE TABLE notes (
  id INTEGER PRIMARY KEY,
  content TEXT,
  voice_uri TEXT,
  created_at LONG,
  updated_at LONG
);
```

---

## 🔐 Permissions

Required permissions (requested on-demand):

```xml
<uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES" />
<uses-permission android:name="android.permission.READ_CALENDAR" />
<uses-permission android:name="android.permission.WRITE_CALENDAR" />
<uses-permission android:name="android.permission.POST_NOTIFICATIONS" />
```

---

## 🛡️ Security Policy

✅ Allowed:
- App launching via Android intents
- Web search via Chrome/Browser intent
- Local data storage (tasks, reminders, notes)
- Voice command processing

❌ Not allowed:
- Password/OTP bypass
- Unauthorized access to other apps
- Biometric authentication bypass
- Private data collection without consent
- Security restriction defeat

---

## 📦 Dependencies

```gradle
dependencies {
  implementation 'androidx.core:core-ktx:1.12.0'
  implementation 'androidx.appcompat:appcompat:1.6.1'
  implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.2'
  implementation 'androidx.compose.ui:ui:1.6.0'
  implementation 'androidx.compose.material3:material3:1.1.0'
  implementation 'androidx.room:room-runtime:2.6.0'
  kapt 'androidx.room:room-compiler:2.6.0'
  implementation 'com.google.mlkit:speech-recognition:16.2.0-beta1'
  implementation 'com.squareup.okhttp3:okhttp:4.11.0'
  implementation 'com.google.code.gson:gson:2.10.1'
}
```

---

## 🎯 Roadmap

- [x] Project setup & architecture
- [ ] Voice input (ML Kit integration)
- [ ] Intent engine implementation
- [ ] App launcher module
- [ ] Task manager (CRUD)
- [ ] Reminder system
- [ ] Notes module
- [ ] AI reasoning layer
- [ ] JARVIS UI
- [ ] Urdu language processing
- [ ] Multi-mode support
- [ ] Confirmation system
- [ ] Security & permission handling
- [ ] Testing suite
- [ ] Documentation

---

## 🤝 Contributing

Issues, PRs, and suggestions are welcome.

```bash
git checkout -b feature/your-feature
git commit -m "Add: your feature"
git push origin feature/your-feature
```

---

## 📄 License

MIT License - See LICENSE file

---

## 👨‍💻 Author

**Ahmed Raza** - AI Assistant Developer  
GitHub: [@ahmedrazaofficial893-maker](https://github.com/ahmedrazaofficial893-maker)

---

**Wa alaikum assalam! میں JAVED ہوں، آپ کا AI assistant۔** 🤖
