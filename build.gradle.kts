plugins {
    kotlin("jvm") version "1.4.10"
    id("com.lightbend.akka.grpc.gradle") version "1.0.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.typesafe.akka:akka-http2-support_2.13:10.1.12")
}
