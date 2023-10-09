object Dependencies {
    val corektx by lazy {"androidx.core:core-ktx:${Versions.corektx}"}
    val lifecycleRuntime by lazy {"androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"}
    val activityCompose by lazy {"androidx.activity:activity-compose:${Versions.activityCompose}"}
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUi by lazy {"androidx.compose.ui:ui"}
    val uiGraphics by lazy {"androidx.compose.ui:ui-graphics"}
    val toolingPreview by lazy {"androidx.compose.ui:ui-tooling-preview"}
    val material3 by lazy {"androidx.compose.material3:material3"}
    val junit by lazy {"junit:junit:${Versions.junit}"}
    val extJunit by lazy {"androidx.test.ext:junit:${Versions.extJunit}"}
    val espresso by lazy {"androidx.test.espresso:espresso-core:${Versions.espresso}"}
    val junit4 by lazy {"androidx.compose.ui:ui-test-junit4"}
    val tooling by lazy {"androidx.compose.ui:ui-tooling"}
    val testManifest by lazy {"androidx.compose.ui:ui-test-manifest"}
    val appcompat by lazy {"androidx.appcompat:appcompat:${Versions.appcompat}"}
    val material by lazy {"com.google.android.material:material:${Versions.material}"}
    val hiltAndroid by lazy {"com.google.dagger:hilt-android:${Versions.hiltAndroid}"}
    val hiltAndroidCompiler by lazy {"com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}"}
    val hiltCompiler by lazy {"androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"}
    val navCompose by lazy {"androidx.hilt:hilt-navigation-compose:${Versions.hiltCompiler}"}
    val retrofit by lazy {"com.squareup.retrofit2:retrofit:${Versions.retrofit}"}
    val okhttp by lazy {"com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
    val gsonconvertor by lazy {"com.squareup.retrofit2:converter-gson:${Versions.gsonconvertor}"}
    val moshi by lazy {"com.squareup.retrofit2:converter-moshi:${Versions.moshi}"}
    val moshiconvertor by lazy {"com.squareup.retrofit2:converter-moshi:${Versions.moshiconvertor}"}
    val logginginterceptor by lazy {"com.squareup.okhttp3:logging-interceptor:${Versions.logginginterceptor}"}
    val moshiKotlin by lazy {"com.squareup.moshi:moshi-kotlin:${Versions.moshiKotlin}"}
    val coroutineCore by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineCore}"}
    val coroutineAndroid by lazy {"org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineCore}"}
    val navigationCompose by lazy {"androidx.navigation:navigation-compose:${Versions.navigationCompose}"}
    val splashScreen by lazy {"androidx.core:core-splashscreen:${Versions.splashScreen}"}
    val coilCompose by lazy {"io.coil-kt:coil-compose:${Versions.coilCompose}"}



}

object Modules{
    const val Utilites = ":Utilites"
}