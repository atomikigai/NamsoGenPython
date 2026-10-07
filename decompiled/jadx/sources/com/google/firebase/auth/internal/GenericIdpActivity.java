package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeb;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzaed;
import com.google.android.gms.internal.p002firebaseauthapi.zzafx;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import n7.c;
import n9.g;
import o1.b;
import org.json.JSONException;
import org.json.JSONObject;
import s5.j;
import w9.r;
import w9.s;
import w9.x;
import w9.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class GenericIdpActivity extends w implements zzaed {
    public static long K;
    public static final s L = s.f9856c;
    public boolean J = false;

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            s();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - K < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        K = jCurrentTimeMillis;
        if (bundle != null) {
            this.J = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.w, android.app.Activity
    public final void onResume() {
        x xVar;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.J) {
                s();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = c.c(c.g(this, packageName)).toLowerCase(Locale.US);
                g gVarE = g.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVarE);
                if (zzafx.zzg(gVarE)) {
                    gVarE.a();
                    zzf(r(Uri.parse(zzafx.zza(gVarE.f7361c.f7366a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f2713s);
                } else {
                    new zzaeb(packageName, lowerCase, getIntent(), gVarE, this).executeOnExecutor(firebaseAuth.f2716v, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + e.toString());
                zze(packageName, null);
            }
            this.J = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            t(r.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            s();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (y.f9869a) {
            i0.e(packageName2);
            i0.e(stringExtra2);
            SharedPreferences sharedPreferencesB = y.b(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = sharedPreferencesB.getString(str, null);
            String string2 = sharedPreferencesB.getString(str2, null);
            String string3 = sharedPreferencesB.getString(str3, null);
            String string4 = sharedPreferencesB.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = sharedPreferencesB.getString(str4, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.apply();
            xVar = (string == null || string2 == null || string3 == null) ? null : new x(string, string2, string3, string4, string5);
        }
        if (xVar == null) {
            s();
        }
        if (booleanExtra) {
            stringExtra = j.E(getApplicationContext(), g.e(xVar.e).f()).F(stringExtra);
        }
        zzaic zzaicVar = new zzaic(xVar, stringExtra);
        String str5 = xVar.f9868d;
        String str6 = xVar.f9866b;
        zzaicVar.zzf(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            s();
            return;
        }
        K = 0L;
        this.J = false;
        Intent intent2 = new Intent();
        Parcel parcelObtain = Parcel.obtain();
        zzaicVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bArrMarshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (b.a(this).b(intent2)) {
            L.a(this);
        } else {
            SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            Parcel parcelObtain2 = Parcel.obtain();
            zzaicVar.writeToParcel(parcelObtain2, 0);
            byte[] bArrMarshall2 = parcelObtain2.marshall();
            parcelObtain2.recycle();
            editorEdit2.putString("verifyAssertionRequest", bArrMarshall2 != null ? Base64.encodeToString(bArrMarshall2, 10) : null);
            editorEdit2.putString("operation", str6);
            editorEdit2.putString("tenantId", str5);
            editorEdit2.putLong("timestamp", System.currentTimeMillis());
            editorEdit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.J);
    }

    public final Uri.Builder r(Uri.Builder builder, Intent intent, String str, String str2) {
        String string;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string2 = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put(str3, string2);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            string = jSONObject.toString();
        }
        String string3 = UUID.randomUUID().toString();
        String strZza = zzaec.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        y yVar = y.f9869a;
        Context applicationContext = getApplicationContext();
        String str4 = string;
        String str5 = strJoin;
        synchronized (yVar) {
            i0.e(str);
            i0.e(string3);
            i0.e(strZza);
            i0.e(stringExtra4);
            SharedPreferences sharedPreferencesB = y.b(applicationContext, str);
            y.a(sharedPreferencesB);
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".SESSION_ID", strZza);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".OPERATION", action);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".PROVIDER_ID", stringExtra2);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".FIREBASE_APP_NAME", stringExtra4);
            editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            editorEdit.apply();
        }
        String strG = j.E(getApplicationContext(), g.e(stringExtra4).f()).G();
        if (TextUtils.isEmpty(strG)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            t(qd.b.G("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string3).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strG);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void s() {
        K = 0L;
        this.J = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean zB = b.a(this).b(intent);
        s sVar = L;
        if (zB) {
            sVar.a(this);
        } else {
            Status statusG = qd.b.G("WEB_CONTEXT_CANCELED");
            sVar.getClass();
            s.b(this, statusG);
        }
        finish();
    }

    public final void t(Status status) {
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
        boolean zB = b.a(this).b(intent);
        s sVar = L;
        if (zB) {
            sVar.a(this);
        } else {
            Context applicationContext = getApplicationContext();
            sVar.getClass();
            s.b(applicationContext, status);
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        return r(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zze(String str, Status status) {
        if (status == null) {
            s();
        } else {
            t(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzf(Uri uri, String str, ya.b bVar) {
        if (bVar.get() != null) {
            throw new ClassCastException();
        }
        Tasks.forResult(uri).addOnCompleteListener(new j(6, this, str));
    }
}
