package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, iVar, obj, (com.google.android.gms.common.api.internal.g) mVar, (com.google.android.gms.common.api.internal.q) nVar);
    }

    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, com.google.android.gms.common.api.internal.g gVar, com.google.android.gms.common.api.internal.q qVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
