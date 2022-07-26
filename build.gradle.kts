import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
    application
}

group = "com.devsapiens"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("ValorantAPIApplication")
}

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

    implementation("com.apurebase:kgraphql:0.17.15")
    implementation("com.apurebase:kgraphql-ktor:0.17.15")

    testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    create("stage").dependsOn("installDist")
}