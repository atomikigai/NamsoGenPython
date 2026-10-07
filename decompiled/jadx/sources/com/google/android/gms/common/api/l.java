package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.w0;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    protected final com.google.android.gms.common.api.internal.h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final com.google.android.gms.common.api.internal.a zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final com.google.android.gms.common.api.internal.v zaj;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Activity activity, i iVar, e eVar, b9.e eVar2) {
        Looper mainLooper = activity.getMainLooper();
        i0.j(mainLooper, "Looper must not be null.");
        this(activity, activity, iVar, eVar, new k(eVar2, mainLooper));
    }

    public final void a(int i, com.google.android.gms.common.api.internal.d dVar) {
        dVar.zak();
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        p0 p0Var = new p0(new v0(i, dVar), hVar.f2107t.get(), this);
        zau zauVar = hVar.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(4, p0Var));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    public final Task b(int i, com.google.android.gms.common.api.internal.x xVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        com.google.android.gms.common.api.internal.v vVar = this.zaj;
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        hVar.g(taskCompletionSource, xVar.f2159c, this);
        p0 p0Var = new p0(new w0(i, xVar, taskCompletionSource, vVar), hVar.f2107t.get(), this);
        zau zauVar = hVar.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(4, p0Var));
        return taskCompletionSource.getTask();
    }

    public com.google.android.gms.common.internal.h createClientSettingsBuilder() {
        com.google.android.gms.common.internal.h hVar = new com.google.android.gms.common.internal.h();
        Set set = Collections.EMPTY_SET;
        if (hVar.f2191a == null) {
            hVar.f2191a = new r.f(0);
        }
        hVar.f2191a.addAll(set);
        hVar.f2193c = this.zab.getClass().getName();
        hVar.f2192b = this.zab.getPackageName();
        return hVar;
    }

    public Task<Boolean> disconnectService() {
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        c0 c0Var = new c0(getApiKey());
        zau zauVar = hVar.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(14, c0Var));
        return c0Var.f2072b.getTask();
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doBestEffortWrite(T t10) {
        a(2, t10);
        return t10;
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doRead(T t10) {
        a(0, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends com.google.android.gms.common.api.internal.r, U extends y> Task<Void> doRegisterEventListener(T t10, U u10) {
        i0.i(t10);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.m mVar) {
        return doUnregisterEventListener(mVar, 0);
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.d> T doWrite(T t10) {
        a(1, t10);
        return t10;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final com.google.android.gms.common.api.internal.a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.o registerListener(L l2, String str) {
        return r7.g.n(this.zag, l2, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, f0 f0Var) {
        com.google.android.gms.common.internal.h hVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.i iVar = new com.google.android.gms.common.internal.i(hVarCreateClientSettingsBuilder.f2191a, null, hVarCreateClientSettingsBuilder.f2192b, hVarCreateClientSettingsBuilder.f2193c, a8.a.f243a);
        a aVar = this.zad.f2050a;
        i0.i(aVar);
        g gVarBuildClient = aVar.buildClient(this.zab, looper, iVar, (Object) this.zae, (m) f0Var, (n) f0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (gVarBuildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) gVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(gVarBuildClient instanceof com.google.android.gms.common.api.internal.p)) {
            return gVarBuildClient;
        }
        q1.a.q(gVarBuildClient);
        throw null;
    }

    public final q0 zac(Context context, Handler handler) {
        com.google.android.gms.common.internal.h hVarCreateClientSettingsBuilder = createClientSettingsBuilder();
        return new q0(context, handler, new com.google.android.gms.common.internal.i(hVarCreateClientSettingsBuilder.f2191a, null, hVarCreateClientSettingsBuilder.f2192b, hVarCreateClientSettingsBuilder.f2193c, a8.a.f243a));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(com.google.android.gms.common.api.internal.x xVar) {
        return b(2, xVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doRead(com.google.android.gms.common.api.internal.x xVar) {
        return b(0, xVar);
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> Task<Void> doRegisterEventListener(com.google.android.gms.common.api.internal.s sVar) {
        i0.i(sVar);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(com.google.android.gms.common.api.internal.m mVar, int i) {
        i0.j(mVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.h hVar = this.zaa;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.g(taskCompletionSource, i, this);
        p0 p0Var = new p0(new x0(mVar, taskCompletionSource), hVar.f2107t.get(), this);
        zau zauVar = hVar.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(13, p0Var));
        return taskCompletionSource.getTask();
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doWrite(com.google.android.gms.common.api.internal.x xVar) {
        return b(1, xVar);
    }

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        String apiFallbackAttributionTag;
        i0.j(context, "Null context is not permitted.");
        i0.j(iVar, "Api must not be null.");
        i0.j(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        i0.j(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f2169b;
        com.google.android.gms.common.api.internal.a aVar = new com.google.android.gms.common.api.internal.a(iVar, eVar, apiFallbackAttributionTag);
        this.zaf = aVar;
        this.zai = new com.google.android.gms.common.api.internal.i0(this);
        com.google.android.gms.common.api.internal.h hVarH = com.google.android.gms.common.api.internal.h.h(applicationContext);
        this.zaa = hVarH;
        this.zah = hVarH.f2106s.getAndIncrement();
        this.zaj = kVar.f2168a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.l fragment = LifecycleCallback.getFragment(activity);
            b0 b0Var = (b0) fragment.e(b0.class, "ConnectionlessLifecycleHelper");
            if (b0Var == null) {
                int i = g7.e.f4238c;
                b0Var = new b0(fragment, hVarH);
            }
            b0Var.e.add(aVar);
            hVarH.b(b0Var);
        }
        zau zauVar = hVarH.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }
}
