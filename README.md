### Spacetory
<img src="https://github.com/wh0ami-lab/Spacetory/raw/master/smashing-freebie-space-icons/png/256/planet.png" />
<br />
<br />
---
Travis CI: <img src="https://travis-ci.org/wh0ami-lab/Spacetory.svg" />
---

Spacetory is an Android 4+ client for Tox created by [Mark Winter](https://github.com/Astonex) and [Misha Marinenko(wh0ami)](https://github.com/misha-marinenko). It aims to bring the full multimedia support Tox offers to your device, although it's still currently in heavy development.


### Current development

- Android 6 (Marshmallow) permission support
- Bugfixing A/V

### What Is Currently Working
- One to one messaging
- File transfers
- Avatars
- Partial A/V support

### Known Issues
- Currently crashing on x86_64 devices, due to the tox4j library not currently supporting this arch. To find out if your device is running x86_64 Android, look for your device on [GSMArena](http://www.gsmarena.com/) and check your device's chipset. The most common x86_64 Android chipset is the Intel Atom.

### Compiling Spacetory From Source using Gradle
- Download and install the SDK tools http://developer.android.com/sdk/index.html#Other
- Run `./download-dependencies.sh` (`download-dependencies.bat` on Windows)
- Run the gradle wrapper `./gradlew build -x lint --parallel` (`gradlew.bat build -x lint --parallel` on Windows). This will download gradle to your project files to ensure you have the correct version of gradle for building
- If errors occur during the first build, run the command again
- The apk will then be available in `app/build/outputs/apk/`
- To install the app via ADB, run `adb install <apk file>` 

### Remarks

*The Android robot is reproduced or modified from work created and shared by Google and used according to terms described in the Creative Commons 3.0 Attribution License.*

*This repository resembles but is legally distinct from [astonex/Antox](https://github.com/Astonex/Antox) and the Lollipop Guild.*


