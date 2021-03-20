import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import io.kotless.plugin.gradle.dsl.kotless

//import io.kotless.resource.Lambda.Config.*

plugins {
    kotlin("jvm") version "1.4.21" apply true
//    id ("tanvd.kosogor") version "1.0.10"
    id("io.kotless") version "0.1.7-beta-5" apply true
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        languageVersion = "1.4"
        apiVersion = "1.4"
    }
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

group = "dev.abhishekbansal"
version = "1.0"


dependencies {
//    implementation(kotlin("stdlib"))
    implementation("io.kotless", "ktor-lang", "0.1.7-beta-5")
}

//kotless {
//    config {
//        bucket = "eu.ktor-site.s3.ktls.aws.intellij.net"
//        prefix = "ktor-site"
//
//        terraform {
//            profile = "kotless-jetbrains"
//            region = "eu-west-1"
//        }
//    }
//}