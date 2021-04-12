import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import io.kotless.plugin.gradle.dsl.kotless
import io.kotless.resource.Lambda.Config.*

plugins {
    kotlin("jvm") version "1.4.21" apply true
    id("tanvd.kosogor") version "1.0.10"
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

sourceSets.getByName("main") {
    java.srcDir("src")
}

kotless {
    config {
        bucket = "hello-world-ktor-s3-bucket"
        prefix = "hello-ktor"

        terraform {
            profile = "default"
            region = "eu-central-1"
        }
    }

    webapp {
        lambda {
            memoryMb = 256
        }
    }
//    extensions {
//        local {
//            useAWSEmulation = true
//        }
//
//        terraform {
//            files {
//                add(file("src/main/tf/extensions.tf"))
//            }
//        }
//    }
}