plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.dokka") version "2.2.0"
}

// Replication prompt - Configure Dokka and documentation
//
// Configure Dokka 2.2.0 in this Android project.
//
// Add clear KDoc documentation to the Wizard class and castSpell function,
// including @property, @param, and @return tags. Run
// ./gradlew dokkaGenerateHtml and verify that the generated HTML contains pages
// for Wizard and castSpell.
//
// Update .gitignore so app/build remains ignored except app/build/dokka/**,
// because the generated documentation must be committed.

android {
    namespace = "com.example.lab_6"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.lab_6"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    testImplementation(libs.junit)

    debugImplementation(libs.androidx.compose.ui.tooling)
}
