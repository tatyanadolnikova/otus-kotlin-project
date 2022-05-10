plugins {
    kotlin("jvm")
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":accounting-api-kmp"))
    implementation(project(":accounting-common"))

    testImplementation(kotlin("test-junit"))
}
