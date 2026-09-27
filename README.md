# Send Email By Java Email Api

## I’m going to show you how to send email from android app using java mail API. Watch to learn how it work and don’t forget to turn on your notifications!

# video explain :
https://youtu.be/ZbosRfH1SnM

First you need to create app password for send email from app.Follow the instructions.
Create & use App Passwords
Go to your Google Account.
On the left navigation panel, choose Security.
On the "Signing in to Google" panel, choose App Passwords. If you don’t see this option:
2-Step Verification is not set up for your account.
2-Step Verification is set up for security keys only.
Your account is through work, school, or other organization.
You’ve turned on Advanced Protection for your account.
At the bottom, choose Select app and choose the app you’re using.
Choose Select device and choose the device you’re using.
Choose Generate.
Follow the instructions to enter the App Password. The App Password is the 16-character code in the yellow bar on your device.
Choose Done.

## Configure your sender account (no credentials in the code)

The app reads the sender address and App Password at build time from a local
`email.properties` file that is git-ignored, so your credentials never end up in the repository.

1. Copy the example file in the project root:

   ```
   cp email.properties.example email.properties
   ```

2. Put your own values in `email.properties`:

   ```
   SENDER_EMAIL=your.address@gmail.com
   SENDER_APP_PASSWORD=your-16-char-app-password
   ```

3. Sync Gradle and run the app. `Utils.EMAIL` / `Utils.PASSWORD` are filled from
   `BuildConfig.SENDER_EMAIL` / `BuildConfig.SENDER_APP_PASSWORD`.

Never commit `email.properties`. If an App Password is ever exposed, revoke it from your
Google Account (Security → App Passwords) and create a new one.



source code on gitHub :
https://github.com/UsamaElgendy/SendEmailByJavaEmailApi

download lib :
https://code.google.com/archive/p/javamail-android/downloads
