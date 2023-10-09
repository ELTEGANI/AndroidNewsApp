import com.android.build.api.dsl.Packaging
import org.jetbrains.kotlin.gradle.internal.Kapt3GradleSubplugin.Companion.isUseJvmIr
import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.newscompose"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newscompose"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }



    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation(Dependencies.corektx)
    implementation(Dependencies.lifecycleRuntime)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.uiGraphics)
    implementation(Dependencies.toolingPreview)
    implementation(Dependencies.material3)
    implementation(project(mapOf("path" to ":Utilites")))
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.espresso)
    androidTestImplementation(Dependencies.composeBom)
    androidTestImplementation(Dependencies.junit4)
    debugImplementation(Dependencies.tooling)
    debugImplementation(Dependencies.testManifest)
    //add Utilities Module to app
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltAndroidCompiler)
    implementation(Dependencies.hiltCompiler)
    implementation(Dependencies.navCompose)
    implementation(Dependencies.navigationCompose)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.gsonconvertor)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiconvertor)
    implementation(Dependencies.logginginterceptor)
    implementation(Dependencies.moshiKotlin)
    implementation(Dependencies.coroutineCore)
    implementation(Dependencies.coroutineAndroid)
    implementation(Dependencies.splashScreen)
    implementation(Dependencies.coilCompose)
}

kapt {
    correctErrorTypes = true
}