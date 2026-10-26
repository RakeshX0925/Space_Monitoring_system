# 🚀 Space Mission Monitoring System

<p align="center">
  <img src="https://img.shields.io/badge/SPACE_MISSION_CONTROL-Online-101827?style=for-the-badge" alt="Space Mission Control">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Project-Console_Application-6C63FF?style=for-the-badge" alt="Console application">
</p>

<h2 align="center">🌌 Every mission begins with a countdown.</h2>

<p align="center">
  A Java console-based space mission simulator for creating, prioritising, and running launch, orbit, and landing missions — with countdowns, simulated outcomes, mission history, and a score system.
</p>

<p align="center"><a href="https://github.com/RakeshX0925/Space_Monitoring_system"><strong>Explore the Repository →</strong></a></p>

---

## 🪐 About the project

**Space Mission Monitoring System** is a Java project inspired by space exploration and mission control. It models different mission types using object-oriented programming and lets users manage missions from an interactive command-line menu.

Add a mission, watch the countdown, see whether the mission succeeds or fails, then review the mission history and score. This project demonstrates Java classes, inheritance, polymorphism, collections, and control flow in a space-themed simulation.

## ✨ Mission control features

| Feature | Description |
| --- | --- |
| 🛰️ **Mission creation** | Add a launch, satellite orbit, or rover landing mission. |
| 🎚️ **Priority scheduling** | Missions are sorted by priority before execution: 1 = High, 2 = Medium, 3 = Low. |
| ⏱️ **Launch countdown** | Each mission runs through a short countdown before its details are displayed. |
| 🎲 **Simulated outcomes** | Each mission is randomly marked successful or failed. |
| 📜 **Mission history** | Review recorded outcomes and failure reasons for completed missions. |
| 🏆 **Scoring system** | Successful missions award 10 points; failed missions deduct 5 points. |
| ⚠️ **Failure scenarios** | Simulated failures include fuel shortage, engine failure, bad weather, communication loss, and navigation errors. |

> **Note:** This is an educational simulation. Mission outcomes are random and do not represent real spacecraft telemetry or live space data.

## 🧰 Built with

- **Java** — application logic and object-oriented design
- **Java Collections Framework** — `ArrayList` for missions and history
- **`Comparator`** — priority-based mission sorting
- **`Random`** — simulated mission outcomes
- **`Scanner`** — interactive console input

## 🧠 Java concepts demonstrated

- Classes and objects
- Inheritance through specialised mission classes
- Method overriding and runtime polymorphism
- Encapsulation with private fields and getter methods
- ArrayLists and collection sorting
- Loops, conditional logic, and switch statements
- Randomised simulation and basic exception handling

## 📁 Project structure

```text
Space_Monitoring_system/
├── Main.java              # Main menu and mission workflow
├── Main.class             # Compiled Java bytecode
├── Mission.class          # Base mission class
├── LaunchMission.class    # Launch mission type
├── OrbitMission.class     # Orbit mission type
└── LandingMission.class   # Landing mission type
```

The mission classes are currently defined in `Main.java`; their `.class` files are compiled output. If you change the Java source, recompile before running the program.

## 🚀 Get started

### 1. Install Java

Install a JDK and verify that Java and the compiler are available:

```bash
java -version
javac -version
```

### 2. Clone the repository

```bash
git clone https://github.com/RakeshX0925/Space_Monitoring_system.git
cd Space_Monitoring_system
```

### 3. Compile the source

```bash
javac Main.java
```

### 4. Run mission control

```bash
java Main
```

No external libraries or build tools are needed for this version.

## 🎮 How to use it

When the program starts, choose an option from the menu:

```text
// SPACE MISSION SYSTEM //
I.   Add Mission
II.  Run Missions
III. View History
IV.  View Score
V.   Exit
```

Use the numbered choices when prompted:

1. **Add Mission** — choose Launch, Orbit, or Landing, then enter a name, duration, and priority.
2. **Run Missions** — execute queued missions in priority order.
3. **View History** — display recorded success and failure results.
4. **View Score** — see the current score.
5. **Exit** — end the application.

### 🏆 Scoring rules

| Result | Score change |
| --- | ---: |
| Mission succeeds | +10 |
| Mission fails | -5 |

Mission results are random each time they run, so different runs can produce different histories and scores.

## 🔭 Ideas for future upgrades

Potential next steps include:

- Save mission history between program runs using file storage or a database.
- Add input validation for mission types, durations, and priorities.
- Let users cancel, edit, or remove missions before launch.
- Add summary statistics and a mission success-rate report.
- Separate each class into its own `.java` file for a cleaner project structure.
- Introduce more mission types and configurable simulation rules.
- Build a graphical dashboard for mission status and history.

These are possible enhancements, not features currently implemented.

## 🤝 Contributing

Suggestions and improvements are welcome. Create a branch, make your update, and submit a pull request with a clear description of the change.

## 👨‍🚀 Author

**RakeshX0925**  
GitHub: [@RakeshX0925](https://github.com/RakeshX0925)  
Project: [Space_Monitoring_system](https://github.com/RakeshX0925/Space_Monitoring_system)

---

<p align="center">
  <strong>🌠 Built for curious minds and future space explorers.</strong>
  <br>
  <em>Code the mission. Run the countdown. Explore beyond.</em>
</p>
