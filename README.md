```
                        ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
                        ██ ▄▄▀█ ██ ▄▄█ ▄▄▀█ ▄▄▀████ ▄▀▄ ██▄██ ▄▄▀█ ▄▀██
                        ██ ████ ██ ▄▄█ ▀▀ █ ▀▀▄████ █ █ ██ ▄█ ██ █ █ ██
                        ██ ▀▀▄█▄▄█▄▄▄█▄██▄█▄█▄▄████ ███ █▄▄▄█▄██▄█▄▄███
                        ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
```
# Inclusive Mental Health Support App

## !!! Disclaimer !!!
This application is for educational purposes only and is not intended to diagnose or treat mental health conditions. If you or someone you know is experiencing a mental health crisis, please contact a qualified professional or call the **988 Suicide & Crisis Lifeline**.

## Project Overview
ClearMind is a console-based Java application designed to support student mental health and well-being. The program provides an interactive mental health quiz, personalized recommendations, positive affirmations, and access to support resources.

The goal of the project is to demonstrate how simple software systems can help raise awareness about mental health and provide supportive tools for students from diverse backgrounds.

This project was created as part of a collaborative programming assignment focused on social equity and community support.

## Features

### 1. Mental Health Quiz
Users can take a short quiz that evaluates three mental health categories:

- Stress
- Anxiety
- Depression

Each category contains 5 questions. Users answer using a scale from:

1 – Never  
2 – Sometimes  
3 – Often  
4 – Almost Always  

The program calculates a score for each category and provides feedback based on the results.

### 2. Personalized Recommendations
Based on whether the user has taken the quiz, the program can provide suggestions for managing stress and improving mental well-being.

### 3. Daily Affirmation Generator
The application can display a randomly selected positive affirmation to encourage users and promote a positive mindset.

### 4. Activity Summary & Stress Scores
The system keeps track of how many quizzes have been taken during the program session and displays the most recent scores.

### 5. Support Resources
Users can browse mental health resources such as crisis hotlines and support services.

## Technical Concepts Used

This project demonstrates several programming concepts learned in class:

- Loops (`while` menu loop)
- Conditional logic (`if`, `switch`)
- Arrays (quiz questions and affirmations)
- Methods / functions
- User input with `Scanner`
- Basic data tracking using variables

## Program Structure

Main classes used in the project:

```
ClearMind.java
MentalHealthQuiz.java
Recommendations.java
AffirmationGenerator.java
SupportResources.java
```

### ClearMind
Main program entry point. Handles the menu system and user navigation.

### MentalHealthQuiz
Runs the quiz, calculates scores, and evaluates results.

### Recommendations
Provides suggestions for improving mental well-being.

### AffirmationGenerator
Displays a random positive affirmation.

### SupportResources
Displays mental health resources and support information.

## How to Run the Program

```
java ClearMind
```

Follow the instructions shown in the console menu.

## Example Menu

```
================== Main Menu ==================

1. Take Mental Health Quiz
2. View Personalized Recommendations
3. Daily Affirmation
4. View Activity Summary & Stress Score
5. Browse Support Resources
6. Exit
```
