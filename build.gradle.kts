import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
}

group = "com.devsapiens"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-status-pages:2.0.3")

    implementation("io.ktor:ktor-client-core:2.0.3")
    implementation("io.ktor:ktor-client-cio:2.0.3")
    implementation("io.ktor:ktor-client-logging:2.0.3")
    implementation("io.ktor:ktor-client-content-negotiation:2.0.3")

    implementation("io.ktor:ktor-server-core-jvm:2.0.3")
    implementation("io.ktor:ktor-server-netty-jvm:2.0.3")
    implementation("io.ktor:ktor-server-status-pages-jvm:2.0.3")
    implementation("io.ktor:ktor-server-default-headers-jvm:2.0.3")

    implementation("io.ktor:ktor-server-content-negotiation:2.0.3")

    implementation("io.ktor:ktor-serialization-kotlinx-json:2.0.3")

    implementation("io.insert-koin:koin-ktor:3.2.0")

    implementation("org.slf4j:slf4j-log4j12:1.7.36")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}