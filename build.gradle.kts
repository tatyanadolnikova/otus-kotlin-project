plugins {
    kotlin("jvm") apply false
}

group = "ru.otus.otuskotlin.accounting"
version = "0.0.1"

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
//dependencies {
//
//    val kotlinVersion: String by project
//    val kotestVersion: String by project
//
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-common:$kotlinVersion")
//    implementation("org.jetbrains.kotlin:kotlin-test-common:$kotlinVersion")
//    implementation("org.jetbrains.kotlin:kotlin-test-annotations-common:$kotlinVersion")
//
//    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
//    implementation("io.kotest:kotest-framework-engine:$kotestVersion")
//    implementation("io.kotest:kotest-framework-datatest:$kotestVersion")
//    implementation("io.kotest:kotest-assertions-core:$kotestVersion")
//    implementation("io.kotest:kotest-property:$kotestVersion")
//}
