// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        //noinspection GradleDependency
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.6")
    }
}
plugins {
    id ("com.android.application") version "8.2.2" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id ("com.google.dagger.hilt.android") version "2.51.1" apply false
    id ("com.google.gms.google-services") version "4.4.2" apply false
    id ("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false
}