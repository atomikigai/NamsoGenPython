package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f2054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f2055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2056d;

    public a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f2054b = iVar;
        this.f2055c = eVar;
        this.f2056d = str;
        this.f2053a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.i0.m(this.f2054b, aVar.f2054b) && com.google.android.gms.common.internal.i0.m(this.f2055c, aVar.f2055c) && com.google.android.gms.common.internal.i0.m(this.f2056d, aVar.f2056d);
    }

    public final int hashCode() {
        return this.f2053a;
    }
}
