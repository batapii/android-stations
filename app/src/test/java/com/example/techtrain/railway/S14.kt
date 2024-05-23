package com.example.techtrain.railway

import android.Manifest
import android.app.Application
import android.content.pm.PackageManager
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


@RunWith(AndroidJUnit4::class)
class S14 {

    @Test
    fun test() {
        val context = ApplicationProvider.getApplicationContext<Application>()

        val info = context.packageManager.getPackageInfo(
            context.packageName,
            PackageManager.GET_PERMISSIONS
        )
        assertEquals(
            setOf(Manifest.permission.INTERNET, Manifest.permission.ACCESS_NETWORK_STATE,"com.example.techtrain.railway.android.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"),
            info.requestedPermissions.toSet(),
            "AndroidManifestに必要なパーミッションが書かれていないか、余分なパーミッションが書かれています。"
        )

        val retrofitClass = try {
            Class.forName("retrofit2.Retrofit")
        } catch (_: ClassNotFoundException) {
            null
        }
        assertNotNull(retrofitClass, "Retrofitが依存関係に含まれていません。")
        val moshiConverterFactoryClass = try {
            Class.forName("retrofit2.converter.moshi.MoshiConverterFactory")
        } catch (_: ClassNotFoundException) {
            null
        }
        assertNotNull(moshiConverterFactoryClass, "Retrofit converter-moshiが依存関係に含まれていません。")
    }
}
