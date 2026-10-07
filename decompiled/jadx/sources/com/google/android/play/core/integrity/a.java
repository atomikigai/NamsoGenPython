package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class a extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k9.v f2608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PendingIntent f2609c;

    @Override // com.google.android.play.core.integrity.ag
    public final ag a(PendingIntent pendingIntent) {
        this.f2609c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ag b(k9.v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.f2608b = vVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ag c(String str) {
        this.f2607a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ah d() {
        k9.v vVar;
        String str = this.f2607a;
        if (str != null && (vVar = this.f2608b) != null) {
            return new ah(str, vVar, this.f2609c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f2607a == null) {
            sb2.append(" token");
        }
        if (this.f2608b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
