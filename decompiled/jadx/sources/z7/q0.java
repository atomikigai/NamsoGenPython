package z7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends f1 {
    public static final Pair I = new Pair("", 0L);
    public boolean A;
    public final o0 B;
    public final o0 C;
    public final p0 D;
    public final com.bumptech.glide.manager.q E;
    public final com.bumptech.glide.manager.q F;
    public final p0 G;
    public final a3.j H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f11306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kb.d f11307d;
    public final p0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.q f11308f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p0 f11312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0 f11313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.q f11314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f11315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p0 f11316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p0 f11317z;

    public q0(a1 a1Var) {
        super(a1Var);
        this.f11312u = new p0(this, "session_timeout", 1800000L);
        this.f11313v = new o0(this, "start_new_session", true);
        this.f11316y = new p0(this, "last_pause_time", 0L);
        this.f11317z = new p0(this, "session_id", 0L);
        this.f11314w = new com.bumptech.glide.manager.q(this, "non_personalized_ads");
        this.f11315x = new o0(this, "allow_remote_dynamite", false);
        this.e = new p0(this, "first_open_time", 0L);
        com.google.android.gms.common.internal.i0.e("app_install_time");
        this.f11308f = new com.bumptech.glide.manager.q(this, "app_instance_id");
        this.B = new o0(this, "app_backgrounded", false);
        this.C = new o0(this, "deep_link_retrieval_complete", false);
        this.D = new p0(this, "deep_link_retrieval_attempts", 0L);
        this.E = new com.bumptech.glide.manager.q(this, "firebase_feature_rollouts");
        this.F = new com.bumptech.glide.manager.q(this, "deferred_attribution_cache");
        this.G = new p0(this, "deferred_attribution_cache_timestamp", 0L);
        a3.j jVar = new a3.j();
        jVar.f110d = this;
        com.google.android.gms.common.internal.i0.e("default_event_parameters");
        jVar.f107a = "default_event_parameters";
        jVar.f108b = new Bundle();
        this.H = jVar;
    }

    @Override // z7.f1
    public final boolean d() {
        return true;
    }

    public final SharedPreferences g() {
        c();
        e();
        com.google.android.gms.common.internal.i0.i(this.f11306c);
        return this.f11306c;
    }

    public final j1 h() {
        c();
        return j1.b(g().getInt("consent_source", 100), g().getString("consent_settings", "G1"));
    }

    public final void j(boolean z4) {
        c();
        i0 i0Var = ((a1) this.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11198y.c(Boolean.valueOf(z4), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = g().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z4);
        editorEdit.apply();
    }

    public final boolean k(long j4) {
        return j4 - this.f11312u.a() > this.f11316y.a();
    }

    public final boolean l(int i) {
        int i10 = g().getInt("consent_source", 100);
        j1 j1Var = j1.f11214c;
        return i <= i10;
    }
}
