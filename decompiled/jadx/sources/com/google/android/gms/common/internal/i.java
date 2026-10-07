package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f2194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f2196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2197d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a8.a f2198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f2199g;

    public i(Set set, r.e eVar, String str, String str2, a8.a aVar) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f2194a = setUnmodifiableSet;
        Map map = eVar == null ? Collections.EMPTY_MAP : eVar;
        this.f2196c = map;
        this.f2197d = str;
        this.e = str2;
        this.f2198f = aVar == null ? a8.a.f243a : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        this.f2195b = Collections.unmodifiableSet(hashSet);
    }
}
