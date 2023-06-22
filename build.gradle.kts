// 3 remove buildscript in favor of plugins
// https://plugins.gradle.org/plugin/org.jetbrains.kotlin.android
//buildscript {
//    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
//    }
//}



plugins {
     // for android app
     // https://mvnrepository.com/artifact/com.android.application/com.android.application.gradle.plugin?repo=google
     alias(libs.plugins.androidApplication) apply false
     alias(libs.plugins.kotlinAndroid) apply false
     alias(libs.plugins.kotlin.multiplatform) apply false

}

subprojects {
     repositories {
          mavenCentral()
          maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
          google()
          maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
     }
}
