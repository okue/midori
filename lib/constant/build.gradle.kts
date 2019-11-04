plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
    `java-library`
}

dependencies {
    implementation(project(":lib:app-common"))
}

val jar: Jar by tasks
jar.enabled = true
