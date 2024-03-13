# kotlin-best-practices

Some snippets in Kotlin.

## Gradle recap

Gradle-managed projects usually are distributed with a Gradle Wrapper standalone jar, residing in `gradle/wrapper` folder. To run the wrapper, use `./gradlew` console command.

Besides that, there are configuration files, both on root level and in every module:

1. `settings.gradle.kts` contains build and project structure, such as list of modules: https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:settings_file
2. `gradle.properties` helps with keeping properties separate from the build script and should be explored as viable option. It’s a good location for placing properties that control the build environment
3. `<module>/build.gradle` 
