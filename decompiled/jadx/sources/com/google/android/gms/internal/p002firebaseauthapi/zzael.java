package com.google.android.gms.internal.p002firebaseauthapi;

import a5.g;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import n7.c;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzael {
    private final int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzael(String str) {
        int i = -1;
        try {
            List listZzd = zzab.zzc("[.-]").zzd(str);
            if (listZzd.size() == 1) {
                i = Integer.parseInt(str);
                str = str;
            } else if (listZzd.size() >= 3) {
                str = str;
                int i10 = (Integer.parseInt((String) listZzd.get(1)) * zzbbs.zzq.zzf) + (Integer.parseInt((String) listZzd.get(0)) * 1000000);
                int i11 = Integer.parseInt((String) listZzd.get(2));
                i = i10 + i11;
                str = i11;
            }
            str = str;
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e));
            }
        }
        this.zza = i;
    }

    public static zzael zza() throws Throwable {
        InputStream resourceAsStream;
        String str;
        String strConcat = "Failed to get app version for libraryName: firebase-auth";
        q qVar = q.f2241c;
        qVar.getClass();
        g gVar = q.f2240b;
        i0.f("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = qVar.f2242a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = q.class.getResourceAsStream("/firebase-auth.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            String strConcat2 = "firebase-auth version is " + property;
                            if (Log.isLoggable(gVar.f199a, 2)) {
                                String str2 = gVar.f200b;
                                if (str2 != null) {
                                    strConcat2 = str2.concat(strConcat2);
                                }
                                Log.v("LibraryVersion", strConcat2);
                            }
                        } else if (Log.isLoggable(gVar.f199a, 5)) {
                            String str3 = gVar.f200b;
                            Log.w("LibraryVersion", str3 == null ? "Failed to get app version for libraryName: firebase-auth" : str3.concat("Failed to get app version for libraryName: firebase-auth"));
                        }
                    } catch (IOException e) {
                        e = e;
                        inputStream = resourceAsStream;
                        if (Log.isLoggable(gVar.f199a, 6)) {
                            String str4 = gVar.f200b;
                            if (str4 != null) {
                                strConcat = str4.concat("Failed to get app version for libraryName: firebase-auth");
                            }
                            Log.e("LibraryVersion", strConcat, e);
                        }
                        resourceAsStream = inputStream;
                        property = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = resourceAsStream;
                        if (inputStream2 != null) {
                            c.d(inputStream2);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            }
            if (resourceAsStream != null) {
                c.d(resourceAsStream);
            }
            if (property == null) {
                if (Log.isLoggable(gVar.f199a, 3)) {
                    String str5 = gVar.f200b;
                    Log.d("LibraryVersion", str5 != null ? str5.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str = "UNKNOWN";
            } else {
                str = property;
            }
            concurrentHashMap.put("firebase-auth", str);
        }
        if (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) {
            str = "-1";
        }
        return new zzael(str);
    }

    public final String zzb() {
        return b.b("X", Integer.toString(this.zza));
    }
}
