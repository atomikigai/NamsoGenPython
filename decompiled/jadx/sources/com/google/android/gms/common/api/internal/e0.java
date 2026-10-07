package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2077a;

    public e0(h hVar) {
        this.f2077a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z4) {
        zau zauVar = this.f2077a.f2112y;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z4)));
    }
}
