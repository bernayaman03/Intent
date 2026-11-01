# Intent

A simple Android application developed with Kotlin and XML layouts. The project demonstrates communication between two activities using Intents and the `startActivityForResult()` method.

## Features

- Navigate between two activities.
- Enter text in the second activity.
- Remove characters outside the A–Z and a–z ranges using regular expressions.
- Calculate the number of removed characters.
- Return the processed text and removed character count to the main activity.
- Display the results using a Toast message.

## Technologies

- Kotlin
- Android SDK
- XML Layouts
- Android Studio

## Implementation

The application consists of two activities:

- **MainActivity:** Opens the text input screen and receives the processed results through `onActivityResult()`.
- **InputActivity:** Processes the entered text using Regex and returns the results through `setResult()`.

The project uses `startActivityForResult()` as part of its original academic requirements. This method is deprecated in modern Android development.
