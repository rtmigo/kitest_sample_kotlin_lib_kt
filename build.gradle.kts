plugins {
    kotlin("jvm") version "1.6.10"
    id("java-library")
    java
}

group = "io.github.rtmigo"
version = "0.0.1"


repositories { mavenCentral() }

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}