package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f1863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f1865d;
    public static final /* synthetic */ f[] e;

    static {
        f fVar = new f("IMMEDIATE", 0);
        f1862a = fVar;
        f fVar2 = new f("HIGH", 1);
        f1863b = fVar2;
        f fVar3 = new f("NORMAL", 2);
        f1864c = fVar3;
        f fVar4 = new f("LOW", 3);
        f1865d = fVar4;
        e = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) e.clone();
    }
}
