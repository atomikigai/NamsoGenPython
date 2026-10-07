package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import j7.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import n9.g;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaeb extends AsyncTask {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final g zzg;

    public zzaeb(String str, String str2, Intent intent, g gVar, zzaed zzaedVar) {
        i0.e(str);
        this.zzb = str;
        i0.i(gVar);
        this.zzg = gVar;
        i0.e(str2);
        i0.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        i0.e(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzaedVar.zzc(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        i0.i(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference(zzaedVar);
        this.zze = zzaedVar.zzb(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaea zzaeaVar) {
        String strZzc;
        String strZzd;
        Uri.Builder builder;
        zzaed zzaedVar = (zzaed) this.zzd.get();
        if (zzaeaVar != null) {
            strZzc = zzaeaVar.zzc();
            strZzd = zzaeaVar.zzd();
        } else {
            strZzc = null;
            strZzd = null;
        }
        if (zzaedVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(strZzc) || (builder = this.zze) == null) {
            zzaedVar.zze(this.zzb, b.G(strZzd));
            return;
        }
        builder.authority(strZzc);
        zzaedVar.zzf(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f2713s);
    }

    private static byte[] zzb(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        if (!TextUtils.isEmpty(this.zzf)) {
            return zzaea.zza(this.zzf);
        }
        try {
            try {
                URL url = new URL(this.zzc);
                zzaed zzaedVar = (zzaed) this.zzd.get();
                HttpURLConnection httpURLConnectionZzd = zzaedVar.zzd(url);
                httpURLConnectionZzd.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpURLConnectionZzd.setConnectTimeout(60000);
                new zzaen(zzaedVar.zza(), this.zzg, zzael.zza().zzb()).zza(httpURLConnectionZzd);
                int responseCode = httpURLConnectionZzd.getResponseCode();
                if (responseCode == 200) {
                    zzagy zzagyVar = new zzagy();
                    zzagyVar.zzb(new String(zzb(httpURLConnectionZzd.getInputStream(), 128)));
                    for (String str2 : zzagyVar.zzc()) {
                        if (!str2.endsWith("firebaseapp.com") && !str2.endsWith("web.app")) {
                        }
                        return zzaea.zza(str2);
                    }
                    return null;
                }
                try {
                    if (httpURLConnectionZzd.getResponseCode() >= 400) {
                        InputStream errorStream = httpURLConnectionZzd.getErrorStream();
                        str = errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) zzaei.zza(new String(zzb(errorStream, 128)), String.class);
                    } else {
                        str = null;
                    }
                } catch (IOException e) {
                    zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(e.toString()), new Object[0]);
                }
                zza.c("Error getting project config. Failed with " + str + " " + responseCode, new Object[0]);
                return zzaea.zzb(str);
            } catch (IOException e4) {
                zza.c("IOException occurred: ".concat(String.valueOf(e4.getMessage())), new Object[0]);
                return null;
            }
        } catch (zzaca e10) {
            zza.c("ConversionException encountered: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            return null;
        } catch (NullPointerException e11) {
            zza.c("Null pointer encountered: ".concat(String.valueOf(e11.getMessage())), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
