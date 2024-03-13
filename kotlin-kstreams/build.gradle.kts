plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.eam.kotlin"
version = "DEVELOPMENT-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}