import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import io.kotless.plugin.gradle.dsl.kotless
import io.kotless.resource.Lambda.Config.*

plugins {
    kotlin("jvm") version "1.4.21"
    id ("tanvd.kosogor") version "1.0.10"
    id("io.kotless") version "0.1.7-beta-5" apply true
}

buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
        classpath("io.kotless:gradle:0.1.7-beta-5")
    }
}
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    jcenter()
}

group = "dev.abhishekbansal"
version = "1.0"


dependencies {
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