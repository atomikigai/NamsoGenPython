package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeb;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeo;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import n7.c;
import n9.g;
import qd.b;
import s5.j;
import w9.r;
import w9.s;
import w9.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class RecaptchaActivity extends w implements zzaed {
    public static long K;
    public static final s L = s.f9856c;
    public boolean J = false;

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            r();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - K < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        K = jCurrentTimeMillis;
        if (bundle != null) {
            this.J = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        RecaptchaActivity recaptchaActivity;
        String string;
        boolean zIsEmpty;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.J) {
                r();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = c.c(c.g(this, packageName)).toLowerCase(Locale.US);
                g gVarE = g.e(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                recaptchaActivity = this;
                new zzaeb(packageName, lowerCase, intent, gVarE, recaptchaActivity).executeOnExecutor(FirebaseAuth.getInstance(gVarE).f2716v, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                recaptchaActivity = this;
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + e.toString());
                zze(packageName, null);
            }
            recaptchaActivity.J = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            s(r.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            r();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        y yVar = y.f9869a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (yVar) {
            i0.e(packageName2);
            i0.e(stringExtra2);
            SharedPreferences sharedPreferencesB = y.b(applicationContext, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String string2 = sharedPreferencesB.getString(str, null);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            string = sharedPreferencesB.getString(str2, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.apply();
            zIsEmpty = TextUtils.isEmpty(string2);
        }
        String str3 = zIsEmpty ? null : string;
        if (TextUtils.isEmpty(str3)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            s(b.G("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = j.E(getApplicationContext(), g.e(str3).f()).F(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        K = 0L;
        this.J = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (o1.b.a(this).b(intent3)) {
            L.a(this);
        } else {
            SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            editorEdit2.putString("recaptchaToken", queryParameter);
            editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit2.putLong("timestamp", System.currentTimeMillis());
            editorEdit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.J);
    }

    public final void r() {
        K = 0L;
        this.J = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        o1.b.a(this).b(intent);
        L.a(this);
        finish();
    }

    public final void s(Status status) {
        K = 0L;
        this.J = false;
        Intent intent = new Intent();
        HashMap map = r.f9855a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        o1.b.a(this).b(intent);
        L.a(this);
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        String str3;
        String strZza;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        g gVarE = g.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVarE);
        y yVar = y.f9869a;
        Context applicationContext = getApplicationContext();
        synchronized (yVar) {
            i0.e(str);
            i0.e(string);
            SharedPreferences sharedPreferencesB = y.b(applicationContext, str);
            y.a(sharedPreferencesB);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strG = j.E(getApplicationContext(), gVarE.f()).G();
        if (TextUtils.isEmpty(strG)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            s(b.G("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.h) {
            str3 = firebaseAuth.i;
        }
        if (TextUtils.isEmpty(str3)) {
            strZza = zzaeo.zza();
        } else {
            synchronized (firebaseAuth.h) {
                strZza = firebaseAuth.i;
            }
        }
        return new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strZza).appendQueryParameter("eventId", string).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strG);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final String zzc(String str) {
        return zzafx.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zzaed.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zze(String str, Status status) {
        if (status == null) {
            r();
        } else {
            s(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzf(Uri uri, String str, ya.b bVar) {
        if (bVar.get() != null) {
            throw new ClassCastException();
        }
        Tasks.forResult(uri).addOnCompleteListener(new j(7, this, str));
    }
}
