package i2;

import fa.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f5141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f5142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f5143d;
    public static final g e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f5144f;

    static {
        g gVar = new g("ON_CONFIGURE", 0);
        f5140a = gVar;
        g gVar2 = new g("ON_CREATE", 1);
        f5141b = gVar2;
        g gVar3 = new g("ON_UPGRADE", 2);
        f5142c = gVar3;
        g gVar4 = new g("ON_DOWNGRADE", 3);
        f5143d = gVar4;
        g gVar5 = new g("ON_OPEN", 4);
        e = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f5144f = gVarArr;
        c1.s(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f5144f.clone();
    }
}
