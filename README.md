# CMPUT 301: Lab 6 Participation Exercise

## Student Details
- **Full Name:** Dean Elbery
- **CCID:** `delbery`

## References and Resources
- [CMPUT 301 Lab 6 instructions](https://ualberta-cmput301.github.io/labs/lab6_instruct.html)
- CMPUT 301 Lab 6 slides, *Code Documentation and Unit Testing* (2026)
- OpenAI Codex (implementation and verification support)

## Verbal Collaboration
N/A

## Project

The Android project demonstrates KDoc/Dokka documentation and JUnit 4 unit
testing with a `Wizard` class. The required walkthrough tests and both
Frostbite participation-exercise tests are in `WizardTest`.

Run the unit tests:

```shell
./gradlew testDebugUnitTest
```

Regenerate the HTML API documentation:

```shell
./gradlew dokkaGenerateHtml
```

The [generated Dokka documentation](app/build/dokka/html/index.html) is included
in the repository as required for submission.

## Replication Verification Prompt

```text
Audit this Lab 6 repository against its instructions.

Check:
- Android Studio imports and Gradle sync succeeds.
- The debug APK builds.
- Wizard has correct KDoc.
- Explosion and Frostbite follow the required mana and damage rules.
- WizardTest contains all four required tests.
- All tests pass.
- Dokka HTML is generated and tracked by Git.
- README and LICENSE contain the correct student information.
- The repository contains no accidental temporary files.
- The Git worktree contains only intentional changes.

Fix any problems you find, rerun all relevant checks, and provide a concise
completion report.
```
