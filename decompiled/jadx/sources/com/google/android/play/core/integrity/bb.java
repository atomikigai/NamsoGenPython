package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class bb extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f2660b;

    public bb(String str, k9.v vVar, PendingIntent pendingIntent) {
        this.f2659a = str;
        this.f2660b = new u(vVar, pendingIntent);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f2659a;
    }
}
