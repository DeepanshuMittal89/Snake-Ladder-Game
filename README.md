# 🐍 Ladder and Snake Game 🎲

Welcome to the **Ladder and Snake Game**, a console-based Java game that allows you to enjoy the classic board game with:
- One Player (vs Computer)
- Two Player Mode
- User Authentication (Sign Up / Log In)

> This is a fun, interactive game built entirely using Java core concepts!

---

## 📋 Features

- 👤 **User Account System**: Sign up and log in with validations
- 🔐 **Password Validation**: Requires uppercase, lowercase, number, and special character
- 🎮 **Game Modes**:
  - One player vs Computer
  - Two player mode
- 🎲 **Dice Rolling Mechanism**
- 🐍 **Snakes and Ladders**: Predefined snake and ladder positions
- 📟 **Text-based Board Display** on the console
- 💡 **Input Validation** throughout for better UX

---

## 🧩 How to Play

### 🪜 Ladders:
Land on a square with a ladder to jump ahead!

### 🐍 Snakes:
Land on a snake’s head and slide down!

### 🎯 Win Condition:
Reach **exactly 100** to win the game.

---

## 🔧 How to Run

1. **Clone this repository:**
   ```bash
   git clone https://github.com/your-username/Ladder-And-Snake-Game.git
   cd Ladder-And-Snake-Game
2. **Compile and run the game:**
   javac Ladder_And_Snake_Game.java
   java Ladder_And_Snake_Game


   🧠 Code Structure Overview
main() handles the signup/login menu and user flow

startGame() launches the game board and mode selection

one_player() and two_players() handle respective game loops

player_position() manages movement and snake/ladder logic

rollDice() returns a random value from 1 to 6

📌 Snakes & Ladders Configuration
Ladders (climb up):
From	To
1	22
7	11
16	92
28	53
31	50
38	79
61	77
69	88
74	95

Snakes (go down):
From	To
30	13
40	19
58	36
66	49
81	60
91	75
98	3


📸 **Sample Console Output**

Welcome to Ladder And Snake Game!!!

1. Sign Up
2. Log In
3. Exit

Enter your Option: 2
Enter your Username: deepanshu
Enter your Password: ******

**************************************************************
                      Welcome deepanshu!!!
**************************************************************

|| Snake And Ladder PlayBoard ||

100 99 98 ... 91
81 82 83 ... 90
...
01 02 03 ... 10

Player 1 Roll dice (r/R): r
Get number : 5
You move from 0 to 5


🙋‍♂️ *Author*
Deepanshu Mittal

📧 deepanshumittal10108@gmail.com


📄 License
This project is open-source and available under the MIT License.

💡 Future Improvements (Ideas)

- GUI-based version using JavaFX/Swing
- Save and resume functionality
- Dynamic snake/ladder generation
- Multiplayer network support



