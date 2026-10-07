package y1;

import fa.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f10478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f10479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f10480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f10481d;

    static {
        l lVar = new l("NO_OP", 0);
        f10478a = lVar;
        l lVar2 = new l("ADD", 1);
        f10479b = lVar2;
        l lVar3 = new l("REMOVE", 2);
        f10480c = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f10481d = lVarArr;
        c1.s(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f10481d.clone();
    }
}
