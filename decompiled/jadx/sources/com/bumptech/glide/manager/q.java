package com.bumptech.glide.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import bd.v;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.messaging.FirebaseMessaging;
import h6.o0;
import java.io.File;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import z7.q0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1935d;

    public q(q0 q0Var, String str) {
        this.f1935d = q0Var;
        i0.e(str);
        this.f1933b = str;
    }

    public static o0 e() {
        o0 o0Var = new o0(17, false);
        o0Var.f5062c = new z9.c();
        return o0Var;
    }

    public void a() {
        s3.c.c((s3.c) this.f1935d, this, false);
    }

    public File b() {
        File file;
        synchronized (((s3.c) this.f1935d)) {
            try {
                s3.b bVar = (s3.b) this.f1933b;
                if (bVar.f8369f != this) {
                    throw new IllegalStateException();
                }
                if (!bVar.e) {
                    ((boolean[]) this.f1934c)[0] = true;
                }
                file = bVar.f8368d[0];
                ((s3.c) this.f1935d).f8371a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public synchronized void c() {
        try {
            if (this.f1932a) {
                return;
            }
            Boolean boolF = f();
            this.f1934c = boolF;
            if (boolF == null) {
                ga.a aVar = new ga.a(8);
                x9.k kVar = (x9.k) ((va.c) this.f1933b);
                kVar.a(kVar.f10339c, aVar);
            }
            this.f1932a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean d() {
        Boolean bool;
        try {
            c();
            bool = (Boolean) this.f1934c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f1935d).f2729a.j();
    }

    public Boolean f() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        n9.g gVar = ((FirebaseMessaging) this.f1935d).f2729a;
        gVar.a();
        Context context = gVar.f7359a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String g() {
        if (!this.f1932a) {
            this.f1932a = true;
            this.f1934c = ((q0) this.f1935d).g().getString((String) this.f1933b, null);
        }
        return (String) this.f1934c;
    }

    public void h(String str) {
        SharedPreferences.Editor editorEdit = ((q0) this.f1935d).g().edit();
        editorEdit.putString((String) this.f1933b, str);
        editorEdit.apply();
        this.f1934c = str;
    }

    public q(Object obj, q3.b bVar) {
        this.f1932a = false;
        this.f1933b = obj;
        this.f1934c = bVar;
        this.f1935d = null;
    }

    public q(q3.n nVar) {
        this.f1932a = false;
        this.f1933b = null;
        this.f1934c = null;
        this.f1935d = nVar;
    }

    public q(v vVar, boolean z4) {
        this.f1935d = vVar;
        this.f1934c = new AtomicReference(null);
        this.f1932a = z4;
        this.f1933b = new AtomicMarkableReference(new ea.b(z4 ? 8192 : 1024), false);
    }

    public q(Context context, String str, h2.c cVar, boolean z4) {
        jc.i.e(context, "context");
        jc.i.e(cVar, "callback");
        this.f1933b = context;
        this.f1934c = str;
        this.f1935d = cVar;
        this.f1932a = z4;
    }

    public q(s3.c cVar, s3.b bVar) {
        this.f1935d = cVar;
        this.f1933b = bVar;
        this.f1934c = bVar.e ? null : new boolean[cVar.f8376r];
    }
}
