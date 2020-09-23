# Introduction
This project simulates the classic board game, Battleship.
This project is built with Java 8 and Java FX GUI library.
Updated AI: Range of checking increases after one part (tile) of the ship is found.
A command line interface is also included and runs simultaneously in the console to present the game boards.

# Installation
Download all packages (Control, Game, Player and Ships) and all the media files (images and music). 
The game can be built and run by an IDE, such as IntelliJ, or in the command line:
Compile: javac Control/Launcher.java
Run: java Control.Launcher

# Usage
The majority of game control is through left and right mouse clicks.
In-game instruction is available in "Help".
On the upper right corner, music button can be switched on and off for background music.
At any time during the game, the user can return to the main menu.

In the main menu, the user can select one of two game modes - Regular and Timed.
In the Timed Mode, please click on the timer start button after all the ships are placed on the left board.
  
The user will be able to place their ships on the left-hand side grid. Left mouse clicks will place ships horizontally and right mouse clicks will place ships vertically. Users will not be able to overlap ships nor place ships outside of the board. Computer's ship placement is randomized and adheres to the same rules as the user.

Once all ships are placed on the board, users will be able to attack their opponent on the right-hand side grid. The goal is to hit all locations of the opponents ships without losing their ships first. If all ships of one player have been destroyed, the game will end and the opponent will win.
A pop-up message will appear declaring the winner.
