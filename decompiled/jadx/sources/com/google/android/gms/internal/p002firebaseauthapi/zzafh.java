package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafh {
    public static void zza(String str, zzafe zzafeVar, Type type, zzaen zzaenVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaenVar.zza(httpURLConnection);
            zzc(httpURLConnection, zzafeVar, type);
        } catch (SocketTimeoutException unused) {
            zzafeVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafeVar.zza("<<Network Error>>");
        } catch (IOException e) {
            zzafeVar.zza(e.getMessage());
        }
    }

    public static void zzb(String str, zzaej zzaejVar, zzafe zzafeVar, Type type, zzaen zzaenVar) throws IllegalAccessException, InvocationTargetException {
        try {
            i0.i(zzaejVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaejVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaenVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                zzc(httpURLConnection, zzafeVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (NullPointerException e) {
            e = e;
            zzafeVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused) {
            zzafeVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafeVar.zza("<<Network Error>>");
        } catch (IOException e4) {
            e = e4;
            zzafeVar.zza(e.getMessage());
        } catch (JSONException e10) {
            e = e10;
            zzafeVar.zza(e.getMessage());
        }
    }

    private static void zzc(HttpURLConnection httpURLConnection, zzafe zzafeVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zzd(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb2.toString();
                if (zzd(responseCode)) {
                    zzafeVar.zzb((zzaek) zzaei.zza(string, type));
                } else {
                    zzafeVar.zza((String) zzaei.zza(string, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzaca e) {
                e = e;
                zzafeVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzafeVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e4) {
                e = e4;
                zzafeVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean zzd(int i) {
        return i >= 200 && i < 300;
    }
}
