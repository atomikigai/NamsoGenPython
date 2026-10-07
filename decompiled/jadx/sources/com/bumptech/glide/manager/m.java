package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.w;
import d4.u;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Handler.Callback {
    public static final z9.c e = new z9.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.l f1924a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f1926c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.e f1925b = new r.e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f1927d = new k(e);

    public m() {
        this.f1926c = (u.f2900f && u.e) ? new f() : new z9.c();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, r.e eVar) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.s sVar = (androidx.fragment.app.s) it.next();
            if (sVar != null && (obj = sVar.P) != null) {
                eVar.put(obj, sVar);
                b(sVar.q().f879c.x(), eVar);
            }
        }
    }

    public final com.bumptech.glide.l c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = p4.n.f7811a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof w) {
                return d((w) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f1924a == null) {
            synchronized (this) {
                try {
                    if (this.f1924a == null) {
                        this.f1924a = new com.bumptech.glide.l(com.bumptech.glide.b.a(context.getApplicationContext()), new b9.e(6), new b9.e(7), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1924a;
    }

    public final com.bumptech.glide.l d(w wVar) {
        char[] cArr = p4.n.f7811a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(wVar.getApplicationContext());
        }
        if (wVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f1926c.b(wVar);
        Activity activityA = a(wVar);
        return this.f1927d.a(wVar, com.bumptech.glide.b.a(wVar.getApplicationContext()), wVar.f366d, wVar.p(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
