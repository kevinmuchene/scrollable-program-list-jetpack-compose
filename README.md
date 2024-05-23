# List of Messages App

This is an Android application that displays a list of programs offered at Maharishi International University (MIU) using Jetpack Compose. The app showcases various academic programs along with their descriptions.

## Features

- Displays a list of MIU programs.
- Each program card contains the program name and a brief description.
- The description can be expanded and collapsed by clicking on the program card.
- Uses Jetpack Compose for the UI.
- Material Design 3 for theming and styling.

## Screenshots

<img width="766" alt="Screenshot 2024-05-23 at 2 53 44 PM" src="https://github.com/kevinmuchene/scrollable-program-list-jetpack-compose/assets/17735347/c646ac4f-ab32-4ac9-bf63-fb43b5920234">

<img width="766" alt="Screenshot 2024-05-23 at 2 53 33 PM" src="https://github.com/kevinmuchene/scrollable-program-list-jetpack-compose/assets/17735347/90f0114f-b1a0-413b-9315-789a8cedacb6">

## Code Structure

### MainActivity

The `MainActivity` is the entry point of the application. It sets the content using the `ListOfMessagesTheme`.

## Composables

### ProgramList
Displays a list of MIU programs using a LazyColumn.

### ProgramCard
Displays the details of a single MIU program in a card format.

### Data Class
Represents a program offered at MIU.
