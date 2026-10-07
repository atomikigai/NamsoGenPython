package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2675a;

    private m() {
    }

    public final m a(Context context) {
        context.getClass();
        this.f2675a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    public final o b() {
        Context context = this.f2675a;
        if (context != null) {
            return new o(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ m(l lVar) {
    }
}
