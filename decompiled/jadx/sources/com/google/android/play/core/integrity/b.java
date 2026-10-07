package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class b extends ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k9.v f2657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PendingIntent f2658c;

    @Override // com.google.android.play.core.integrity.ba
    public final ba a(PendingIntent pendingIntent) {
        this.f2658c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ba b(k9.v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.f2657b = vVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ba c(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f2656a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final bb d() {
        k9.v vVar;
        String str = this.f2656a;
        if (str != null && (vVar = this.f2657b) != null) {
            return new bb(str, vVar, this.f2658c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f2656a == null) {
            sb2.append(" token");
        }
        if (this.f2657b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
