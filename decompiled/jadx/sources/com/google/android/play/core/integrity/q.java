package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class q implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2684a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f2684a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ai
    public final s b() {
        Context context = this.f2684a;
        if (context != null) {
            return new s(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ q(p pVar) {
    }
}
