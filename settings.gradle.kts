pluginManagement {
    repositories {
        // 1. Add this 2 dependencies
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
}


rootProject.name = "app"

include(":site")
include(":app-android")
